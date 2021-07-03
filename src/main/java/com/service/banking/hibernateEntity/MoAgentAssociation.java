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
 * MoAgentAssociation generated by hbm2java
 */
@Entity
@Table(name = "mo_agent_association")
public class MoAgentAssociation implements java.io.Serializable {

	private Integer id;
	private Integer moId;
	private Integer agentId;
	private Date fromDate;
	private Date toDate;

	public MoAgentAssociation() {
	}

	public MoAgentAssociation(Integer moId, Integer agentId, Date fromDate, Date toDate) {
		this.moId = moId;
		this.agentId = agentId;
		this.fromDate = fromDate;
		this.toDate = toDate;
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

	@Column(name = "mo_id")
	public Integer getMoId() {
		return this.moId;
	}

	public void setMoId(Integer moId) {
		this.moId = moId;
	}

	@Column(name = "agent_id")
	public Integer getAgentId() {
		return this.agentId;
	}

	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "from_date", length = 19)
	public Date getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "_to_date", length = 19)
	public Date getToDate() {
		return this.toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

}
