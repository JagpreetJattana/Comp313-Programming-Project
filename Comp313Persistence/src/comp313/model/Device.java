package comp313.model;

import java.io.Serializable;
import javax.persistence.*;

//Connecting to Database
/**
 * Entity implementation class for Entity: Device

Getting Device Information
 *
 */
@Entity
@Table(name="DEVICE", schema="COMP313")
@NamedQueries({
@NamedQuery(name="get.alldevices",query="select d from Device d"),
@NamedQuery(name="deviceByUser",query="select d from Device d where d.U_ID=:usr"),})

public class Device implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="DEVICEID")
	private String D_ID;
	@Column(name="DEVICENAME")
	private String D_name;
	@Column(name="LETI")
	private String leti;
	@Column(name="LONGI")
	private String longi;
	@Column(name="USERID")
	private String U_ID;

	public String getU_ID() {
		return U_ID;
	}

	public void setU_ID(String u_ID) {
		U_ID = u_ID;
	}

	public String getD_ID() {
		return D_ID;
	}

	public void setD_ID(String d_ID) {
		D_ID = d_ID;
	}

	public String getD_name() {
		return D_name;
	}

	public void setD_name(String d_name) {
		D_name = d_name;
	}

	public String getLeti() {
		return leti;
	}

	public void setLeti(String leti) {
		this.leti = leti;
	}

	public String getLongi() {
		return longi;
	}

	public void setLongi(String longi) {
		this.longi = longi;
	}

	public Device() {
		super();
	}
   
}
