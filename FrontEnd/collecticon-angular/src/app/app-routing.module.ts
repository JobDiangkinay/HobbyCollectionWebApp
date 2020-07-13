import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { CollectionitemComponent } from './components/collectionitem/collectionitem.component';
import { CollectionListComponent } from './components/collection-list/collection-list.component';


const routes: Routes = [
  { path: '', redirectTo: 'Collecticon', pathMatch: 'full' },
  { path: 'Collecticon',component: AppComponent},
  { path: 'Collecticon/List',component: CollectionListComponent},
  { path: 'Collecticon/List/:itemId',component: CollectionitemComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
