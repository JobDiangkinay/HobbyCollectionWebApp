package com.hobbycollection.CollecticonApp.service;

import java.util.List;

import com.hobbycollection.CollecticonApp.model.CollectionItem;

public interface CollectionItemService {
	CollectionItem getItemById(String itemId);
	CollectionItem insertNewItem(CollectionItem collectionItem);
	List<CollectionItem> getAllItem();
	boolean checkIfItemExists(String itemId);
	

}
