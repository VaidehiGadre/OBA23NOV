package org.cap.service;

import org.cap.dao.TransactionDetailsDao;
import org.cap.entities.Transaction_Details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TransactionDetailsServiceImpl implements TransactionDetailsService
{

	@Autowired
	private TransactionDetailsDao dao;
	
	
	public TransactionDetailsDao getDao() {
		return dao;
	}


	public void setDao(TransactionDetailsDao dao) {
		this.dao = dao;
	}


	@Override
	public Transaction_Details createtrans(String sender_acc_no, String receiver_acc_no, Integer amount) {
		// TODO Auto-generated method stub
		return dao.createtrans(sender_acc_no, receiver_acc_no, amount) ;
	}
	
	 

}
