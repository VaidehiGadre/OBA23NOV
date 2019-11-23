package org.cap.dao;

import org.cap.entities.Transaction_Details;


public interface TransactionDetailsDao {
	
	Transaction_Details createtrans(String sender_acc_no, String receiver_acc_no, Integer amount);

}
