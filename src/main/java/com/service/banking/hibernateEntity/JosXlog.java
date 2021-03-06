package com.service.banking.hibernateEntity;
// Generated Feb 20, 2020 6:19:12 PM by Hibernate Tools 5.2.12.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * JosXlog generated by hbm2java
 */
@Entity
@Table(name = "jos_xlog")
public class JosXlog implements java.io.Serializable {

	private Integer id;
	private String message;
	private Date createdAt;
	private Date updatedAt;
	private int accountsId;
	private Integer branchId;
	private int staffId;

	public JosXlog() {
	}

	public JosXlog(int accountsId, int staffId) {
		this.accountsId = accountsId;
		this.staffId = staffId;
	}

	public JosXlog(String message, Date createdAt, Date updatedAt, int accountsId, Integer branchId, int staffId) {
		this.message = message;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.accountsId = accountsId;
		this.branchId = branchId;
		this.staffId = staffId;
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

	@Column(name = "Message", length = 65535)
	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", length = 19)
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_at", length = 19)
	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Column(name = "accounts_id", nullable = false)
	public int getAccountsId() {
		return this.accountsId;
	}

	public void setAccountsId(int accountsId) {
		this.accountsId = accountsId;
	}

	@Column(name = "branch_id")
	public Integer getBranchId() {
		return this.branchId;
	}

	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
	}

	@Column(name = "staff_id", nullable = false)
	public int getStaffId() {
		return this.staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

}
