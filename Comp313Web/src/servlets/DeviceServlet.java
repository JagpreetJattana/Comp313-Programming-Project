package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comp313.model.Device;
import controller.DeviceManager;

/**
 * Servlet implementation class DeviceServlet
 */
@WebServlet("/deviceServlet")
public class DeviceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeviceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
		System.out.print("out if");
		DeviceManager dmg=new DeviceManager();
		Device d;
		String command=request.getParameter("addbtn");
		if(command.equals("ADD")){
			String d_ID=request.getParameter("dID");
			String d_Name=request.getParameter("dName");
			String d_longi=request.getParameter("longi");
			String d_leti=request.getParameter("leti");

			d= new Device();
			
			d.setD_ID(d_ID);
			d.setD_name(d_Name);
			d.setLeti(d_leti);
			d.setLongi(d_longi);
			dmg.addDevice(d);
			
			RequestDispatcher rd = request.getRequestDispatcher("/next.jsp");
			rd.forward(request, response);
			System.out.print("in if");
		}
		else{
			
			System.out.print("sdf");
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
