package com.hobbycollection.CollecticonApp.service;

import com.hobbycollection.CollecticonApp.model.CollectionItem;

public interface CollectionItemService {
	CollectionItem getItemById(String itemId);
	CollectionItem insertNewItem(CollectionItem collectionItem);
	

}
