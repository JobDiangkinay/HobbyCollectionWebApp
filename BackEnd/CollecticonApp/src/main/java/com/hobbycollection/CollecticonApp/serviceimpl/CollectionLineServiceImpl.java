package com.hobbycollection.CollecticonApp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hobbycollection.CollecticonApp.model.CollectionLine;
import com.hobbycollection.CollecticonApp.repository.CollectionLineRepository;
import com.hobbycollection.CollecticonApp.service.CollectionLineService;

@Service
public class CollectionLineServiceImpl implements CollectionLineService{
	
	@Autowired
	CollectionLineRepository collectionLineRepository;

	@Override
	public CollectionLine getCollectionLineById(Integer lineId) {
		return collectionLineRepository.getLineByIdwithItems(lineId);
	}

}
