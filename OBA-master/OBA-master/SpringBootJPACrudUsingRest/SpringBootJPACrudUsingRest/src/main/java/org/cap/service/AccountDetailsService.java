package org.cap.service;

import org.cap.entities.Account_Details;

public interface AccountDetailsService {

	Account_Details findUserByAccNo(String acc_no);
	Account_Details sendFunds(String acc_no, Integer balance);
	Account_Details receiveFunds(String acc_no, Integer balance);
	
}
