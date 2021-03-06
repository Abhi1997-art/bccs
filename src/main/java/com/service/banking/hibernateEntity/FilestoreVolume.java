package com.service.banking.hibernateEntity;
// Generated Feb 20, 2020 6:19:12 PM by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * FilestoreVolume generated by hbm2java
 */
@Entity
@Table(name = "filestore_volume", uniqueConstraints = @UniqueConstraint(columnNames = "name"))
public class FilestoreVolume implements java.io.Serializable {

	private Integer id;
	private String name;
	private String dirname;
	private long totalSpace;
	private long usedSpace;
	private int storedFilesCnt;
	private String enabled;
	private Integer lastFilenum;

	public FilestoreVolume() {
	}

	public FilestoreVolume(String name, String dirname, long totalSpace, long usedSpace, int storedFilesCnt) {
		this.name = name;
		this.dirname = dirname;
		this.totalSpace = totalSpace;
		this.usedSpace = usedSpace;
		this.storedFilesCnt = storedFilesCnt;
	}

	public FilestoreVolume(String name, String dirname, long totalSpace, long usedSpace, int storedFilesCnt,
			String enabled, Integer lastFilenum) {
		this.name = name;
		this.dirname = dirname;
		this.totalSpace = totalSpace;
		this.usedSpace = usedSpace;
		this.storedFilesCnt = storedFilesCnt;
		this.enabled = enabled;
		this.lastFilenum = lastFilenum;
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

	@Column(name = "name", unique = true, nullable = false, length = 32)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "dirname", nullable = false)
	public String getDirname() {
		return this.dirname;
	}

	public void setDirname(String dirname) {
		this.dirname = dirname;
	}

	@Column(name = "total_space", nullable = false)
	public long getTotalSpace() {
		return this.totalSpace;
	}

	public void setTotalSpace(long totalSpace) {
		this.totalSpace = totalSpace;
	}

	@Column(name = "used_space", nullable = false)
	public long getUsedSpace() {
		return this.usedSpace;
	}

	public void setUsedSpace(long usedSpace) {
		this.usedSpace = usedSpace;
	}

	@Column(name = "stored_files_cnt", nullable = false)
	public int getStoredFilesCnt() {
		return this.storedFilesCnt;
	}

	public void setStoredFilesCnt(int storedFilesCnt) {
		this.storedFilesCnt = storedFilesCnt;
	}

	@Column(name = "enabled", length = 1)
	public String getEnabled() {
		return this.enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	@Column(name = "last_filenum")
	public Integer getLastFilenum() {
		return this.lastFilenum;
	}

	public void setLastFilenum(Integer lastFilenum) {
		this.lastFilenum = lastFilenum;
	}

}
