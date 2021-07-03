package com.service.banking.hibernateEntity;
// Generated Feb 20, 2020 6:19:12 PM by Hibernate Tools 5.2.12.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * Accounts generated by hbm2java
 */
@Entity
@DynamicUpdate
@JsonInclude(Include.NON_NULL)
@Table(name = "accounts", uniqueConstraints = @UniqueConstraint(columnNames = "AccountNumber"))
public class Accounts implements java.io.Serializable {

	private Integer id;
	private Integer agentId;
	private BigDecimal openingBalanceDr;
	private BigDecimal openingBalanceCr;
	private Double closingBalance;
	private BigDecimal currentBalanceDr;
	private String currentInterest;
	private Boolean activeStatus;
	private String nominee;
	private Short nomineeAge;
	private String relationWithNominee;
	private String minorNomineeDob;
	private String minorNomineeParentName;
	private String modeOfOperation;
	private Integer memberId;
	private Boolean defaultAc;
	private Integer schemeId;
	private String accountNumber;
	private Date createdAt;
	private Date updatedAt;
	private Integer branchId;
	private Integer staffId;
	private BigDecimal currentBalanceCr;
	private Date lastCurrentInterestUpdatedAt;
	private Integer intrestToAccountId;
	private Double amount;
	private Date loanInsurranceDate;
	private Integer dealerId;
	private Boolean lockingStatus;
	private Integer loanAgainstAccountId;
	private Boolean affectsBalanceSheet;
	private Boolean maturedStatus;
	private Integer collectorId;
	private String collectorAccountNumber;
	private String accountDisplayName;
	private String pandLgroup;
	private Integer sigImageId;
	private String groupType;
	private String accountType;
	private String extraInfo;
	private Integer moId;
	private Integer teamId;
	private Integer maturityToAccountId;
	private Integer relatedAccountId;
	private Integer docImageId;
	private Byte isDirty;
	private Byte bikeSurrendered;
	private Date bikeSurrenderedOn;
	private Byte isGivenForLegalProcess;
	private Date legalProcessGivenDate;
	private Byte isInLegal;
	private Byte isGodownchargeDebited;
	private Date godownchargeDebitedOn;
	private Byte isLegalNoticeSentForBikeAuction;
	private Date legalNoticeSentForBikeAuctionOn;
	private Byte isBikeAuctioned;
	private Date bikeAuctionedOn;
	private Byte isFinalRecoveryNoticeSent;
	private Date finalRecoveryNoticeSentOn;
	private Byte isChequePresentedInBank;
	private Date chequePresentedInBankOn;
	private Byte isChequeReturned;
	private Date chequeReturnedOn;
	private Byte isNoticeSentAfterChequeReturned;
	private Date noticeSentAfterChequeReturnedOn;
	private Byte isLegalCaseFinalised;
	private Date legalCaseFinalisedOn;
	private Byte isBikeReturned;
	private Date bikeReturnedOn;
	private String bikeNotSoldReason;
	private String legalCaseNotSubmittedReason;
	private Date legalFilingDate;
	private String repaymentMode;
	private String insuranceTenure;
	private String newOrRenew;
	private String bikeSurrenderedBy;
	private Byte isInArbitration;
	private Date arbitrationOn;
	private Byte isSocietyNoticeSent;
	private Date societyNoticeSentOn;
	private Byte isVisitDone;
	private Date visitDoneOn;
	private Byte isLegalNoticeSent;
	private Date legalNoticeSentOn;
	private Byte isNocHandlingChargeReceived;
	private Date nocHandlingChargeReceivedOn;
	private String lockStatusChangedReason;
	private Integer telecallerId;
	private Integer bankAccountLimit;
	private String relatedType;
	private Integer relatedTypeId;
	private Set agentTdses = new HashSet(0);
	private Set moAccountAssociations = new HashSet(0);
	private Set comments = new HashSet(0);
	private Set<AccountGuarantors> accountGuarantorses = new HashSet(0);
	private Set jointmemberses = new HashSet(0);

	public Accounts() {
	}
	

