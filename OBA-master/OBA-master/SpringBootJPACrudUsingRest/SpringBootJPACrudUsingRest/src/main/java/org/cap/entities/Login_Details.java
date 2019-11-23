package org.cap.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.Size;

import java.io.Serializable;

@Entity
@Table(name = "Login_Details")
public class Login_Details implements Serializable {

	@Id

	private String user_id;
	//@Size(min=6,message="required")
	private String password;
	//@Size(min=6,message="required")
	private String trans_pass;
	private String acc_no_fk;

	public String getAcc_no_fk() {
		return acc_no_fk;
	}

	public void setAcc_no_fk(String acc_no_fk) {
		this.acc_no_fk = acc_no_fk;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTrans_pass() {
		return trans_pass;
	}

	public void setTrans_pass(String trans_pass) {
		this.trans_pass = trans_pass;
	}

	public Login_Details(String acc_no_fk, String user_id, String password, String trans_pass) {
		this.acc_no_fk = acc_no_fk;
		this.user_id = user_id;
		this.password = password;
		this.trans_pass = trans_pass;
	}

	public Login_Details() {

	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null || !(obj instanceof Login_Details)) {
			return false;
		}
		Login_Details u = (Login_Details) obj;
		return u.user_id.equals(this.user_id);
	}

}
