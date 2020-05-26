package com.hobbycollection.CollecticonApp.serviceimpl;

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

}
