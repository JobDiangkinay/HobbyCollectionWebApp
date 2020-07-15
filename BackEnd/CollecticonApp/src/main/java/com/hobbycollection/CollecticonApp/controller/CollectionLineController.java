package com.hobbycollection.CollecticonApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping("/addLine")
	public CollectionLine addNewCollectionLine(@RequestBody CollectionLine collectionLine) {
		return collectionLineService.addNewCollectionLine(collectionLine);
	}
	
	@PostMapping("/addToLine/{lineId}/{itemId}")
	public String addItemToLine(@PathVariable int lineId, @PathVariable int itemId) {
		if(collectionLineService.addnewLineItemMapping(lineId, itemId)) {
			return "SUCCESS";
		}
		System.out.println("Git tesst");
		return "FAILED";
	}

}
