package com.hobbycollection.CollecticonApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hobbycollection.CollecticonApp.model.CollectionItem;
import com.hobbycollection.CollecticonApp.service.CollectionItemService;

@RestController
@RequestMapping("item")
public class CollectionItemController {
	
	@Autowired
	CollectionItemService collectionItemService;

	@GetMapping("/{id}")
	public CollectionItem getItemById(@PathVariable String id) {
		return collectionItemService.getItemById(id);
	}
	
	@PostMapping("/addItem")
	public CollectionItem insertNewItem(@RequestBody CollectionItem collectionItem) {
		return collectionItemService.insertNewItem(collectionItem);
	}
	
	@GetMapping("/test")
	public String testController() {
		String success="Success!!!";
		return success;
	}
	
}
