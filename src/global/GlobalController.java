package global;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/global/main.do","/global/school_info.do"})
public class GlobalController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("서블릿 입장..");
		String servletPath = request.getServletPath();
		System.out.println("서블릿 경로"+servletPath);
		String pkg = servletPath.split("/")[1];
		System.out.println("가야할 폴더 : "+pkg);
		String path = servletPath.split("/")[2];
		String view = path.substring(0, path.indexOf("."));
		System.out.println("가야할 경로 : "+view);
		RequestDispatcher dis = 
				request.getRequestDispatcher("/WEB-INF/"+pkg+"/"+view+".jsp");
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
