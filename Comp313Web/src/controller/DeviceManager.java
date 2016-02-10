package controller;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import comp313.model.Device;
import comp313.model.User;




public class DeviceManager {
	private static InitialContext ctx = null;
	private static EntityManagerFactory emf = null;
	private EntityManager enMan=null;
	
	static{
		try {
			ctx = new InitialContext();
			emf = (EntityManagerFactory) ctx.lookup("java:/Comp313EMF");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	public DeviceManager() {
		// TODO Auto-generated constructor stub
		enMan=emf.createEntityManager();
	}


	public void addDevice(Device d){		
		enMan=emf.createEntityManager();
		EntityTransaction et = enMan.getTransaction();
		et.begin();
		enMan.persist(d);	
		et.commit();

	}
	
	public void removeDevice(String id){
		enMan=emf.createEntityManager();
		EntityTransaction et=enMan.getTransaction();
		Device d=enMan.find(Device.class,id);
		et.begin();
		enMan.remove(d);
		et.commit();
		
	}
	
	public void updateDevice(Device d){
		enMan=emf.createEntityManager();
		EntityTransaction et = enMan.getTransaction();
		et.begin();
		enMan.merge(d);		
		et.commit();

	}
	
	public Device getDevice(String id){
		enMan=emf.createEntityManager();
		Device d=enMan.find(Device.class,id);
		return d;		
	}

	
}