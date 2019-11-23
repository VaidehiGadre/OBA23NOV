package org.cap.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "account_details")

public class Account_Details implements Serializable {
	 @Id
	 private String acc_no;
	 private String acc_type;
	 private Integer balance;
	 private Integer user_profile_id_fk;
	public String getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(String acc_no) {
		this.acc_no = acc_no;
	}
	public String getAcc_type() {
		return acc_type;
	}
	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}
	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	public Integer getUser_profile_id_fk() {
		return user_profile_id_fk;
	}
	public void setUser_profile_id_fk(Integer user_profile_id_fk) {
		this.user_profile_id_fk = user_profile_id_fk;
	}
	public Account_Details(String acc_no, String acc_type, Integer balance, Integer user_profile_id_fk) {
		super();
		this.acc_no = acc_no;
		this.acc_type = acc_type;
		this.balance = balance;
		this.user_profile_id_fk = user_profile_id_fk;
	}
	public Account_Details() {
		
		// TODO Auto-generated constructor stub
	}	
	 
	 @Override
	    public boolean equals(Object obj) {
	      if(obj==this){
	          return true;
	      }
	      if(obj==null || !(obj instanceof Account_Details)){
	          return false;
	      }
	      Account_Details ud=(Account_Details)obj;
	      return ud.acc_no.equals(this.acc_no);
	    }


	    @Override
	    public int hashCode() {
	        if(acc_no==null){
	            return 0;
	        }
	        return acc_no.hashCode();
	    }
	
	
}
