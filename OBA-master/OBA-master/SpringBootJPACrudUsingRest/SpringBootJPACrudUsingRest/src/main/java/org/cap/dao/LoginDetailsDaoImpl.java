package org.cap.dao;

import org.cap.entities.Login_Details;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import java.util.List;

@Repository
public class LoginDetailsDaoImpl implements LoginDetailsDao {
	@PersistenceContext
	private EntityManager em;

	public LoginDetailsDaoImpl() {
	}

	// to not have same user id for any users
	@Override
	public Login_Details findUserByUser_Id(String user_id) {
		String qStr = "SELECT ld FROM Login_Details ld WHERE ld.user_id= :uid";
		TypedQuery<Login_Details> query = em.createQuery(qStr, Login_Details.class);
		query.setParameter("uid", user_id);
		// System.out.println(query.getSingleResult());
		return query.getSingleResult();
	}

	@Override
	public Login_Details findUserById(String user_id) {
		Login_Details u = em.find(Login_Details.class, user_id);
		return u;
	}

	@Override
	public Login_Details createUser(String acc_no_fk, String user_id, String password, String trans_pass) {
		Login_Details user = new Login_Details();
		user.setAcc_no_fk(acc_no_fk);
		user.setUser_id(user_id);
		user.setPassword(password);
		user.setTrans_pass(trans_pass);
		user = em.merge(user);
		return user;
	}

	/*
	 * @Override public User createUser(String name) { User user=new User();
	 * user.setName(name); user=em.merge(user); return user; }
	 */

	@Override
	public boolean validateCredentials(String user_id, String password) {
		Login_Details user = em.find(Login_Details.class, user_id);
		String pwd = user.getPassword();
		if (pwd.equals(password)) {
			return true;
		} else {
			return false;
		}
		// em.merge(user); return user; }

	}

	/*
	 * @Override public Login_Details updateUser(Integer id, String name) {
	 * Login_Details user = em.find(User.class, id); user.setName(name); user =
	 * em.merge(user); return user; }
	 */
}
