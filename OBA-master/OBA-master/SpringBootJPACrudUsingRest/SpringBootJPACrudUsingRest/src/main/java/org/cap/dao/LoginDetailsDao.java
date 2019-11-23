package org.cap.dao;

import org.cap.entities.Login_Details;

public interface LoginDetailsDao {

	Login_Details createUser(String acc_no_fk, String user_id, String password, String trans_pass);
	Login_Details findUserById(String user_id);
	// Login_Details createUser(String username);
	Login_Details findUserByUser_Id(String user_id); //to check if its present
	
	boolean validateCredentials(String user_id,String password);	
	
	// User updateUser(Integer id, String name);

}
