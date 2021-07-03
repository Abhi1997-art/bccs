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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Supplier generated by hbm2java
 */
@Entity
@Table(name = "supplier")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Supplier implements java.io.Serializable {

	private Integer id;
	private String name;
	private String organization;
	private String gstin;
	private String emailIds;
	private String phoneNos;
	private String address;
	private Date createdAt;
	private Byte isActive;

	public Supplier() {
	}

	public Supplier(String name, String organization, String gstin, String emailIds, String phoneNos, String address,
			Date createdAt, Byte isActive) {
		this.name = name;
		this.organization = organization;
		this.gstin = gstin;
		this.emailIds = emailIds;
		this.phoneNos = phoneNos;
		this.address = address;
		this.createdAt = createdAt;
		this.isActive = isActive;
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

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "organization")
	public String getOrganization() {
		return this.organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	@Column(name = "gstin", length = 100)
	public String getGstin() {
		return this.gstin;
	}

	public void setGstin(String gstin) {
		this.gstin = gstin;
	}

	@Column(name = "email_ids", length = 65535)
	public String getEmailIds() {
		return this.emailIds;
	}

	public void setEmailIds(String emailIds) {
		this.emailIds = emailIds;
	}

	@Column(name = "phone_nos", length = 65535)
	public String getPhoneNos() {
		return this.phoneNos;
	}

	public void setPhoneNos(String phoneNos) {
		this.phoneNos = phoneNos;
	}

	@Column(name = "address", length = 65535)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", length = 19)
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Column(name = "is_active")
	public Byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Byte isActive) {
		this.isActive = isActive;
	}

}