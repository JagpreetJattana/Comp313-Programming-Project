package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controller.DeviceManager;
import controller.UserManager;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/userServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	UserManager umng=new UserManager();
	DeviceManager dmg=new DeviceManager();
	String uname=request.getParameter("uname");
	String pass=request.getParameter("pwd");
	String command=request.getParameter("loginbtn");
	HttpSession session=request.getSession();
	
	boolean authenticate=false;
	if(command.equals("Login")){
		authenticate=umng.authenticate(uname, pass);
		if(authenticate){
			session.setAttribute("currentUser",umng.getUser(uname));
			session.setAttribute("myDevices",dmg.deviceByUser(uname));
			request.setAttribute("msg","Login Succesful");
			RequestDispatcher rd = request.getRequestDispatcher("/main.jsp");
			rd.forward(request, response);
	
		}
		else
		{
			request.setAttribute("msg","User does not exist");
			RequestDispatcher rd = request.getRequestDispatcher("/error.jsp");
			rd.forward(request, response);
	
		}
		
	}
	else if(command.equals("Register")){
		
		RequestDispatcher rd = request.getRequestDispatcher("/register.jsp");
		rd.forward(request, response);
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
