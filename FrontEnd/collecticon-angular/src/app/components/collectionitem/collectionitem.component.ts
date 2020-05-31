import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router, NavigationEnd } from '@angular/router';
import {CollectionItem} from '../../models/collectionitem';
import {CollectionitemService} from '../../services/collectionitem.service';

@Component({
  selector: 'app-collectionitem',
  templateUrl: './collectionitem.component.html',
  styleUrls: ['./collectionitem.component.css']
})
export class CollectionitemComponent implements OnInit {
  currentItemId: String;
  currentItem: CollectionItem;

  constructor(private route: ActivatedRoute,private router: Router,private collectionItemService: CollectionitemService ) { }

  ngOnInit() {
    this.route.params.subscribe(params => {
     this.getItemById("100001");
    });
  }

  getItemById(itemId: String){
    this.collectionItemService.getCollectionItemById(itemId).subscribe((item)=>{this.currentItem = item});
  }

}
