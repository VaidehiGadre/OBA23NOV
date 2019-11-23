package org.cap.dao;

import org.cap.entities.User_Profiles;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import java.sql.Date;
import java.util.List;

@Repository
public class User_ProfilesDaoImpl implements User_ProfilesDao {
	
	@PersistenceContext
	private EntityManager em;

	public User_ProfilesDaoImpl() {
	}
		
	
	@Override 
	public User_Profiles findUserById(int user_profile_id) { 
		  
		User_Profiles u= em.find(User_Profiles.class,user_profile_id);
		return u;
		  
	}
	
	@Override 
	public User_Profiles createUser(User_Profiles uProfile){
		  
		uProfile=em.merge(uProfile); 
		return uProfile; 
		  
	}
	
	@Override
	public User_Profiles createUser_Profiles(String aadhar_no,String f_name,String l_name,String m_name,String fathers_name,long mobile_no,String email_id,Date dob,String res_addr,String per_addr,String occ_details){
		System.out.println("inside dao");
		User_Profiles uProfile = new User_Profiles();
		uProfile.setAadhar_no(aadhar_no);
		uProfile.setF_name(f_name);
		uProfile.setL_name(l_name);
		uProfile.setM_name(m_name);
		uProfile.setFathers_name(fathers_name);
		uProfile.setMobile_no(mobile_no);
		uProfile.setEmail_id(email_id);
		uProfile.setDob(dob);
		uProfile.setRes_addr(res_addr);
		uProfile.setPer_addr(per_addr);
		uProfile.setOcc_details(occ_details);
		uProfile = em.merge(uProfile);
		return uProfile;
	}
		
}
	




