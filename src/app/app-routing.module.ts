import { componentFactoryName } from '@angular/compiler';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppyforloanComponent } from './appyforloan/appyforloan.component';
import { ShowLoansComponent } from './show-loans/show-loans.component';
import { ShowschedulerComponent } from './showscheduler/showscheduler.component';

const routes: Routes = [
  {
    path:"loan",component:AppyforloanComponent
  
  },
  
  {
    path:"showloan",component:ShowLoansComponent
  },
  {
    path:"showshedule",component:ShowschedulerComponent
  }
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
