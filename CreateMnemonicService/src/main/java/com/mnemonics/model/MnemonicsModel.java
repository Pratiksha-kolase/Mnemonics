package com.mnemonics.model;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "mnemonics")
public class MnemonicsModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String  mnemonicString;
	
	@CreationTimestamp
	private Date createdTimeDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMnemonicString() {
		return mnemonicString;
	}

	public void setMnemonicString(String mnemonicString) {
		this.mnemonicString = mnemonicString;
	}

	public Date getCreatedTimeDate() {
		return createdTimeDate;
	}

	public void setCreatedTimeDate(Date createdTimeDate) {
		this.createdTimeDate = createdTimeDate;
	}

	@Override
	public String toString() {
		return "MnemonicsModel [id=" + id + ", mnemonicString=" + mnemonicString + ", createdTimeDate="
				+ createdTimeDate + "]";
	}
	
	
	
	
}
