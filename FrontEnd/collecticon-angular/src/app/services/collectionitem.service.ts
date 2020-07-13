import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import {CollectionItem} from '../models/collectionitem';

@Injectable({
  providedIn: 'root'
})
export class CollectionitemService {
  private collectionItemUrl = "http://localhost:8182/Collecticon/item/";
  private collectionAllItemUrl = "http://localhost:8182/Collecticon/item/all/";


  constructor(private httpClient:HttpClient) { }

  getCollectionItemById(itemId: String){
    const url = `${this.collectionItemUrl}/${itemId}`;
    return this.httpClient.get<CollectionItem>(url);
  }

  getCollectionAllItem(){
    const url = `${this.collectionAllItemUrl}`;
    return this.httpClient.get<CollectionItem[]>(url);
  }

}
