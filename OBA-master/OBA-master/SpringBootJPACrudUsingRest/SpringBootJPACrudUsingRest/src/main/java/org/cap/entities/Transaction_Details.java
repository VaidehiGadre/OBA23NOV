package org.cap.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "transaction_details")

public class Transaction_Details implements Serializable
{
	@Id
	@GeneratedValue
	private Integer trans_id;
	private String sender_acc_no;
	private String receiver_acc_no;
	private Integer amount;
	private Date date_of_transfer;
	

	public Integer getTrans_id() {
		return trans_id;
	}
	public void setTrans_id(Integer trans_id) {
		this.trans_id = trans_id;
	}
	public String getSender_acc_no() {
		return sender_acc_no;
	}
	public void setSender_acc_no(String sender_acc_no) {
		this.sender_acc_no = sender_acc_no;
	}
	public String getReceiver_acc_no() {
		return receiver_acc_no;
	}
	public void setReceiver_acc_no(String receiver_acc_no) {
		this.receiver_acc_no = receiver_acc_no;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	public Date getDate_of_transfer() {
		return date_of_transfer;
	}
	public void setDate_of_transfer(Date date_of_transfer) {
		this.date_of_transfer = date_of_transfer;
	}
	public Transaction_Details(Integer trans_id, String sender_acc_no, String receiver_acc_no, Integer amount,
			Date date_of_transfer) {
		super();
		this.trans_id = trans_id;
		this.sender_acc_no = sender_acc_no;
		this.receiver_acc_no = receiver_acc_no;
		this.amount = amount;
		this.date_of_transfer = date_of_transfer;
	}
	public Transaction_Details() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
    public boolean equals(Object obj) {
      if(obj==this){
          return true;
      }
      if(obj==null || !(obj instanceof Transaction_Details)){
          return false;
      }
      Transaction_Details udd=(Transaction_Details)obj;
      return udd.trans_id.equals(this.trans_id);
    }


    @Override
    public int hashCode() {
        if(trans_id==null){
            return 0;
        }
        return trans_id.hashCode();
    }

	
	

}
