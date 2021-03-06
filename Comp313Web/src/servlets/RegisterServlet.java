package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comp313.model.User;
import controller.UserManager;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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
	String command=request.getParameter("regbtn");
	
	if(command.equals("Register")){
		
		String userId=request.getParameter("uId");
		String fname=request.getParameter("fName");
		String lname=request.getParameter("lName");
		String pass=request.getParameter("password");
		String cpass=request.getParameter("confirmPassword");
		String houseNo=request.getParameter("houseNO");
		String street=request.getParameter("street");
		String city=request.getParameter("city");
		String province=request.getParameter("province");
		String country=request.getParameter("country");
		String postal=request.getParameter("postalCode");
		String contact=request.getParameter("contact");
		String email=request.getParameter("eMail");
		
		if((userId.equals(""))||(fname.equals(""))||(lname.equals(""))||(pass.equals(""))||(cpass.equals(""))||(houseNo.equals(""))||(street.equals(""))||(city.equals(""))||(province.equals(""))||(country.equals(""))||(postal.equals(""))||(contact.equals(""))||(email.equals("")))
		{
			
			request.setAttribute("msg","Please fill in required feilds");
			RequestDispatcher rd = request.getRequestDispatcher("/error.jsp");
			rd.forward(request, response);
		}
		
		else if(umng.alreadyExist(userId)){
			
			//user already exists with this username
			request.setAttribute("msg","Username Already exist");
			RequestDispatcher rd = request.getRequestDispatcher("/error.jsp");
			rd.forward(request, response);
			
			
		}
		else if(!pass.equals(cpass)){
			//send error password do not match
			request.setAttribute("msg","Passwords do not match");
			RequestDispatcher rd = request.getRequestDispatcher("/error.jsp");
			rd.forward(request, response);
			
		}
		
		else{
			//add user to the database
			User usr=new User(fname,lname);
			usr.setU_ID(userId);
			usr.setU_Pswd(pass);
			usr.setCity(city);
			usr.setContact(contact);
			usr.setCountry(country);
			usr.setEmail(email);
			usr.setH_No(houseNo);
			usr.setStrt(street);
			usr.setProvince(province);
			usr.setPostal(postal);
			
			umng.addUser(usr);
			
			//go to welcome page and some congratulations message
			request.setAttribute("msg","User added successfully");
			RequestDispatcher rd = request.getRequestDispatcher("/error.jsp");
			rd.forward(request, response);
		}
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
