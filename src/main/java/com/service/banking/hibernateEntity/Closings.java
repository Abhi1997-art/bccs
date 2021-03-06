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
 * Closings generated by hbm2java
 */
@Entity
@Table(name = "closings")
public class Closings implements java.io.Serializable {

	private Integer id;
	private Date daily;
	private Date weekly;
	private Date monthly;
	private Date halfyearly;
	private Date yearly;
	private Integer branchId;

	public Closings() {
	}

	public Closings(Date daily, Date weekly, Date monthly, Date halfyearly, Date yearly, Integer branchId) {
		this.daily = daily;
		this.weekly = weekly;
		this.monthly = monthly;
		this.halfyearly = halfyearly;
		this.yearly = yearly;
		this.branchId = branchId;
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "daily", length = 19)
	public Date getDaily() {
		return this.daily;
	}

	public void setDaily(Date daily) {
		this.daily = daily;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "weekly", length = 19)
	public Date getWeekly() {
		return this.weekly;
	}

	public void setWeekly(Date weekly) {
		this.weekly = weekly;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "monthly", length = 19)
	public Date getMonthly() {
		return this.monthly;
	}

	public void setMonthly(Date monthly) {
		this.monthly = monthly;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "halfyearly", length = 19)
	public Date getHalfyearly() {
		return this.halfyearly;
	}

	public void setHalfyearly(Date halfyearly) {
		this.halfyearly = halfyearly;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "yearly", length = 19)
	public Date getYearly() {
		return this.yearly;
	}

	public void setYearly(Date yearly) {
		this.yearly = yearly;
	}

	@Column(name = "branch_id")
	public Integer getBranchId() {
		return this.branchId;
	}

	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
	}

}
