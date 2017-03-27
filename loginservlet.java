

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvcproject.loginservice;
import mvcproject.user;

/**
 * Servlet implementation class loginservlet
 */
@WebServlet("/login")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String uid, passwd;
	uid=request.getParameter("userid");
	passwd=request.getParameter("password");
		loginservice ls=new loginservice();
	boolean result=ls.authenticate(uid, passwd);
	
		if(result){
		user u=loginservice.getuserdetails(uid);
		//request.getSession().setAttribute("user",u);
		request.setAttribute("user", u);
		//response.sendRedirect("success.jsp");
       RequestDispatcher dispatcher=request.getRequestDispatcher("success.jsp");
	   dispatcher.forward(request, response);
       return;
	}
	else{response.sendRedirect("login.jsp");
		// TODO Auto-generated method stub
	}
	}
	}
