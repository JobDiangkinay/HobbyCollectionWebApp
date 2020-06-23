package com.hobbycollection.CollecticonApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hobbycollection.CollecticonApp.model.CollectionLine;
import com.hobbycollection.CollecticonApp.service.CollectionLineService;

@RestController
@RequestMapping("line")
public class CollectionLineController {
	
	@Autowired
	CollectionLineService collectionLineService;
	
	@GetMapping("/{id}")
	public CollectionLine getCollectionLineById(@PathVariable int id) {
		return collectionLineService.getCollectionLineById(id);
	}

}
