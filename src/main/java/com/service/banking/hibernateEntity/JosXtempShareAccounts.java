package com.service.banking.hibernateEntity;
// Generated Feb 20, 2020 6:19:12 PM by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * JosXtempShareAccounts generated by hbm2java
 */
@Entity
@Table(name = "jos_xtemp_share_accounts")
public class JosXtempShareAccounts implements java.io.Serializable {

	private Integer id;
	private String memberid;
	private String name;
	private String amountToDeposit;
	private String branchid;
	private String taskdone;

	public JosXtempShareAccounts() {
	}

	public JosXtempShareAccounts(String memberid, String name, String amountToDeposit, String branchid,
			String taskdone) {
		this.memberid = memberid;
		this.name = name;
		this.amountToDeposit = amountToDeposit;
		this.branchid = branchid;
		this.taskdone = taskdone;
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

	@Column(name = "memberid", length = 100)
	public String getMemberid() {
		return this.memberid;
	}

	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}

	@Column(name = "Name", length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "amountToDeposit", length = 100)
	public String getAmountToDeposit() {
		return this.amountToDeposit;
	}

	public void setAmountToDeposit(String amountToDeposit) {
		this.amountToDeposit = amountToDeposit;
	}

	@Column(name = "branchid", length = 100)
	public String getBranchid() {
		return this.branchid;
	}

	public void setBranchid(String branchid) {
		this.branchid = branchid;
	}

	@Column(name = "taskdone", length = 100)
	public String getTaskdone() {
		return this.taskdone;
	}

	public void setTaskdone(String taskdone) {
		this.taskdone = taskdone;
	}

}