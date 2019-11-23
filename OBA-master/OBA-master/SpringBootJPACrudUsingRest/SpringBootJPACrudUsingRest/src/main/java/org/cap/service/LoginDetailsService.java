package org.cap.service;

import org.cap.entities.Login_Details;

public interface LoginDetailsService {

	Login_Details createUser(String acc_no_fk, String user_id, String password, String trans_pass);
	Login_Details findUserById(String user_id);
	Login_Details findUserByUser_Id(String user_id);
	boolean validateCredentials(String user_id,String password);	
}
