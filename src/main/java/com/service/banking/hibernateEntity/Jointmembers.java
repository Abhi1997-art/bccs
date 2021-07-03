package com.service.banking.hibernateEntity;
// Generated Feb 20, 2020 6:19:12 PM by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Jointmembers generated by hbm2java
 */
@Entity
@Table(name = "jointmembers")
public class Jointmembers implements java.io.Serializable {

	private Integer id;
	private Accounts accounts;
	private Members members;

	public Jointmembers() {
	}

	public Jointmembers(Accounts accounts, Members members) {
		this.accounts = accounts;
		this.members = members;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "account_id")
	public Accounts getAccounts() {
		return this.accounts;
	}

	public void setAccounts(Accounts accounts) {
		this.accounts = accounts;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "member_id")
	public Members getMembers() {
		return this.members;
	}

	public void setMembers(Members members) {
		this.members = members;
	}

}
