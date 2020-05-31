package com.hobbycollection.CollecticonApp.model;

import java.util.List;

public class CollectionLine {

	private int lineId;
	private String lineName;
	private List<CollectionItem> lineItems;

	public CollectionLine() {
		super();
	}

	public CollectionLine(int lineId, String lineName, List<CollectionItem> lineItems) {
		super();
		this.lineId = lineId;
		this.lineName = lineName;
		this.lineItems = lineItems;
	}

	public int getLineId() {
		return lineId;
	}

	public void setLineId(int lineId) {
		this.lineId = lineId;
	}

	public String getLineName() {
		return lineName;
	}

	public void setLineName(String lineName) {
		this.lineName = lineName;
	}

	public List<CollectionItem> getLineItems() {
		return lineItems;
	}

	public void setLineItems(List<CollectionItem> lineItems) {
		this.lineItems = lineItems;
	}

	@Override
	public String toString() {
		return "CollectionLine [lineId=" + lineId + ", lineName=" + lineName + ", lineItems=" + lineItems + "]";
	}

}
