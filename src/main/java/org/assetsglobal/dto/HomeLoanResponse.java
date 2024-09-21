package org.assetsglobal.dto;

import org.assetsglobal.enums.BankingPartner;

import lombok.Builder;

@Builder
public class HomeLoanResponse {
	private int loadId;
	private String name;
	private String email;
	private long phoneNumber;
	private BankingPartner bankingPartner;

	public HomeLoanResponse() {
		// TODO Auto-generated constructor stub
	}

	public int getLoadId() {
		return loadId;
	}

	public void setLoadId(int loadId) {
		this.loadId = loadId;
	}

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
