package member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import global.Command;
import global.DispatcherServlet;
import global.Separator;
import sun.rmi.server.Dispatcher;

@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("=== member 컨트롤러 진입===");
		Separator.init(request,response);
		MemberService service = MemberServiceImpl.getInstance();
		MemberBean member = new MemberBean();
		System.out.println("액션 ? "+Separator.command.getAction());
		switch (Separator.command.getAction()) {
		case "move":
			DispatcherServlet.send(request, response, Separator.command);
			break;
		case "login":
			member.setId(request.getParameter("id"));
			member.setPw(request.getParameter("pw"));
			String name = service.login(member);
			if(name.equals("fail")){
				System.out.println("컨트롤러 : 로그인실패");
				Separator.command.setPage("login");
				Separator.command.setView();
			}else{
				System.out.println("컨트롤러 : 로그인성공");
			//	member.setName(name);
				request.setAttribute("name", name);
				Separator.command.setDirectory("global");
				Separator.command.setView();
			}
			DispatcherServlet.send(request, response, Separator.command);
			break;
		case "regist":
			member.setId(request.getParameter("id"));
			member.setPw(request.getParameter("pw"));
			member.setName(request.getParameter("name"));
			member.setGenderAndBirth(request.getParameter("ssn"));
			member.setPhone(request.getParameter("phone"));
			
			service.regist(member);
			DispatcherServlet.send(request, response, Separator.command);
			break;
		case "detail":
			service.findById(request.getParameter("id"));
			DispatcherServlet.send(request, response, Separator.command);
			break;
		case "update":
			service.update(member);
			DispatcherServlet.send(request, response, Separator.command);
			break;
		case "delete":
			service.delete(member);
			DispatcherServlet.send(request, response, Separator.command);
			break;
		case "logout":
			service.logout(member);
			DispatcherServlet.send(request, response, Separator.command);
			break;
		case "list":
			service.list();
			DispatcherServlet.send(request, response, Separator.command);
			break;
		case "find_by":
			service.findBy(request.getParameter("keyword"));
			DispatcherServlet.send(request, response, Separator.command);
			break;
		case "count":
			service.count();
			DispatcherServlet.send(request, response, Separator.command);
			break;
		default:
			break;
		}
		
	}
	
}
