package org.cap.dao;
import org.cap.entities.Transaction_Details;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
/*import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.sql.Date;*/
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
@Repository
public class TransactionDetailsDaoImpl implements TransactionDetailsDao {
	
	
	@PersistenceContext
    private EntityManager em;

	public TransactionDetailsDaoImpl() {
		
	}
	 
	@Override
    public Transaction_Details createtrans(String sender_acc_no, String receiver_acc_no, Integer amount) {
        Transaction_Details usert=new Transaction_Details();
        
        usert.setSender_acc_no(sender_acc_no);
        usert.setReceiver_acc_no(receiver_acc_no);
        usert.setAmount(amount);
        
        /*DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yy");
    	LocalDate localDate = LocalDate.now();
    	date_of_transfer=dtf.format(localDate);
        usert.setDate_of_transfer(date_of_transfer);*/
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date)); //2016/11/16 12:08:43
		usert.setDate_of_transfer(date);
        usert=em.merge(usert);
        return usert;
    }
}
