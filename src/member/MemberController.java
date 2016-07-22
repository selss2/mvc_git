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
		switch (Separator.command.getAction()) {
		case "move":break;
		case "login":break;
		case "regist":break;
		default:
			break;
		}
		DispatcherServlet.send(request, response, Separator.command);
	}
	
}
