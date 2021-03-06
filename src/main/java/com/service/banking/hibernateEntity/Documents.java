package com.service.banking.hibernateEntity;
// Generated Feb 20, 2020 6:19:12 PM by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Documents generated by hbm2java
 */
@Entity
@JsonInclude(Include.NON_NULL)
@Table(name = "documents")
public class Documents implements java.io.Serializable {

	private Integer id;
	private String name;
	private Boolean savingAccount;
	private Boolean fixedMisaccount;
	private Boolean loanAccount;
	private Boolean rdandDdsaccount;
	private Boolean ccaccount;
	private Boolean otherAccounts;
	private Boolean memberDocuments;
	private Boolean agentDocuments;
	private Boolean dsadocuments;
	private Boolean agentGuarantor;
	private Boolean dsaguarantor;
	private Boolean isAddableByStaff;
	private Boolean isEditableByStaff;
	private Byte isActive;

	public Documents() {
	}

	
	
	public Documents(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	public Documents(String name, Boolean savingAccount, Boolean fixedMisaccount, Boolean loanAccount,
			Boolean rdandDdsaccount, Boolean ccaccount, Boolean otherAccounts, Boolean memberDocuments,
			Boolean agentDocuments, Boolean dsadocuments, Boolean agentGuarantor, Boolean dsaguarantor,
			Boolean isAddableByStaff, Boolean isEditableByStaff, Byte isActive) {
		this.name = name;
		this.savingAccount = savingAccount;
		this.fixedMisaccount = fixedMisaccount;
		this.loanAccount = loanAccount;
		this.rdandDdsaccount = rdandDdsaccount;
		this.ccaccount = ccaccount;
		this.otherAccounts = otherAccounts;
		this.memberDocuments = memberDocuments;
		this.agentDocuments = agentDocuments;
		this.dsadocuments = dsadocuments;
		this.agentGuarantor = agentGuarantor;
		this.dsaguarantor = dsaguarantor;
		this.isAddableByStaff = isAddableByStaff;
		this.isEditableByStaff = isEditableByStaff;
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

	@Column(name = "SavingAccount")
	public Boolean getSavingAccount() {
		return this.savingAccount;
	}

	public void setSavingAccount(Boolean savingAccount) {
		this.savingAccount = savingAccount;
	}

	@Column(name = "FixedMISAccount")
	public Boolean getFixedMisaccount() {
		return this.fixedMisaccount;
	}

	public void setFixedMisaccount(Boolean fixedMisaccount) {
		this.fixedMisaccount = fixedMisaccount;
	}

	@Column(name = "LoanAccount")
	public Boolean getLoanAccount() {
		return this.loanAccount;
	}

	public void setLoanAccount(Boolean loanAccount) {
		this.loanAccount = loanAccount;
	}

	@Column(name = "RDandDDSAccount")
	public Boolean getRdandDdsaccount() {
		return this.rdandDdsaccount;
	}

	public void setRdandDdsaccount(Boolean rdandDdsaccount) {
		this.rdandDdsaccount = rdandDdsaccount;
	}

	@Column(name = "CCAccount")
	public Boolean getCcaccount() {
		return this.ccaccount;
	}

	public void setCcaccount(Boolean ccaccount) {
		this.ccaccount = ccaccount;
	}

	@Column(name = "OtherAccounts")
	public Boolean getOtherAccounts() {
		return this.otherAccounts;
	}

	public void setOtherAccounts(Boolean otherAccounts) {
		this.otherAccounts = otherAccounts;
	}

	@Column(name = "MemberDocuments")
	public Boolean getMemberDocuments() {
		return this.memberDocuments;
	}

	public void setMemberDocuments(Boolean memberDocuments) {
		this.memberDocuments = memberDocuments;
	}

	@Column(name = "AgentDocuments")
	public Boolean getAgentDocuments() {
		return this.agentDocuments;
	}

	public void setAgentDocuments(Boolean agentDocuments) {
		this.agentDocuments = agentDocuments;
	}

	@Column(name = "DSADocuments")
	public Boolean getDsadocuments() {
		return this.dsadocuments;
	}

	public void setDsadocuments(Boolean dsadocuments) {
		this.dsadocuments = dsadocuments;
	}

	@Column(name = "AgentGuarantor")
	public Boolean getAgentGuarantor() {
		return this.agentGuarantor;
	}

	public void setAgentGuarantor(Boolean agentGuarantor) {
		this.agentGuarantor = agentGuarantor;
	}

	@Column(name = "DSAGuarantor")
	public Boolean getDsaguarantor() {
		return this.dsaguarantor;
	}

	public void setDsaguarantor(Boolean dsaguarantor) {
		this.dsaguarantor = dsaguarantor;
	}

	@Column(name = "is_addable_by_staff")
	public Boolean getIsAddableByStaff() {
		return this.isAddableByStaff;
	}

	public void setIsAddableByStaff(Boolean isAddableByStaff) {
		this.isAddableByStaff = isAddableByStaff;
	}

	@Column(name = "is_editable_by_staff")
	public Boolean getIsEditableByStaff() {
		return this.isEditableByStaff;
	}

	public void setIsEditableByStaff(Boolean isEditableByStaff) {
		this.isEditableByStaff = isEditableByStaff;
	}

	@Column(name = "is_active")
	public Byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Byte isActive) {
		this.isActive = isActive;
	}

}
