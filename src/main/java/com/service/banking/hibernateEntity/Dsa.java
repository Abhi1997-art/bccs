package com.service.banking.hibernateEntity;
// Generated Feb 20, 2020 6:19:12 PM by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Dsa generated by hbm2java
 */
@Entity
@Table(name = "dsa")
public class Dsa implements java.io.Serializable {

	private Integer id;
	private Members members;
	private String name;
	private String username;
	private String password;
	private String phoneNo1;
	private String phoneNo2;
	private String emailId1;
	private String emailId2;
	private Set dealerses = new HashSet(0);
	private Set documentsSubmitteds = new HashSet(0);
	private Set dsaGuarantorses = new HashSet(0);

	public Dsa() {
	}

	public Dsa(Members members, String name, String username, String password, String phoneNo1, String phoneNo2,
			String emailId1, String emailId2, Set dealerses, Set documentsSubmitteds, Set dsaGuarantorses) {
		this.members = members;
		this.name = name;
		this.username = username;
		this.password = password;
		this.phoneNo1 = phoneNo1;
		this.phoneNo2 = phoneNo2;
		this.emailId1 = emailId1;
		this.emailId2 = emailId2;
		this.dealerses = dealerses;
		this.documentsSubmitteds = documentsSubmitteds;
		this.dsaGuarantorses = dsaGuarantorses;
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
	@JoinColumn(name = "member_id")
	public Members getMembers() {
		return this.members;
	}

	public void setMembers(Members members) {
		this.members = members;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "username")
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password")
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "phone_no_1")
	public String getPhoneNo1() {
		return this.phoneNo1;
	}

	public void setPhoneNo1(String phoneNo1) {
		this.phoneNo1 = phoneNo1;
	}

	@Column(name = "phone_no_2")
	public String getPhoneNo2() {
		return this.phoneNo2;
	}

	public void setPhoneNo2(String phoneNo2) {
		this.phoneNo2 = phoneNo2;
	}

	@Column(name = "email_id_1")
	public String getEmailId1() {
		return this.emailId1;
	}

	public void setEmailId1(String emailId1) {
		this.emailId1 = emailId1;
	}

	@Column(name = "email_id_2")
	public String getEmailId2() {
		return this.emailId2;
	}

	public void setEmailId2(String emailId2) {
		this.emailId2 = emailId2;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dsa")
	public Set<Dealers> getDealerses() {
		return this.dealerses;
	}

	public void setDealerses(Set dealerses) {
		this.dealerses = dealerses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dsa")
	public Set<DocumentsSubmitted> getDocumentsSubmitteds() {
		return this.documentsSubmitteds;
	}

	public void setDocumentsSubmitteds(Set documentsSubmitteds) {
		this.documentsSubmitteds = documentsSubmitteds;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dsa")
	public Set<DsaGuarantors> getDsaGuarantorses() {
		return this.dsaGuarantorses;
	}

	public void setDsaGuarantorses(Set dsaGuarantorses) {
		this.dsaGuarantorses = dsaGuarantorses;
	}

}
