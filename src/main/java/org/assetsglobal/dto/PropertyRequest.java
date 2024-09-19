package org.assetsglobal.dto;

import org.assetsglobal.enums.AgeOfProperty;
import org.assetsglobal.enums.ConstructionStatus;
import org.assetsglobal.enums.ListedBy;
import org.assetsglobal.enums.Possesion;
import org.assetsglobal.enums.PropertyConfiguration;
import org.assetsglobal.enums.PropertyPurpose;
import org.assetsglobal.enums.PropertyType;
import org.assetsglobal.enums.PurchaseType;

public class PropertyRequest {
	private String nameOfTheProperty;
	private String propertyLocation;
	private PropertyPurpose propertyPurpose;
	private String developer;
	private PropertyConfiguration configuration;
	private PurchaseType purchseType;
	private Possesion possesion;
	private ListedBy listedBy;
	private AgeOfProperty ageOfProperty;
	private String area;
	private String priceRange;
	private long price;
	private ConstructionStatus constructionStatus;
	private PropertyType propertyType;
	private String numberOfFloors;

	public String getNameOfTheProperty() {
		return nameOfTheProperty;
	}

	public void setNameOfTheProperty(String nameOfTheProperty) {
		this.nameOfTheProperty = nameOfTheProperty;
	}

	public String getPropertyLocation() {
		return propertyLocation;
	}

	public void setPropertyLocation(String propertyLocation) {
		this.propertyLocation = propertyLocation;
	}

	public PropertyPurpose getPropertyPurpose() {
		return propertyPurpose;
	}

	public void setPropertyPurpose(PropertyPurpose propertyPurpose) {
		this.propertyPurpose = propertyPurpose;
	}

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	public PropertyConfiguration getConfiguration() {
		return configuration;
	}

	public void setConfiguration(PropertyConfiguration configuration) {
		this.configuration = configuration;
	}

	public PurchaseType getPurchseType() {
		return purchseType;
	}

	public void setPurchseType(PurchaseType purchseType) {
		this.purchseType = purchseType;
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

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getPriceRange() {
		return priceRange;
	}

	public void setPriceRange(String priceRange) {
		this.priceRange = priceRange;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public ConstructionStatus getConstructionStatus() {
		return constructionStatus;
	}

	public void setConstructionStatus(ConstructionStatus constructionStatus) {
		this.constructionStatus = constructionStatus;
	}

	public PropertyType getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(PropertyType propertyType) {
		this.propertyType = propertyType;
	}

	public String getNumberOfFloors() {
		return numberOfFloors;
	}

	public void setNumberOfFloors(String numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}

}
