package com.flamingo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CreditCard {
	@ManyToOne
	@JoinColumn(name = "profileid")
	private Passenger profile;
	@Column(nullable = false)
	private int card;
	@Column(nullable = false)
	private String cardType;
	@Column(nullable = false)
	private String ex_month;
	@Column(nullable = false)
	private String ex_year;
	
	public Passenger getPayment() {
		return profile;
	}
	public void setPayment(Passenger profile) {
		this.profile = profile;
	}
	public int getCard() {
		return card;
	}
	public void setCard(int card) {
		this.card = card;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getEx_month() {
		return ex_month;
	}
	public void setEx_month(String ex_month) {
		this.ex_month = ex_month;
	}
	public String getEx_year() {
		return ex_year;
	}
	public void setEx_year(String ex_year) {
		this.ex_year = ex_year;
	}
	@Override
	public String toString() {
		return "CreditCard [profile=" + profile + ", card=" + card + ", cardType=" + cardType + ", ex_month=" + ex_month
				+ ", ex_year=" + ex_year + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
