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
 * StocknewContainer generated by hbm2java
 */
@Entity
@Table(name = "stocknew_container")
public class StocknewContainer implements java.io.Serializable {

	private Integer id;
	private Branches branches;
	private StocknewContainertype stocknewContainertype;
	private String name;
	private Set stocknewContainerrows = new HashSet(0);
	private Set stocknewTransactionsesForFromContainerId = new HashSet(0);
	private Set stocknewTransactionsesForToContainerId = new HashSet(0);

	public StocknewContainer() {
	}

	public StocknewContainer(Branches branches, StocknewContainertype stocknewContainertype, String name,
			Set stocknewContainerrows, Set stocknewTransactionsesForFromContainerId,
			Set stocknewTransactionsesForToContainerId) {
		this.branches = branches;
		this.stocknewContainertype = stocknewContainertype;
		this.name = name;
		this.stocknewContainerrows = stocknewContainerrows;
		this.stocknewTransactionsesForFromContainerId = stocknewTransactionsesForFromContainerId;
		this.stocknewTransactionsesForToContainerId = stocknewTransactionsesForToContainerId;
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
	@JoinColumn(name = "branch_id")
	public Branches getBranches() {
		return this.branches;
	}

	public void setBranches(Branches branches) {
		this.branches = branches;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "containertype_id")
	public StocknewContainertype getStocknewContainertype() {
		return this.stocknewContainertype;
	}

	public void setStocknewContainertype(StocknewContainertype stocknewContainertype) {
		this.stocknewContainertype = stocknewContainertype;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "stocknewContainer")
	public Set<StocknewContainerrow> getStocknewContainerrows() {
		return this.stocknewContainerrows;
	}

	public void setStocknewContainerrows(Set stocknewContainerrows) {
		this.stocknewContainerrows = stocknewContainerrows;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "stocknewContainerByFromContainerId")
	public Set<StocknewTransactions> getStocknewTransactionsesForFromContainerId() {
		return this.stocknewTransactionsesForFromContainerId;
	}

	public void setStocknewTransactionsesForFromContainerId(Set stocknewTransactionsesForFromContainerId) {
		this.stocknewTransactionsesForFromContainerId = stocknewTransactionsesForFromContainerId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "stocknewContainerByToContainerId")
	public Set<StocknewTransactions> getStocknewTransactionsesForToContainerId() {
		return this.stocknewTransactionsesForToContainerId;
	}

	public void setStocknewTransactionsesForToContainerId(Set stocknewTransactionsesForToContainerId) {
		this.stocknewTransactionsesForToContainerId = stocknewTransactionsesForToContainerId;
	}

}
