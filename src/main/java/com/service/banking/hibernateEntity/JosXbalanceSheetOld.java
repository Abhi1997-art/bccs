package com.service.banking.hibernateEntity;
// Generated Feb 20, 2020 6:19:12 PM by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * JosXbalanceSheetOld generated by hbm2java
 */
@Entity
@Table(name = "jos_xbalance_sheet_old")
public class JosXbalanceSheetOld implements java.io.Serializable {

	private Integer id;
	private String head;

	public JosXbalanceSheetOld() {
	}

	public JosXbalanceSheetOld(String head) {
		this.head = head;
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

	@Column(name = "Head", length = 45)
	public String getHead() {
		return this.head;
	}

	public void setHead(String head) {
		this.head = head;
	}

}
