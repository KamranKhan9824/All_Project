package pp1_Validlogin;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Dashboard
 */
public class Dashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("<html><text>");
		PrintWriter out=response.getWriter();
		RequestDispatcher rd=null;
		
		String username=request.getParameter("uname");
		String password=request.getParameter("pass");
		
		if(username!=null && username.equalsIgnoreCase("khan") && password!=null && password.equalsIgnoreCase("khan@123")) {
			 rd=request.getRequestDispatcher("Success");
			rd.forward(request, response);
		}
		else {
			rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);
			out.println("Invalid ID & Password");
		}
		String url=request.getRequestURI().toString();
		PrintWriter pw=response.getWriter();
		pw.println("<a href=Logout?>logout</a>");
		
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
