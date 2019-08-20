package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@DynamicUpdate
@Table(name="credit_card")
public class Credit {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String credit_card_number;
	private String expiry_date;
	private String cvv_number;
	
	public Credit() {
		
	}

	public Credit(int id,String credit_card_number, String expiry_date, String cvv_number) {
		super();
		this.id = id;
		this.credit_card_number = credit_card_number;
		this.expiry_date = expiry_date;
		this.cvv_number = cvv_number;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCredit_card_number() {
		return credit_card_number;
	}

	public void setCredit_card_number(String credit_card_number) {
		this.credit_card_number = credit_card_number;
	}

	public String getExpiry_date() {
		return expiry_date;
	}

	public void setExpiry_date(String expiry_date) {
		this.expiry_date = expiry_date;
	}

	public String getCvv_number() {
		return cvv_number;
	}

	public void setCvv_number(String cvv_number) {
		this.cvv_number = cvv_number;
	}

}
