import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { CollectionitemComponent } from './components/collectionitem/collectionitem.component';


const routes: Routes = [
  { path: '', redirectTo: 'Collecticon', pathMatch: 'full' },
  { path: 'Collecticon',component: CollectionitemComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
