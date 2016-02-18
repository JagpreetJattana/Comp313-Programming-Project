package controller;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import comp313.model.User;

/*This class handles all the operations related to user*/


public class UserManager {

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
	
	public UserManager() //throws DataSourceNameException, DataSourceConnectException 
	{
		enMan=emf.createEntityManager();
	}
	
	public boolean alreadyExist(String userID){
		enMan=emf.createEntityManager();
		User usr=enMan.find(User.class,userID);
		if(usr==null){
			return false;
			}
		else{
			return true;
		}
		
	}
	
	public User getUser(String uid){
		enMan=emf.createEntityManager();
		User u=enMan.find(User.class,uid);
		return u;
	}
	
	public void addUser(User u){
		enMan=emf.createEntityManager();
		EntityTransaction et = enMan.getTransaction();
		et.begin();
		enMan.persist(u);	
		et.commit();
		
	
	}
	
	public boolean authenticate(String username,String pwd){
		enMan=emf.createEntityManager();
		User usr=enMan.find(User.class,username);
		if(usr==null){
			return false;			
		}
		else{
			if(usr.getU_Pswd().equals(pwd)){
				return true;
			}else{
				return false;
			}
		}
		
		
	}

}
