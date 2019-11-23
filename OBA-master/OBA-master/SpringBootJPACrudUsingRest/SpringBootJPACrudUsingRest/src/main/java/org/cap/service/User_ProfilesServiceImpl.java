package org.cap.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.cap.dao.User_ProfilesDao;
import org.cap.entities.User_Profiles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.List;

@Service
@Transactional
public class User_ProfilesServiceImpl implements User_ProfilesService {

	@PersistenceContext
	private EntityManager em;
	
	@Autowired
	private User_ProfilesDao dao;

	public User_ProfilesDao getDao() {
		return dao;
	}

	public void setDao(User_ProfilesDao dao) {
		this.dao = dao;
	}

	
	@Override 
	public User_Profiles findUserById(int user_profile_id) { 
		
		User_Profiles user= dao.findUserById(user_profile_id);
		return user; 
		
	}
	 
	@Override
	public User_Profiles createUser_Profiles(User_Profiles user) { // transaction opened by spring
	 
		user= dao.createUser(user); //transaction closed by spring 
		return user; 
	
	}
	
	@Override
	public User_Profiles createUser_Profiles(String aadhar_no,String f_name,String l_name,String m_name,String fathers_name,long mobile_no,String email_id,Date dob,String res_addr,String per_addr,String occ_details) {
		
		return dao.createUser_Profiles(aadhar_no,f_name,l_name,m_name,fathers_name,mobile_no,email_id,dob, res_addr, per_addr, occ_details);
		
	}
}