package org.assetsglobal.dto;

import java.time.LocalDate;

import org.assetsglobal.enums.BrockrageCharge;
import org.assetsglobal.enums.ConstructionStatus;
import org.assetsglobal.enums.Facing;
import org.assetsglobal.enums.FurnishedType;
import org.assetsglobal.enums.LandType;
import org.assetsglobal.enums.Parking;
import org.assetsglobal.enums.PropertyType;
import org.assetsglobal.enums.TransactionType;

public class PropertyDeveloperRequest {

	// Property Details from the seller that he wants to list and sell
	private PropertyType propertyType;
	private TransactionType transactionType;
	private ConstructionStatus constructionStatus;
	private int bhk;
	private int bathroom;
	private int balcony;
	private FurnishedType furnishedType;
	private Parking parking;
	private int openParking;
	private LocalDate possessionDate;
	private long cost;
	private int maintainceCharge;
	private BrockrageCharge brockrageCharge;
	private double builtUpArea;
	private double carpetArea;
	private double area;
	private LandType landType;
	private Facing facing;
	private String propertyAddress;
	private String reraId;
	private String propertyDescription;
	private String city;
	private String propertyLocation;
	private String state;

	public PropertyType getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(PropertyType propertyType) {
		this.propertyType = propertyType;
	}

	public TransactionType getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}

	public ConstructionStatus getConstructionStatus() {
		return constructionStatus;
	}

	public void setConstructionStatus(ConstructionStatus constructionStatus) {
		this.constructionStatus = constructionStatus;
	}

	public int getBhk() {
		return bhk;
	}

	public void setBhk(int bhk) {
		this.bhk = bhk;
	}

	public int getBathroom() {
		return bathroom;
	}

	public void setBathroom(int bathroom) {
		this.bathroom = bathroom;
	}

	public int getBalcony() {
		return balcony;
	}

	public void setBalcony(int balcony) {
		this.balcony = balcony;
	}

	public FurnishedType getFurnishedType() {
		return furnishedType;
	}

	public void setFurnishedType(FurnishedType furnishedType) {
		this.furnishedType = furnishedType;
	}

	public Parking getParking() {
		return parking;
	}

	public void setParking(Parking parking) {
		this.parking = parking;
	}

	public int getOpenParking() {
		return openParking;
	}

	public void setOpenParking(int openParking) {
		this.openParking = openParking;
	}

	public LocalDate getPossessionDate() {
		return possessionDate;
	}

	public void setPossessionDate(LocalDate possessionDate) {
		this.possessionDate = possessionDate;
	}

	public long getCost() {
		return cost;
	}

	public void setCost(long cost) {
		this.cost = cost;
	}

	public int getMaintainceCharge() {
		return maintainceCharge;
	}

	public void setMaintainceCharge(int maintainceCharge) {
		this.maintainceCharge = maintainceCharge;
	}

	public BrockrageCharge getBrockrageCharge() {
		return brockrageCharge;
	}

	public void setBrockrageCharge(BrockrageCharge brockrageCharge) {
		this.brockrageCharge = brockrageCharge;
	}

	public double getBuiltUpArea() {
		return builtUpArea;
	}

	public void setBuiltUpArea(double builtUpArea) {
		this.builtUpArea = builtUpArea;
	}

	public double getCarpetArea() {
		return carpetArea;
	}

	public void setCarpetArea(double carpetArea) {
		this.carpetArea = carpetArea;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public LandType getLandType() {
		return landType;
	}

	public void setLandType(LandType landType) {
		this.landType = landType;
	}

	public Facing getFacing() {
		return facing;
	}

	public void setFacing(Facing facing) {
		this.facing = facing;
	}

	public String getPropertyAddress() {
		return propertyAddress;
	}

	public void setPropertyAddress(String propertyAddress) {
		this.propertyAddress = propertyAddress;
	}

	public String getReraId() {
		return reraId;
	}

	public void setReraId(String reraId) {
		this.reraId = reraId;
	}

	public String getPropertyDescription() {
		return propertyDescription;
	}

	public void setPropertyDescription(String propertyDescription) {
		this.propertyDescription = propertyDescription;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPropertyLocation() {
		return propertyLocation;
	}

	public void setPropertyLocation(String propertyLocation) {
		this.propertyLocation = propertyLocation;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public PropertyDeveloperRequest(PropertyType propertyType, TransactionType transactionType,
			ConstructionStatus constructionStatus, int bhk, int bathroom, int balcony, FurnishedType furnishedType,
			Parking parking, int openParking, LocalDate possessionDate, long cost, int maintainceCharge,
			BrockrageCharge brockrageCharge, double builtUpArea, double carpetArea, double area, LandType landType,
			Facing facing, String propertyAddress, String reraId, String propertyDescription, String city,
			String propertyLocation, String state) {
		super();
		this.propertyType = propertyType;
		this.transactionType = transactionType;
		this.constructionStatus = constructionStatus;
		this.bhk = bhk;
		this.bathroom = bathroom;
		this.balcony = balcony;
		this.furnishedType = furnishedType;
		this.parking = parking;
		this.openParking = openParking;
		this.possessionDate = possessionDate;
		this.cost = cost;
		this.maintainceCharge = maintainceCharge;
		this.brockrageCharge = brockrageCharge;
		this.builtUpArea = builtUpArea;
		this.carpetArea = carpetArea;
		this.area = area;
		this.landType = landType;
		this.facing = facing;
		this.propertyAddress = propertyAddress;
		this.reraId = reraId;
		this.propertyDescription = propertyDescription;
		this.city = city;
		this.propertyLocation = propertyLocation;
		this.state = state;
	}

	public PropertyDeveloperRequest() {
		// TODO Auto-generated constructor stub
	}

}
