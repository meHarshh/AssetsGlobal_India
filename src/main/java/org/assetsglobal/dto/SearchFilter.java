package org.assetsglobal.dto;

import org.assetsglobal.enums.AgeOfProperty;
import org.assetsglobal.enums.ListedBy;
import org.assetsglobal.enums.Possesion;
import org.assetsglobal.enums.PropertyConfiguration;
import org.assetsglobal.enums.PropertyPurpose;
import org.assetsglobal.enums.PropertyType;
import org.assetsglobal.enums.PurchaseType;
import org.springframework.stereotype.Component;

@Component
public class SearchFilter {

	long minPrice;
	long maxPrice;
	PropertyPurpose propertyPurpose;
	PropertyConfiguration configuration;
	PurchaseType purchaseType;
	Possesion possesion;
	ListedBy listedBy;
	AgeOfProperty ageOfProperty;
	PropertyType propertyType;

	public long getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(long minPrice) {
		this.minPrice = minPrice;
	}

	public long getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(long maxPrice) {
		this.maxPrice = maxPrice;
	}

	public PropertyPurpose getPropertyPurpose() {
		return propertyPurpose;
	}

	public void setPropertyPurpose(PropertyPurpose propertyPurpose) {
		this.propertyPurpose = propertyPurpose;
	}

	public PropertyConfiguration getConfiguration() {
		return configuration;
	}

	public void setConfiguration(PropertyConfiguration configuration) {
		this.configuration = configuration;
	}

	public PurchaseType getPurchaseType() {
		return purchaseType;
	}

	public void setPurchaseType(PurchaseType purchaseType) {
		this.purchaseType = purchaseType;
	}

	public Possesion getPossesion() {
		return possesion;
	}

	public void setPossesion(Possesion possesion) {
		this.possesion = possesion;
	}

	public ListedBy getListedBy() {
		return listedBy;
	}

	public void setListedBy(ListedBy listedBy) {
		this.listedBy = listedBy;
	}

	public AgeOfProperty getAgeOfProperty() {
		return ageOfProperty;
	}

	public void setAgeOfProperty(AgeOfProperty ageOfProperty) {
		this.ageOfProperty = ageOfProperty;
	}

	public PropertyType getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(PropertyType propertyType) {
		this.propertyType = propertyType;
	}

}
