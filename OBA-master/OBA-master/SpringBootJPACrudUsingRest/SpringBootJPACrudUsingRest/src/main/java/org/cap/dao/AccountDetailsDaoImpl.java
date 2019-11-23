package org.cap.dao;
import org.cap.entities.Account_Details;
import org.cap.entities.Login_Details;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

@Repository
public class AccountDetailsDaoImpl implements AccountDetailsDao {

    @PersistenceContext
    private EntityManager em;

    public AccountDetailsDaoImpl(){
    }
    
    @Override
	public Account_Details findUserByAccNo(String acc_no) {
		String qStr = "SELECT ad FROM Account_Details ad WHERE ad.acc_no= :ano";
		TypedQuery<Account_Details> query = em.createQuery(qStr, Account_Details.class);
		query.setParameter("ano", acc_no);
		// System.out.println(query.getSingleResult());
		return query.getSingleResult();
	}
    
	@Override
	public Account_Details sendFunds(String acc_no, Integer balance) {
		Account_Details user=em.find(Account_Details.class,acc_no);
		int bal=user.getBalance();
		bal=bal-balance;
		user.setBalance(bal);
	    user=em.merge(user);
	    return user;
	    
	}
	
	@Override
	public Account_Details receiveFunds(String acc_no, Integer balance) {
		Account_Details user=em.find(Account_Details.class,acc_no);
		int bal=user.getBalance();
		bal=bal+balance;
		user.setBalance(bal);
	    user=em.merge(user);
	    return user;
	    
	}
	
}	
	