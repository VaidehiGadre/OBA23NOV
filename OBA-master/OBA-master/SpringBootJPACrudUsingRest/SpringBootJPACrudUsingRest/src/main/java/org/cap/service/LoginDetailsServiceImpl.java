package org.cap.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.cap.dao.LoginDetailsDao;
import org.cap.entities.Login_Details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LoginDetailsServiceImpl implements LoginDetailsService {

	@PersistenceContext
	private EntityManager em;

	@Autowired
	private LoginDetailsDao dao;

	public LoginDetailsDao getDao() {
		return dao;
	}

	public void setDao(LoginDetailsDao dao) {
		this.dao = dao;
	}

	@Override
	public Login_Details createUser(String acc_no_fk, String user_id, String password, String trans_pass) {

		return dao.createUser(acc_no_fk, user_id, password, trans_pass);
	}

	@Override
	public Login_Details findUserById(String user_id) {
		return dao.findUserById(user_id);

	}
	
	@Override public Login_Details findUserByUser_Id(String user_id) {
		return dao.findUserByUser_Id(user_id);
	}
	
	@Override public boolean validateCredentials(String user_id,String password) {
		return dao.validateCredentials(user_id, password);
		
		//em.merge(user); return user; }
		
	}
	
	
	
	
}
