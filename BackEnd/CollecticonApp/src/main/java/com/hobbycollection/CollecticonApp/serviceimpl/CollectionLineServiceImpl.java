package com.hobbycollection.CollecticonApp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hobbycollection.CollecticonApp.model.CollectionLine;
import com.hobbycollection.CollecticonApp.repository.CollectionLineRepository;
import com.hobbycollection.CollecticonApp.service.CollectionItemService;
import com.hobbycollection.CollecticonApp.service.CollectionLineService;

@Service
public class CollectionLineServiceImpl implements CollectionLineService{
	
	@Autowired
	CollectionLineRepository collectionLineRepository;
	
	@Autowired
	CollectionItemService itemService;

	@Override
	public CollectionLine getCollectionLineById(Integer lineId) {
		return collectionLineRepository.getLineByIdwithItems(lineId);
	}

	@Override
	public CollectionLine addNewCollectionLine(CollectionLine collectionLine) {
	return collectionLineRepository.insertNewCollectionLine(collectionLine);
	}

	@Override
	public boolean checkIfLineExists(Integer lineId) {
		if (getCollectionLineById(lineId) != null){
			return true;
		}
		else return false;
	}

	@Override
	public boolean addnewLineItemMapping(Integer lineId, Integer itemId) {
		if (checkIfLineExists(lineId) && itemService.checkIfItemExists(itemId.toString())) {
			try {
				collectionLineRepository.insertNewLineItemMapping(lineId, itemId);
				return true;
			}catch( Exception ex) {
				return false;
			}
		}
		return false;
	}
	
	

}
