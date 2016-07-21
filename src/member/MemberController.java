package member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/member/main.do",
			"/member/detail.do",
			"/member/regist.do",
			"/member/update.do",
			"/member/delete.do",
			"/member/login.do",
			"/member/logout.do",
			"/member/find_by.do",
			"/member/count.do"
			})
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String directory,view;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GET방식으로 접근함");
		this.init(request);
		try {
			this.dispatch(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("POST방식으로 접근함");
		this.init(request);
		MemberService service = MemberServiceImpl.getInstance();
		switch (this.view) {
		case "login":
			String name = service.login(this.init(request));
			request.setAttribute("result", name);
			if(!name.equals("")){
				this.directory="global";
				this.view = "main";
			}
			break;
		case "regist":break;
		default:
			break;
		}
		
		try {
			System.out.println("포스트방식에서 결정된 뷰:"+view);
			
			this.dispatch(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public MemberBean init(HttpServletRequest request) throws ServletException {
		String sPath = request.getServletPath();
		System.out.println("리퀘스트가 가져온 서블릿경로:"+sPath);
		String[] arr = sPath.split("/");
		this.directory = arr[1];
		this.view = arr[2].substring(0, arr[2].indexOf("."));
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		MemberBean m = new MemberBean();
		System.out.println("넘어온 ID,PW :"+id+":"+pw);
		m.setId(id);
		m.setPw(pw);
		return m;
	}
	public void dispatch(HttpServletRequest request, HttpServletResponse response) throws Exception{
		RequestDispatcher dis = request.getRequestDispatcher("/WEB-INF/"+this.directory+"/"+this.view+".jsp");
		dis.forward(request, response);
	}

}
