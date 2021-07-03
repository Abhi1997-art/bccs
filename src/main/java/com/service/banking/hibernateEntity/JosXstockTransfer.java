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

/**
 * JosXstockTransfer generated by hbm2java
 */
@Entity
@Table(name = "jos_xstock_transfer")
public class JosXstockTransfer implements java.io.Serializable {

	private Integer id;
	private int fromId;
	private int toId;
	private int itemId;
	private float quantity;
	private Date date;
	private String remarks;

	public JosXstockTransfer() {
	}

	public JosXstockTransfer(int fromId, int toId, int itemId, float quantity, Date date, String remarks) {
		this.fromId = fromId;
		this.toId = toId;
		this.itemId = itemId;
		this.quantity = quantity;
		this.date = date;
		this.remarks = remarks;
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

	@Column(name = "from_id", nullable = false)
	public int getFromId() {
		return this.fromId;
	}

	public void setFromId(int fromId) {
		this.fromId = fromId;
	}

	@Column(name = "to_id", nullable = false)
	public int getToId() {
		return this.toId;
	}

	public void setToId(int toId) {
		this.toId = toId;
	}

	@Column(name = "item_id", nullable = false)
	public int getItemId() {
		return this.itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	@Column(name = "Quantity", nullable = false, precision = 12, scale = 0)
	public float getQuantity() {
		return this.quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date", nullable = false, length = 19)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "Remarks", nullable = false, length = 65535)
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
