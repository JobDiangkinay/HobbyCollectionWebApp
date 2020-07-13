import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router, NavigationEnd } from '@angular/router';
import {CollectionItem} from '../../models/collectionitem';
import {CollectionitemService} from '../../services/collectionitem.service';

@Component({
  selector: 'app-collection-list',
  templateUrl: './collection-list.component.html',
  styleUrls: ['./collection-list.component.css']
})
export class CollectionListComponent implements OnInit {
  allCollectionItems: CollectionItem[];

  constructor(private route: ActivatedRoute,private router: Router,private collectionItemService: CollectionitemService) { }

  ngOnInit() {
    this.getAllItems();
  }

  getAllItems(){
    this.collectionItemService.getCollectionAllItem().subscribe(items =>{this.allCollectionItems = items});
  }


}
