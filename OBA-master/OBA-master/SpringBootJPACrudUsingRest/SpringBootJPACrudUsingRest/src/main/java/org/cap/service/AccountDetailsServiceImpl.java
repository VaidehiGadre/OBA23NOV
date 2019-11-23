package org.cap.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.cap.dao.AccountDetailsDao;
import org.cap.entities.Account_Details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AccountDetailsServiceImpl implements AccountDetailsService {
	
	@PersistenceContext
	private EntityManager em;

    @Autowired
    private AccountDetailsDao dao;

    public AccountDetailsDao getDao(){
        return dao;
    }

    public void setDao(AccountDetailsDao dao){
        this.dao=dao;
    }
    
    @Override
   	public Account_Details findUserByAccNo(String acc_no) {
   		return dao.findUserByAccNo(acc_no);
   	}

	@Override
	public Account_Details sendFunds(String acc_no, Integer balance) {
		return dao.sendFunds(acc_no,balance); 
	}
	
	@Override
	public Account_Details receiveFunds(String acc_no, Integer balance) {
		return dao.receiveFunds(acc_no,balance); 
	    
	}
	
	
}	