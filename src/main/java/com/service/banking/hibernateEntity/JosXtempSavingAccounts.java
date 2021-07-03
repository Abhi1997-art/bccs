package com.service.banking.hibernateEntity;
// Generated Feb 20, 2020 6:19:12 PM by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * JosXtempSavingAccounts generated by hbm2java
 */
@Entity
@Table(name = "jos_xtemp_saving_accounts")
public class JosXtempSavingAccounts implements java.io.Serializable {

	private Integer id;
	private String accountNumber;
	private Integer premiumsPaid;
	private Double penalty;
	private Double amountPaid;
	private Double interestAmount;

	public JosXtempSavingAccounts() {
	}

	public JosXtempSavingAccounts(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public JosXtempSavingAccounts(String accountNumber, Integer premiumsPaid, Double penalty, Double amountPaid,
			Double interestAmount) {
		this.accountNumber = accountNumber;
		this.premiumsPaid = premiumsPaid;
		this.penalty = penalty;
		this.amountPaid = amountPaid;
		this.interestAmount = interestAmount;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "AccountNumber", nullable = false)
	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Column(name = "premiums_paid")
	public Integer getPremiumsPaid() {
		return this.premiumsPaid;
	}

	public void setPremiumsPaid(Integer premiumsPaid) {
		this.premiumsPaid = premiumsPaid;
	}

	@Column(name = "penalty", precision = 22, scale = 0)
	public Double getPenalty() {
		return this.penalty;
	}

	public void setPenalty(Double penalty) {
		this.penalty = penalty;
	}

	@Column(name = "amount_paid", precision = 22, scale = 0)
	public Double getAmountPaid() {
		return this.amountPaid;
	}

	public void setAmountPaid(Double amountPaid) {
		this.amountPaid = amountPaid;
	}

	@Column(name = "interest_amount", precision = 22, scale = 0)
	public Double getInterestAmount() {
		return this.interestAmount;
	}

	public void setInterestAmount(Double interestAmount) {
		this.interestAmount = interestAmount;
	}

}