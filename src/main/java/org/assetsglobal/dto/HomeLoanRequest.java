package org.assetsglobal.dto;

import org.assetsglobal.enums.BankingPartner;

import lombok.Builder;


@Builder
public class HomeLoanRequest {
	private String name;
	private String email;
	private long phoneNumber;
	private BankingPartner bankingPartner;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public BankingPartner getBankingPartner() {
		return bankingPartner;
	}
	public void setBankingPartner(BankingPartner bankingPartner) {
		this.bankingPartner = bankingPartner;
	}
	
	
}
