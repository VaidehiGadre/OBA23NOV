package org.cap.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity

@Table(name = "User_Profiles")

public class User_Profiles implements Serializable {

	@Id
	
	@GeneratedValue 						/* (strategy = GenerationType.AUTO) */
	private Integer user_profile_id;
	public Integer getUser_profile_id() {
		
		return user_profile_id;
		
	}
	public void setUser_profile_id(final Integer user_profile_id) {

		this.user_profile_id = user_profile_id;

	}
	
	
	private String aadhar_no;
	public String getAadhar_no() {

		return aadhar_no;

	}
	public void setAadhar_no(final String aadhar_no) {

		this.aadhar_no = aadhar_no;

	}
	
	
	private String f_name;
	public String getF_name() {

		return f_name;

	}
	public void setF_name(final String f_name) {

		this.f_name = f_name;

	}
	
	
	
	
	private String l_name;
	public String getL_name() {

		return l_name;

	}
	public void setL_name(final String l_name) {

		this.l_name = l_name;

	}
	
	
	private String m_name;
	public String getM_name() {

		return m_name;

	}
	public void setM_name(final String m_name) {

		this.m_name = m_name;

	}
	
	
	private String fathers_name;
	public String getFathers_name() {

		return fathers_name;

	}
	public void setFathers_name(final String fathers_name) {

		this.fathers_name = fathers_name;

	}
	
	
	private long mobile_no;
	public long getMobile_no() {

		return mobile_no;

	}

	public void setMobile_no(final long mobile_no) {

		this.mobile_no = mobile_no;

	}

	private String email_id;
	public String getEmail_id() {

		return email_id;

	}

	public void setEmail_id(final String email_id) {

		this.email_id = email_id;

	}
	
	
	private Date dob;
	public Date getDob() {

		return dob;

	}

	public void setDob(final Date dob) {

		this.dob = dob;

	}
	
	
	private String res_addr;
	public String getRes_addr() {

		return res_addr;

	}

	public void setRes_addr(final String res_addr) {

		this.res_addr = res_addr;

	}
	
	
	private String per_addr;
	public String getPer_addr() {

		return per_addr;

	}

	public void setPer_addr(final String per_addr) {

		this.per_addr = per_addr;

	}
	
	
	private String occ_details;
	public String getOcc_details() {

		return occ_details;

	}

	public void setOcc_details(final String occ_details) {

		this.occ_details = occ_details;

	}

	

	
	public User_Profiles(Integer user_profile_id, String aadhar_no, String f_name, String l_name, String m_name,String fathers_name, long mobile_no, String email_id, Date dob, String res_addr, String per_addr,String occ_details) {
		
		this.user_profile_id = user_profile_id;
		this.aadhar_no = aadhar_no;
		this.f_name = f_name;
		this.l_name = l_name;
		this.m_name = m_name;
		this.fathers_name = fathers_name;
		this.mobile_no = mobile_no;
		this.email_id = email_id;
		this.dob = dob;
		this.res_addr = res_addr;
		this.per_addr = per_addr;
		this.occ_details = occ_details;
		
	}

	public User_Profiles() {

	}


	@Override

	public boolean equals(Object obj) {

		if (obj == this) {

			return true;

		}

		if (obj == null || !(obj instanceof User_Profiles)) {

			return false;

		}

		User_Profiles uProfile = (User_Profiles) obj;

		return uProfile.user_profile_id.equals(this.user_profile_id);

	}

	@Override

	public int hashCode() {

		if (user_profile_id == null) {

			return 0;

		}

		return user_profile_id.hashCode();

	}

}