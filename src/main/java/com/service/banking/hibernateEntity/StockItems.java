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
 * StockItems generated by hbm2java
 */
@Entity
@Table(name = "stock_items")
public class StockItems implements java.io.Serializable {

	private Integer id;
	private Branches branches;
	private StockCategories stockCategories;
	private String name;
	private String description;
	private Boolean isConsumable;
	private Boolean isIssueable;
	private Boolean isFixedassets;
	private Boolean isActive;
	private Set stockContainerrowitemqties = new HashSet(0);
	private Set stockTransactionses = new HashSet(0);

	public StockItems() {
	}

	public StockItems(Branches branches, StockCategories stockCategories, String name, String description,
			Boolean isConsumable, Boolean isIssueable, Boolean isFixedassets, Boolean isActive,
			Set stockContainerrowitemqties, Set stockTransactionses) {
		this.branches = branches;
		this.stockCategories = stockCategories;
		this.name = name;
		this.description = description;
		this.isConsumable = isConsumable;
		this.isIssueable = isIssueable;
		this.isFixedassets = isFixedassets;
		this.isActive = isActive;
		this.stockContainerrowitemqties = stockContainerrowitemqties;
		this.stockTransactionses = stockTransactionses;
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
	@JoinColumn(name = "category_id")
	public StockCategories getStockCategories() {
		return this.stockCategories;
	}

	public void setStockCategories(StockCategories stockCategories) {
		this.stockCategories = stockCategories;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description", length = 65535)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "is_consumable")
	public Boolean getIsConsumable() {
		return this.isConsumable;
	}

	public void setIsConsumable(Boolean isConsumable) {
		this.isConsumable = isConsumable;
	}

	@Column(name = "is_issueable")
	public Boolean getIsIssueable() {
		return this.isIssueable;
	}

	public void setIsIssueable(Boolean isIssueable) {
		this.isIssueable = isIssueable;
	}

	@Column(name = "is_fixedassets")
	public Boolean getIsFixedassets() {
		return this.isFixedassets;
	}

	public void setIsFixedassets(Boolean isFixedassets) {
		this.isFixedassets = isFixedassets;
	}

	@Column(name = "is_active")
	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "stockItems")
	public Set<StockContainerrowitemqty> getStockContainerrowitemqties() {
		return this.stockContainerrowitemqties;
	}

	public void setStockContainerrowitemqties(Set stockContainerrowitemqties) {
		this.stockContainerrowitemqties = stockContainerrowitemqties;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "stockItems")
	public Set<StockTransactions> getStockTransactionses() {
		return this.stockTransactionses;
	}

	public void setStockTransactionses(Set stockTransactionses) {
		this.stockTransactionses = stockTransactionses;
	}

}
