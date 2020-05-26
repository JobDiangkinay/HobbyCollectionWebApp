package com.hobbycollection.CollecticonApp.model;

public class CollectionItem {

	private String itemId;
	private String itemName;
	private String brandName;
	private int yearReleased;
	private double suggestedRetailPrice;
	private String photoUrl;

	public CollectionItem() {
		super();
	}

	public CollectionItem(String itemId, String itemName, String brandName, int yearReleased,
			double suggestedRetailPrice, String photoUrl) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.brandName = brandName;
		this.yearReleased = yearReleased;
		this.suggestedRetailPrice = suggestedRetailPrice;
		this.photoUrl = photoUrl;
	}

	public String getitemId() {
		return itemId;
	}

	public void setitemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getYearReleased() {
		return yearReleased;
	}

	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
	}

	public double getSuggestedRetailPrice() {
		return suggestedRetailPrice;
	}

	public void setSuggestedRetailPrice(double suggestedRetailPrice) {
		this.suggestedRetailPrice = suggestedRetailPrice;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	@Override
	public String toString() {
		return "CollectionItem [itemId=" + itemId + ", itemName=" + itemName + ", brandName=" + brandName
				+ ", yearReleased=" + yearReleased + ", suggestedRetailPrice=" + suggestedRetailPrice + ", photoUrl="
				+ photoUrl + "]";
	}

}
