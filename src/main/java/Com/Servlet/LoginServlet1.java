package Com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet1
 */
@WebServlet("/LoginServlet1")
public class LoginServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet1() {
        super();
    	System.out.println("I am in Constructor");
    	}
    	public void init()
    	{
    		System.out.println("I am in init method");
    	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	public void destroy()
	{
		System.out.println("destroy method called");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("uname");
		String password = request.getParameter("password");
		String Email = request.getParameter("Email");
		if(name.equals("ADMIN"))
		if	(name.equals("admin@123"))
			
		{
			ArrayList<String> Ulist = new ArrayList<String>();
			Ulist.add("Aniket");
			Ulist.add("Ruturaj");
			Ulist.add("Shivam");
			Ulist.add("Tushar");
			
			//request.setAttribute("msg","<h3 style='color:green'>Thank for registration");
			request.setAttribute("uname", "uname");
			request.setAttribute("data", Ulist);
			RequestDispatcher rd = request.getRequestDispatcher("Sucess.jsp");
			rd.forward(request, response);
		}
		else
		{
			request.setAttribute("msg","<h3 style='color:green'>Invalid Username! please try again");
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
		}
	}
}
