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
 * StocknewItems generated by hbm2java
 */
@Entity
@Table(name = "stocknew_items")
public class StocknewItems implements java.io.Serializable {

	private Integer id;
	private StocknewCategory stocknewCategory;
	private String name;
	private String code;
	private String description;
	private Boolean isActive;
	private Boolean isFixedAsset;
	private Set stocknewTransactionses = new HashSet(0);

	public StocknewItems() {
	}

	public StocknewItems(StocknewCategory stocknewCategory, String name, String code, String description,
			Boolean isActive, Boolean isFixedAsset, Set stocknewTransactionses) {
		this.stocknewCategory = stocknewCategory;
		this.name = name;
		this.code = code;
		this.description = description;
		this.isActive = isActive;
		this.isFixedAsset = isFixedAsset;
		this.stocknewTransactionses = stocknewTransactionses;
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
	@JoinColumn(name = "category_id")
	public StocknewCategory getStocknewCategory() {
		return this.stocknewCategory;
	}

	public void setStocknewCategory(StocknewCategory stocknewCategory) {
		this.stocknewCategory = stocknewCategory;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "code")
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "description", length = 65535)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "is_active")
	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	@Column(name = "is_fixed_asset")
	public Boolean getIsFixedAsset() {
		return this.isFixedAsset;
	}

	public void setIsFixedAsset(Boolean isFixedAsset) {
		this.isFixedAsset = isFixedAsset;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "stocknewItems")
	public Set<StocknewTransactions> getStocknewTransactionses() {
		return this.stocknewTransactionses;
	}

	public void setStocknewTransactionses(Set stocknewTransactionses) {
		this.stocknewTransactionses = stocknewTransactionses;
	}

}
