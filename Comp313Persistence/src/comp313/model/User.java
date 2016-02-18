package comp313.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
Gets all user Info
 *
 */

@Entity
@Table(name="USER", schema="COMP313")
@NamedQuery(name="get.allusers",query="select u from User u")


public class User implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="USERID")
	private String u_ID;
	@Column(name="UPASSWORD")
	private String U_Pswd;
	@Column(name="FNAME")
	private String f_Name;
	@Column(name="LNAME")
	private String l_Name;
	@Column(name="HOUSENO")
	private String h_No;
	@Column(name="STREET")
	private String strt;
	@Column(name="CITY")
	private String city;
	@Column(name="POSTAL")
	private String postal;
	@Column(name="PROVINCE")
	private String province;
	@Column(name="COUNTRY")
	private String country;
	@Column(name="EMAIL")
	private String email;
	@Column(name="CONTACT")
	private String contact;
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String fname,String lname){
		this.f_Name=fname;
		this.l_Name=lname;
		
	}

	public String getU_ID() {
		return u_ID;
	}

	public void setU_ID(String u_ID) {
		this.u_ID = u_ID;
	}

	public String getU_Pswd() {
		return U_Pswd;
	}

	public void setU_Pswd(String u_Pswd) {
		U_Pswd = u_Pswd;
	}

	public String getF_Name() {
		return f_Name;
	}

	public void setF_Name(String f_Name) {
		this.f_Name = f_Name;
	}

	public String getL_Name() {
		return l_Name;
	}

	public void setL_Name(String l_Name) {
		this.l_Name = l_Name;
	}

	public String getH_No() {
		return h_No;
	}

	public void setH_No(String h_No) {
		this.h_No = h_No;
	}

	public String getStrt() {
		return strt;
	}

	public void setStrt(String strt) {
		this.strt = strt;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostal() {
		return postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

   
}
