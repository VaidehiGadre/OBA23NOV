package org.cap.service;
import org.cap.entities.Transaction_Details;

public interface TransactionDetailsService {
	Transaction_Details createtrans(String sender_acc_no, String receiver_acc_no, Integer amount);

}
