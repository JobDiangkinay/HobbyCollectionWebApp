import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import {HttpClientModule} from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CollectionitemComponent } from './components/collectionitem/collectionitem.component';
import { CollectionListComponent } from './components/collection-list/collection-list.component';

@NgModule({
  declarations: [
    AppComponent,
    CollectionitemComponent,
    CollectionListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
