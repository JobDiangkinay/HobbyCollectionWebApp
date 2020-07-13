package com.hobbycollection.CollecticonApp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hobbycollection.CollecticonApp.model.CollectionItem;
import com.hobbycollection.CollecticonApp.repository.CollectionItemRepository;
import com.hobbycollection.CollecticonApp.service.CollectionItemService;

@Service
public class CollectionItemServiceImpl implements CollectionItemService{
	
	@Autowired
	CollectionItemRepository collectionItemRepository;

	@Override
	public CollectionItem getItemById(String itemId) {
		return collectionItemRepository.getItemById(itemId);
	}

	@Override
	public CollectionItem insertNewItem(CollectionItem collectionItem) {
		return collectionItemRepository.insertNewItem(collectionItem);
	}

	@Override
	public List<CollectionItem> getAllItem() {
		return collectionItemRepository.getAllItems();
	}

	@Override
	public boolean checkIfItemExists(String itemId) {
		if (getItemById(itemId) != null) {
			return true;
		}
		else return false;
	}

}
