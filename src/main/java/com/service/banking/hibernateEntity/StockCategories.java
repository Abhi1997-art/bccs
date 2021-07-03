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
 * StockCategories generated by hbm2java
 */
@Entity
@Table(name = "stock_categories")
public class StockCategories implements java.io.Serializable {

	private Integer id;
	private Branches branches;
	private String name;
	private Set stockItemses = new HashSet(0);

	public StockCategories() {
	}

	public StockCategories(Branches branches, String name, Set stockItemses) {
		this.branches = branches;
		this.name = name;
		this.stockItemses = stockItemses;
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

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "stockCategories")
	public Set<StockItems> getStockItemses() {
		return this.stockItemses;
	}

	public void setStockItemses(Set stockItemses) {
		this.stockItemses = stockItemses;
	}

}