	public Accounts(Integer id, String accountNumber) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
	}


	public Accounts(Integer memberId, Integer branchId, Integer staffId, Integer dealerId, String pandLgroup, Byte isDirty,
			Byte bikeSurrendered, Byte isInLegal, String insuranceTenure, Integer bankAccountLimit) {
		this.memberId = memberId;
		this.branchId = branchId;
		this.staffId = staffId;
		this.dealerId = dealerId;
		this.pandLgroup = pandLgroup;
		this.isDirty = isDirty;
		this.bikeSurrendered = bikeSurrendered;
		this.isInLegal = isInLegal;
		this.insuranceTenure = insuranceTenure;
		this.bankAccountLimit = bankAccountLimit;
	}

	public Accounts(Integer agentId, BigDecimal openingBalanceDr, BigDecimal openingBalanceCr, Double closingBalance,
			BigDecimal currentBalanceDr, String currentInterest, Boolean activeStatus, String nominee, Short nomineeAge,
			String relationWithNominee, String minorNomineeDob, String minorNomineeParentName, String modeOfOperation,
			Integer memberId, Boolean defaultAc, Integer schemeId, String accountNumber, Date createdAt, Date updatedAt,
			Integer branchId, Integer staffId, BigDecimal currentBalanceCr, Date lastCurrentInterestUpdatedAt,
			Integer intrestToAccountId, Double amount, Date loanInsurranceDate, Integer dealerId, Boolean lockingStatus,
			Integer loanAgainstAccountId, Boolean affectsBalanceSheet, Boolean maturedStatus, Integer collectorId,
			String collectorAccountNumber, String accountDisplayName, String pandLgroup, Integer sigImageId,
			String group, String accountType, String extraInfo, Integer moId, Integer teamId,
			Integer maturityToAccountId, Integer relatedAccountId, Integer docImageId, Byte isDirty,
			Byte bikeSurrendered, Date bikeSurrenderedOn, Byte isGivenForLegalProcess, Date legalProcessGivenDate,
			Byte isInLegal, Byte isGodownchargeDebited, Date godownchargeDebitedOn,
			Byte isLegalNoticeSentForBikeAuction, Date legalNoticeSentForBikeAuctionOn, Byte isBikeAuctioned,
			Date bikeAuctionedOn, Byte isFinalRecoveryNoticeSent, Date finalRecoveryNoticeSentOn,
			Byte isChequePresentedInBank, Date chequePresentedInBankOn, Byte isChequeReturned, Date chequeReturnedOn,
			Byte isNoticeSentAfterChequeReturned, Date noticeSentAfterChequeReturnedOn, Byte isLegalCaseFinalised,
			Date legalCaseFinalisedOn, Byte isBikeReturned, Date bikeReturnedOn, String bikeNotSoldReason,
			String legalCaseNotSubmittedReason, Date legalFilingDate, String repaymentMode, String insuranceTenure,
			String newOrRenew, String bikeSurrenderedBy, Byte isInArbitration, Date arbitrationOn,
			Byte isSocietyNoticeSent, Date societyNoticeSentOn, Byte isVisitDone, Date visitDoneOn,
			Byte isLegalNoticeSent, Date legalNoticeSentOn, Byte isNocHandlingChargeReceived,
			Date nocHandlingChargeReceivedOn, String lockStatusChangedReason, Integer telecallerId,
			Integer bankAccountLimit, String relatedType, Integer relatedTypeId, Set agentTdses, Set moAccountAssociations,
			Set comments, Set<AccountGuarantors> accountGuarantorses, Set jointmemberses) {
		this.agentId = agentId;
		this.openingBalanceDr = openingBalanceDr;
		this.openingBalanceCr = openingBalanceCr;
		this.closingBalance = closingBalance;
		this.currentBalanceDr = currentBalanceDr;
		this.currentInterest = currentInterest;
		this.activeStatus = activeStatus;
		this.nominee = nominee;
		this.nomineeAge = nomineeAge;
		this.relationWithNominee = relationWithNominee;
		this.minorNomineeDob = minorNomineeDob;
		this.minorNomineeParentName = minorNomineeParentName;
		this.modeOfOperation = modeOfOperation;
		this.memberId = memberId;
		this.defaultAc = defaultAc;
		this.schemeId = schemeId;
		this.accountNumber = accountNumber;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.branchId = branchId;
		this.staffId = staffId;
		this.currentBalanceCr = currentBalanceCr;
		this.lastCurrentInterestUpdatedAt = lastCurrentInterestUpdatedAt;
		this.intrestToAccountId = intrestToAccountId;
		this.amount = amount;
		this.loanInsurranceDate = loanInsurranceDate;
		this.dealerId = dealerId;
		this.lockingStatus = lockingStatus;
		this.loanAgainstAccountId = loanAgainstAccountId;
		this.affectsBalanceSheet = affectsBalanceSheet;
		this.maturedStatus = maturedStatus;
		this.collectorId = collectorId;
		this.collectorAccountNumber = collectorAccountNumber;
		this.accountDisplayName = accountDisplayName;
		this.pandLgroup = pandLgroup;
		this.sigImageId = sigImageId;
		this.groupType = group;
		this.accountType = accountType;
		this.extraInfo = extraInfo;
		this.moId = moId;
		this.teamId = teamId;
		this.maturityToAccountId = maturityToAccountId;
		this.relatedAccountId = relatedAccountId;
		this.docImageId = docImageId;
		this.isDirty = isDirty;
		this.bikeSurrendered = bikeSurrendered;
		this.bikeSurrenderedOn = bikeSurrenderedOn;
		this.isGivenForLegalProcess = isGivenForLegalProcess;
		this.legalProcessGivenDate = legalProcessGivenDate;
		this.isInLegal = isInLegal;
		this.isGodownchargeDebited = isGodownchargeDebited;
		this.godownchargeDebitedOn = godownchargeDebitedOn;
		this.isLegalNoticeSentForBikeAuction = isLegalNoticeSentForBikeAuction;
		this.legalNoticeSentForBikeAuctionOn = legalNoticeSentForBikeAuctionOn;
		this.isBikeAuctioned = isBikeAuctioned;
		this.bikeAuctionedOn = bikeAuctionedOn;
		this.isFinalRecoveryNoticeSent = isFinalRecoveryNoticeSent;
		this.finalRecoveryNoticeSentOn = finalRecoveryNoticeSentOn;
		this.isChequePresentedInBank = isChequePresentedInBank;
		this.chequePresentedInBankOn = chequePresentedInBankOn;
		this.isChequeReturned = isChequeReturned;
		this.chequeReturnedOn = chequeReturnedOn;
		this.isNoticeSentAfterChequeReturned = isNoticeSentAfterChequeReturned;
		this.noticeSentAfterChequeReturnedOn = noticeSentAfterChequeReturnedOn;
		this.isLegalCaseFinalised = isLegalCaseFinalised;
		this.legalCaseFinalisedOn = legalCaseFinalisedOn;
		this.isBikeReturned = isBikeReturned;
		this.bikeReturnedOn = bikeReturnedOn;
		this.bikeNotSoldReason = bikeNotSoldReason;
		this.legalCaseNotSubmittedReason = legalCaseNotSubmittedReason;
		this.legalFilingDate = legalFilingDate;
		this.repaymentMode = repaymentMode;
		this.insuranceTenure = insuranceTenure;
		this.newOrRenew = newOrRenew;
		this.bikeSurrenderedBy = bikeSurrenderedBy;
		this.isInArbitration = isInArbitration;
		this.arbitrationOn = arbitrationOn;
		this.isSocietyNoticeSent = isSocietyNoticeSent;
		this.societyNoticeSentOn = societyNoticeSentOn;
		this.isVisitDone = isVisitDone;
		this.visitDoneOn = visitDoneOn;
		this.isLegalNoticeSent = isLegalNoticeSent;
		this.legalNoticeSentOn = legalNoticeSentOn;
		this.isNocHandlingChargeReceived = isNocHandlingChargeReceived;
		this.nocHandlingChargeReceivedOn = nocHandlingChargeReceivedOn;
		this.lockStatusChangedReason = lockStatusChangedReason;
		this.telecallerId = telecallerId;
		this.bankAccountLimit = bankAccountLimit;
		this.relatedType = relatedType;
		this.relatedTypeId = relatedTypeId;
		this.agentTdses = agentTdses;
		this.moAccountAssociations = moAccountAssociations;
		this.comments = comments;
		this.accountGuarantorses = accountGuarantorses;
		this.jointmemberses = jointmemberses;
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

	@Column(name = "agent_id")
	public Integer getAgentId() {
		return this.agentId;
	}

	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}

	@Column(name = "OpeningBalanceDr", precision = 20, scale = 3)
	public BigDecimal getOpeningBalanceDr() {
		return this.openingBalanceDr;
	}

	public void setOpeningBalanceDr(BigDecimal openingBalanceDr) {
		this.openingBalanceDr = openingBalanceDr;
	}

	@Column(name = "OpeningBalanceCr", precision = 20, scale = 3)
	public BigDecimal getOpeningBalanceCr() {
		return this.openingBalanceCr;
	}

	public void setOpeningBalanceCr(BigDecimal openingBalanceCr) {
		this.openingBalanceCr = openingBalanceCr;
	}

	@Column(name = "ClosingBalance", precision = 22, scale = 0)
	public Double getClosingBalance() {
		return this.closingBalance;
	}

	public void setClosingBalance(Double closingBalance) {
		this.closingBalance = closingBalance;
	}

	@Column(name = "CurrentBalanceDr", precision = 20, scale = 3)
	public BigDecimal getCurrentBalanceDr() {
		return this.currentBalanceDr;
	}

	public void setCurrentBalanceDr(BigDecimal currentBalanceDr) {
		this.currentBalanceDr = currentBalanceDr;
	}

	@Column(name = "CurrentInterest", length = 45)
	public String getCurrentInterest() {
		return this.currentInterest;
	}

	public void setCurrentInterest(String currentInterest) {
		this.currentInterest = currentInterest;
	}

	@Column(name = "ActiveStatus")
	public Boolean getActiveStatus() {
		return this.activeStatus;
	}

	public void setActiveStatus(Boolean activeStatus) {
		this.activeStatus = activeStatus;
	}

	@Column(name = "Nominee", length = 45)
	public String getNominee() {
		return this.nominee;
	}

	public void setNominee(String nominee) {
		this.nominee = nominee;
	}

	@Column(name = "NomineeAge")
	public Short getNomineeAge() {
		return this.nomineeAge;
	}

	public void setNomineeAge(Short nomineeAge) {
		this.nomineeAge = nomineeAge;
	}

	@Column(name = "RelationWithNominee", length = 45)
	public String getRelationWithNominee() {
		return this.relationWithNominee;
	}

	public void setRelationWithNominee(String relationWithNominee) {
		this.relationWithNominee = relationWithNominee;
	}

	@Column(name = "MinorNomineeDOB", length = 20)
	public String getMinorNomineeDob() {
		return this.minorNomineeDob;
	}

	public void setMinorNomineeDob(String minorNomineeDob) {
		this.minorNomineeDob = minorNomineeDob;
	}

	@Column(name = "MinorNomineeParentName", length = 45)
	public String getMinorNomineeParentName() {
		return this.minorNomineeParentName;
	}

	public void setMinorNomineeParentName(String minorNomineeParentName) {
		this.minorNomineeParentName = minorNomineeParentName;
	}

	@Column(name = "ModeOfOperation", length = 6)
	public String getModeOfOperation() {
		return this.modeOfOperation;
	}

	public void setModeOfOperation(String modeOfOperation) {
		this.modeOfOperation = modeOfOperation;
	}

	@Column(name = "member_id", nullable = false)
	public Integer getMemberId() {
		return this.memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	@Column(name = "DefaultAC")
	public Boolean getDefaultAc() {
		return this.defaultAc;
	}

	public void setDefaultAc(Boolean defaultAc) {
		this.defaultAc = defaultAc;
	}

	@Column(name = "scheme_id")
	public Integer getSchemeId() {
		return this.schemeId;
	}

	public void setSchemeId(Integer schemeId) {
		this.schemeId = schemeId;
	}

	@Column(name = "AccountNumber", unique = true, length = 100)
	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
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

	@Column(name = "branch_id", nullable = false)
	public Integer getBranchId() {
		return this.branchId;
	}

	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
	}

	@Column(name = "staff_id", nullable = false)
	public Integer getStaffId() {
		return this.staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	@Column(name = "CurrentBalanceCr", precision = 20, scale = 3)
	public BigDecimal getCurrentBalanceCr() {
		return this.currentBalanceCr;
	}

	public void setCurrentBalanceCr(BigDecimal currentBalanceCr) {
		this.currentBalanceCr = currentBalanceCr;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LastCurrentInterestUpdatedAt", length = 19)
	public Date getLastCurrentInterestUpdatedAt() {
		return this.lastCurrentInterestUpdatedAt;
	}

	public void setLastCurrentInterestUpdatedAt(Date lastCurrentInterestUpdatedAt) {
		this.lastCurrentInterestUpdatedAt = lastCurrentInterestUpdatedAt;
	}

	@Column(name = "intrest_to_account_id")
	public Integer getIntrestToAccountId() {
		return this.intrestToAccountId;
	}

	public void setIntrestToAccountId(Integer intrestToAccountId) {
		this.intrestToAccountId = intrestToAccountId;
	}

	@Column(name = "Amount", precision = 22, scale = 0)
	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LoanInsurranceDate", length = 19)
	public Date getLoanInsurranceDate() {
		return this.loanInsurranceDate;
	}

	public void setLoanInsurranceDate(Date loanInsurranceDate) {
		this.loanInsurranceDate = loanInsurranceDate;
	}

	@Column(name = "dealer_id", nullable = false)
	public Integer getDealerId() {
		return this.dealerId;
	}

	public void setDealerId(Integer dealerId) {
		this.dealerId = dealerId;
	}

	@Column(name = "LockingStatus")
	public Boolean getLockingStatus() {
		return this.lockingStatus;
	}

	public void setLockingStatus(Boolean lockingStatus) {
		this.lockingStatus = lockingStatus;
	}

	@Column(name = "LoanAgainstAccount_id")
	public Integer getLoanAgainstAccountId() {
		return this.loanAgainstAccountId;
	}

	public void setLoanAgainstAccountId(Integer loanAgainstAccountId) {
		this.loanAgainstAccountId = loanAgainstAccountId;
	}

	@Column(name = "affectsBalanceSheet")
	public Boolean getAffectsBalanceSheet() {
		return this.affectsBalanceSheet;
	}

	public void setAffectsBalanceSheet(Boolean affectsBalanceSheet) {
		this.affectsBalanceSheet = affectsBalanceSheet;
	}

	@Column(name = "MaturedStatus")
	public Boolean getMaturedStatus() {
		return this.maturedStatus;
	}

	public void setMaturedStatus(Boolean maturedStatus) {
		this.maturedStatus = maturedStatus;
	}

	@Column(name = "collector_id")
	public Integer getCollectorId() {
		return this.collectorId;
	}

	public void setCollectorId(Integer collectorId) {
		this.collectorId = collectorId;
	}

	@Column(name = "CollectorAccountNumber", length = 50)
	public String getCollectorAccountNumber() {
		return this.collectorAccountNumber;
	}

	public void setCollectorAccountNumber(String collectorAccountNumber) {
		this.collectorAccountNumber = collectorAccountNumber;
	}

	@Column(name = "AccountDisplayName", length = 50)
	public String getAccountDisplayName() {
		return this.accountDisplayName;
	}

	public void setAccountDisplayName(String accountDisplayName) {
		this.accountDisplayName = accountDisplayName;
	}

	@Column(name = "PAndLGroup", nullable = false)
	public String getPandLgroup() {
		return this.pandLgroup;
	}

	public void setPandLgroup(String pandLgroup) {
		this.pandLgroup = pandLgroup;
	}

	@Column(name = "sig_image_id")
	public Integer getSigImageId() {
		return this.sigImageId;
	}

	public void setSigImageId(Integer sigImageId) {
		this.sigImageId = sigImageId;
	}
	
	@Column(name = "group_type")
	public String getGroupType() {
		return groupType;
	}

	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}

	@Column(name = "account_type")
	public String getAccountType() {
		return this.accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Column(name = "extra_info", length = 65535)
	public String getExtraInfo() {
		return this.extraInfo;
	}

	public void setExtraInfo(String extraInfo) {
		this.extraInfo = extraInfo;
	}

	@Column(name = "mo_id")
	public Integer getMoId() {
		return this.moId;
	}

	public void setMoId(Integer moId) {
		this.moId = moId;
	}

	@Column(name = "team_id")
	public Integer getTeamId() {
		return this.teamId;
	}

	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}

	@Column(name = "MaturityToAccount_id")
	public Integer getMaturityToAccountId() {
		return this.maturityToAccountId;
	}

	public void setMaturityToAccountId(Integer maturityToAccountId) {
		this.maturityToAccountId = maturityToAccountId;
	}

	@Column(name = "related_account_id")
	public Integer getRelatedAccountId() {
		return this.relatedAccountId;
	}

	public void setRelatedAccountId(Integer relatedAccountId) {
		this.relatedAccountId = relatedAccountId;
	}

	@Column(name = "doc_image_id")
	public Integer getDocImageId() {
		return this.docImageId;
	}

	public void setDocImageId(Integer docImageId) {
		this.docImageId = docImageId;
	}

	@Column(name = "is_dirty", nullable = false)
	public Byte getIsDirty() {
		return this.isDirty;
	}

	public void setIsDirty(Byte isDirty) {
		this.isDirty = isDirty;
	}

	@Column(name = "bike_surrendered", nullable = false)
	public Byte getBikeSurrendered() {
		return this.bikeSurrendered;
	}

	public void setBikeSurrendered(Byte bikeSurrendered) {
		this.bikeSurrendered = bikeSurrendered;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "bike_surrendered_on", length = 10)
	public Date getBikeSurrenderedOn() {
		return this.bikeSurrenderedOn;
	}

	public void setBikeSurrenderedOn(Date bikeSurrenderedOn) {
		this.bikeSurrenderedOn = bikeSurrenderedOn;
	}

	@Column(name = "is_given_for_legal_process")
	public Byte getIsGivenForLegalProcess() {
		return this.isGivenForLegalProcess;
	}

	public void setIsGivenForLegalProcess(Byte isGivenForLegalProcess) {
		this.isGivenForLegalProcess = isGivenForLegalProcess;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "legal_process_given_date", length = 10)
	public Date getLegalProcessGivenDate() {
		return this.legalProcessGivenDate;
	}

	public void setLegalProcessGivenDate(Date legalProcessGivenDate) {
		this.legalProcessGivenDate = legalProcessGivenDate;
	}

	@Column(name = "is_in_legal", nullable = false)
	public Byte getIsInLegal() {
		return this.isInLegal;
	}

	public void setIsInLegal(Byte isInLegal) {
		this.isInLegal = isInLegal;
	}

	@Column(name = "is_godowncharge_debited")
	public Byte getIsGodownchargeDebited() {
		return this.isGodownchargeDebited;
	}

	public void setIsGodownchargeDebited(Byte isGodownchargeDebited) {
		this.isGodownchargeDebited = isGodownchargeDebited;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "godowncharge_debited_on", length = 19)
	public Date getGodownchargeDebitedOn() {
		return this.godownchargeDebitedOn;
	}

	public void setGodownchargeDebitedOn(Date godownchargeDebitedOn) {
		this.godownchargeDebitedOn = godownchargeDebitedOn;
	}

	@Column(name = "is_legal_notice_sent_for_bike_auction")
	public Byte getIsLegalNoticeSentForBikeAuction() {
		return this.isLegalNoticeSentForBikeAuction;
	}

	public void setIsLegalNoticeSentForBikeAuction(Byte isLegalNoticeSentForBikeAuction) {
		this.isLegalNoticeSentForBikeAuction = isLegalNoticeSentForBikeAuction;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "legal_notice_sent_for_bike_auction_on", length = 19)
	public Date getLegalNoticeSentForBikeAuctionOn() {
		return this.legalNoticeSentForBikeAuctionOn;
	}

	public void setLegalNoticeSentForBikeAuctionOn(Date legalNoticeSentForBikeAuctionOn) {
		this.legalNoticeSentForBikeAuctionOn = legalNoticeSentForBikeAuctionOn;
	}

	@Column(name = "is_bike_auctioned")
	public Byte getIsBikeAuctioned() {
		return this.isBikeAuctioned;
	}

	public void setIsBikeAuctioned(Byte isBikeAuctioned) {
		this.isBikeAuctioned = isBikeAuctioned;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "bike_auctioned_on", length = 19)
	public Date getBikeAuctionedOn() {
		return this.bikeAuctionedOn;
	}

	public void setBikeAuctionedOn(Date bikeAuctionedOn) {
		this.bikeAuctionedOn = bikeAuctionedOn;
	}

	@Column(name = "is_final_recovery_notice_sent")
	public Byte getIsFinalRecoveryNoticeSent() {
		return this.isFinalRecoveryNoticeSent;
	}

	public void setIsFinalRecoveryNoticeSent(Byte isFinalRecoveryNoticeSent) {
		this.isFinalRecoveryNoticeSent = isFinalRecoveryNoticeSent;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "final_recovery_notice_sent_on", length = 19)
	public Date getFinalRecoveryNoticeSentOn() {
		return this.finalRecoveryNoticeSentOn;
	}

	public void setFinalRecoveryNoticeSentOn(Date finalRecoveryNoticeSentOn) {
		this.finalRecoveryNoticeSentOn = finalRecoveryNoticeSentOn;
	}

	@Column(name = "is_cheque_presented_in_bank")
	public Byte getIsChequePresentedInBank() {
		return this.isChequePresentedInBank;
	}

	public void setIsChequePresentedInBank(Byte isChequePresentedInBank) {
		this.isChequePresentedInBank = isChequePresentedInBank;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "cheque_presented_in_bank_on", length = 19)
	public Date getChequePresentedInBankOn() {
		return this.chequePresentedInBankOn;
	}

	public void setChequePresentedInBankOn(Date chequePresentedInBankOn) {
		this.chequePresentedInBankOn = chequePresentedInBankOn;
	}

	@Column(name = "is_cheque_returned")
	public Byte getIsChequeReturned() {
		return this.isChequeReturned;
	}

	public void setIsChequeReturned(Byte isChequeReturned) {
		this.isChequeReturned = isChequeReturned;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "cheque_returned_on", length = 19)
	public Date getChequeReturnedOn() {
		return this.chequeReturnedOn;
	}

	public void setChequeReturnedOn(Date chequeReturnedOn) {
		this.chequeReturnedOn = chequeReturnedOn;
	}

	@Column(name = "is_notice_sent_after_cheque_returned")
	public Byte getIsNoticeSentAfterChequeReturned() {
		return this.isNoticeSentAfterChequeReturned;
	}

	public void setIsNoticeSentAfterChequeReturned(Byte isNoticeSentAfterChequeReturned) {
		this.isNoticeSentAfterChequeReturned = isNoticeSentAfterChequeReturned;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "notice_sent_after_cheque_returned_on", length = 19)
	public Date getNoticeSentAfterChequeReturnedOn() {
		return this.noticeSentAfterChequeReturnedOn;
	}

	public void setNoticeSentAfterChequeReturnedOn(Date noticeSentAfterChequeReturnedOn) {
		this.noticeSentAfterChequeReturnedOn = noticeSentAfterChequeReturnedOn;
	}

	@Column(name = "is_legal_case_finalised")
	public Byte getIsLegalCaseFinalised() {
		return this.isLegalCaseFinalised;
	}

	public void setIsLegalCaseFinalised(Byte isLegalCaseFinalised) {
		this.isLegalCaseFinalised = isLegalCaseFinalised;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "legal_case_finalised_on", length = 19)
	public Date getLegalCaseFinalisedOn() {
		return this.legalCaseFinalisedOn;
	}

	public void setLegalCaseFinalisedOn(Date legalCaseFinalisedOn) {
		this.legalCaseFinalisedOn = legalCaseFinalisedOn;
	}

	@Column(name = "is_bike_returned")
	public Byte getIsBikeReturned() {
		return this.isBikeReturned;
	}

	public void setIsBikeReturned(Byte isBikeReturned) {
		this.isBikeReturned = isBikeReturned;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "bike_returned_on", length = 19)
	public Date getBikeReturnedOn() {
		return this.bikeReturnedOn;
	}

	public void setBikeReturnedOn(Date bikeReturnedOn) {
		this.bikeReturnedOn = bikeReturnedOn;
	}

	@Column(name = "bike_not_sold_reason", length = 65535)
	public String getBikeNotSoldReason() {
		return this.bikeNotSoldReason;
	}

	public void setBikeNotSoldReason(String bikeNotSoldReason) {
		this.bikeNotSoldReason = bikeNotSoldReason;
	}

	@Column(name = "legal_case_not_submitted_reason", length = 65535)
	public String getLegalCaseNotSubmittedReason() {
		return this.legalCaseNotSubmittedReason;
	}

	public void setLegalCaseNotSubmittedReason(String legalCaseNotSubmittedReason) {
		this.legalCaseNotSubmittedReason = legalCaseNotSubmittedReason;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "legal_filing_date", length = 10)
	public Date getLegalFilingDate() {
		return this.legalFilingDate;
	}

	public void setLegalFilingDate(Date legalFilingDate) {
		this.legalFilingDate = legalFilingDate;
	}

	@Column(name = "repayment_mode")
	public String getRepaymentMode() {
		return this.repaymentMode;
	}

	public void setRepaymentMode(String repaymentMode) {
		this.repaymentMode = repaymentMode;
	}

	@Column(name = "insurance_tenure", nullable = false)
	public String getInsuranceTenure() {
		return this.insuranceTenure;
	}

	public void setInsuranceTenure(String insuranceTenure) {
		this.insuranceTenure = insuranceTenure;
	}

	@Column(name = "new_or_renew")
	public String getNewOrRenew() {
		return this.newOrRenew;
	}

	public void setNewOrRenew(String newOrRenew) {
		this.newOrRenew = newOrRenew;
	}

	@Column(name = "bike_surrendered_by")
	public String getBikeSurrenderedBy() {
		return this.bikeSurrenderedBy;
	}

	public void setBikeSurrenderedBy(String bikeSurrenderedBy) {
		this.bikeSurrenderedBy = bikeSurrenderedBy;
	}

	@Column(name = "is_in_arbitration")
	public Byte getIsInArbitration() {
		return this.isInArbitration;
	}

	public void setIsInArbitration(Byte isInArbitration) {
		this.isInArbitration = isInArbitration;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "arbitration_on", length = 19)
	public Date getArbitrationOn() {
		return this.arbitrationOn;
	}

	public void setArbitrationOn(Date arbitrationOn) {
		this.arbitrationOn = arbitrationOn;
	}

	@Column(name = "is_society_notice_sent")
	public Byte getIsSocietyNoticeSent() {
		return this.isSocietyNoticeSent;
	}

	public void setIsSocietyNoticeSent(Byte isSocietyNoticeSent) {
		this.isSocietyNoticeSent = isSocietyNoticeSent;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "society_notice_sent_on", length = 19)
	public Date getSocietyNoticeSentOn() {
		return this.societyNoticeSentOn;
	}

	public void setSocietyNoticeSentOn(Date societyNoticeSentOn) {
		this.societyNoticeSentOn = societyNoticeSentOn;
	}

	@Column(name = "is_visit_done")
	public Byte getIsVisitDone() {
		return this.isVisitDone;
	}

	public void setIsVisitDone(Byte isVisitDone) {
		this.isVisitDone = isVisitDone;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "visit_done_on", length = 19)
	public Date getVisitDoneOn() {
		return this.visitDoneOn;
	}

	public void setVisitDoneOn(Date visitDoneOn) {
		this.visitDoneOn = visitDoneOn;
	}

	@Column(name = "is_legal_notice_sent")
	public Byte getIsLegalNoticeSent() {
		return this.isLegalNoticeSent;
	}

	public void setIsLegalNoticeSent(Byte isLegalNoticeSent) {
		this.isLegalNoticeSent = isLegalNoticeSent;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "legal_notice_sent_on", length = 19)
	public Date getLegalNoticeSentOn() {
		return this.legalNoticeSentOn;
	}

	public void setLegalNoticeSentOn(Date legalNoticeSentOn) {
		this.legalNoticeSentOn = legalNoticeSentOn;
	}

	@Column(name = "is_noc_handling_charge_received")
	public Byte getIsNocHandlingChargeReceived() {
		return this.isNocHandlingChargeReceived;
	}

	public void setIsNocHandlingChargeReceived(Byte isNocHandlingChargeReceived) {
		this.isNocHandlingChargeReceived = isNocHandlingChargeReceived;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "noc_handling_charge_received_on", length = 19)
	public Date getNocHandlingChargeReceivedOn() {
		return this.nocHandlingChargeReceivedOn;
	}

	public void setNocHandlingChargeReceivedOn(Date nocHandlingChargeReceivedOn) {
		this.nocHandlingChargeReceivedOn = nocHandlingChargeReceivedOn;
	}

	@Column(name = "lock_status_changed_reason")
	public String getLockStatusChangedReason() {
		return this.lockStatusChangedReason;
	}

	public void setLockStatusChangedReason(String lockStatusChangedReason) {
		this.lockStatusChangedReason = lockStatusChangedReason;
	}

	@Column(name = "telecaller_id")
	public Integer getTelecallerId() {
		return this.telecallerId;
	}

	public void setTelecallerId(Integer telecallerId) {
		this.telecallerId = telecallerId;
	}

	@Column(name = "bank_account_limit", nullable = false)
	public Integer getBankAccountLimit() {
		return this.bankAccountLimit;
	}

	public void setBankAccountLimit(Integer bankAccountLimit) {
		this.bankAccountLimit = bankAccountLimit;
	}

	@Column(name = "related_type")
	public String getRelatedType() {
		return this.relatedType;
	}

	public void setRelatedType(String relatedType) {
		this.relatedType = relatedType;
	}

	@Column(name = "related_type_id")
	public Integer getRelatedTypeId() {
		return this.relatedTypeId;
	}

	public void setRelatedTypeId(Integer relatedTypeId) {
		this.relatedTypeId = relatedTypeId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "accounts")
	public Set<AgentTds> getAgentTdses() {
		return this.agentTdses;
	}

	public void setAgentTdses(Set agentTdses) {
		this.agentTdses = agentTdses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "accounts")
	@JsonManagedReference
	public Set<MoAccountAssociation> getMoAccountAssociations() {
		return this.moAccountAssociations;
	}

	public void setMoAccountAssociations(Set moAccountAssociations) {
		this.moAccountAssociations = moAccountAssociations;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "accounts")
	@JsonManagedReference
	public Set<Comment> getComments() {
		return this.comments;
	}

	public void setComments(Set comments) {
		this.comments = comments;
	}

	@OneToMany(targetEntity = AccountGuarantors.class, fetch = FetchType.LAZY, mappedBy = "accounts")
	@JsonManagedReference
	public Set<AccountGuarantors> getAccountGuarantorses() {
		return this.accountGuarantorses;
	}

	public void setAccountGuarantorses(Set<AccountGuarantors> accountGuarantorses) {
		this.accountGuarantorses = accountGuarantorses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "accounts")
	@JsonManagedReference
	public Set<Jointmembers> getJointmemberses() {
		return this.jointmemberses;
	}

	public void setJointmemberses(Set jointmemberses) {
		this.jointmemberses = jointmemberses;
	}

}