package org.cap.dao;

import java.sql.Date;

import org.cap.entities.User_Profiles;

public interface User_ProfilesDao {

	User_Profiles findUserById(int user_profile_id);
	User_Profiles createUser(User_Profiles user);
	User_Profiles createUser_Profiles(String aadhar_no, String f_name, String l_name, String m_name, String fathers_name, long mobile_no, String email_id, Date dob, String res_addr, String per_addr, String occ_details);

}
