package org.assetsglobal.entity;

import org.assetsglobal.enums.BankingPartner;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "home_loan_client")
public class HomeLoan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loadId;
	private String name;
	private String email;
	private long phoneNumber;
	private BankingPartner bankingPartner;
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
