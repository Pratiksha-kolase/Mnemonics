package com.mnemonics.dto;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

public class MnemonicsDto {

	private Long id;
	
	private String  mnemonicString;
	
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

}
