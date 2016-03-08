package web.api;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import comp313.model.Device;
import comp313.model.User;
import controller.DeviceManager;
import controller.UserManager;

@Path("/first/{username}/{password}")
public class MyApi {

	UserManager usrmng = new UserManager();
	DeviceManager dvmn=new DeviceManager();
	Device d;
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public boolean returnResult(@PathParam("username") String username,@PathParam("password") String password){
		
		return usrmng.authenticate(username, password);
		//return true;
	}
	/*public List<Device> returnTitle(){
		
		//return "<p>My First Services<p>";
		return dvmn.deviceByUser("user");
	}*/
	/*@Path("/add/{deviceId}/{deviceName}/{username}/{leti}/{longi}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String addDevice(@PathParam("deviceId") String deviceId,@PathParam("deviceName") String deviceName,@PathParam("username") String username,@PathParam("leti") String leti,@PathParam("longi") String longi){
		d=new Device();
		d.setD_ID(deviceId);
		d.setD_name(deviceName);
		d.setU_ID(username);
		d.setLeti(leti);
		d.setLongi(longi);
		dvmn.addDevice(d);
		return "Device Added";
		//return true;
	}
	*/
}
