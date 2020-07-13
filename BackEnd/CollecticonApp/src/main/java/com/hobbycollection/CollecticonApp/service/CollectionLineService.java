package com.hobbycollection.CollecticonApp.service;

import com.hobbycollection.CollecticonApp.model.CollectionLine;

public interface CollectionLineService {
	CollectionLine getCollectionLineById(Integer lineId);
	CollectionLine addNewCollectionLine(CollectionLine collectionLine);
	boolean addnewLineItemMapping(Integer lineId, Integer itemId);
	boolean checkIfLineExists(Integer lineId);
}
