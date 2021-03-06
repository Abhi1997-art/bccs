package com.service.banking.hibernateEntity;
// Generated Feb 20, 2020 6:19:12 PM by Hibernate Tools 5.2.12.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * JosXevents generated by hbm2java
 */
@Entity
@Table(name = "jos_xevents")
public class JosXevents implements java.io.Serializable {

	private JosXeventsId id;
	private String event;
	private String codeSql;
	private Short sno;
	private String description;
	private Boolean activeStatus;

	public JosXevents() {
	}

	public JosXevents(JosXeventsId id) {
		this.id = id;
	}

	public JosXevents(JosXeventsId id, String event, String codeSql, Short sno, String description,
			Boolean activeStatus) {
		this.id = id;
		this.event = event;
		this.codeSql = codeSql;
		this.sno = sno;
		this.description = description;
		this.activeStatus = activeStatus;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "id", nullable = false)),
			@AttributeOverride(name = "schemesId", column = @Column(name = "schemes_id", nullable = false)) })
	public JosXeventsId getId() {
		return this.id;
	}

	public void setId(JosXeventsId id) {
		this.id = id;
	}

	@Column(name = "Event", length = 45)
	public String getEvent() {
		return this.event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	@Column(name = "CodeSQL", length = 65535)
	public String getCodeSql() {
		return this.codeSql;
	}

	public void setCodeSql(String codeSql) {
		this.codeSql = codeSql;
	}

	@Column(name = "Sno")
	public Short getSno() {
		return this.sno;
	}

	public void setSno(Short sno) {
		this.sno = sno;
	}

	@Column(name = "Description", length = 65535)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "ActiveStatus")
	public Boolean getActiveStatus() {
		return this.activeStatus;
	}

	public void setActiveStatus(Boolean activeStatus) {
		this.activeStatus = activeStatus;
	}

}
