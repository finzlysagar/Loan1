import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DashboardComponent } from './dashboard/dashboard.component';

import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatCardModule } from '@angular/material/card';
import {MatButtonModule} from '@angular/material/button';
import {MatFormFieldModule} from '@angular/material/form-field';
import { AppyforloanComponent } from './appyforloan/appyforloan.component';
import { ShowLoansComponent } from './show-loans/show-loans.component';
import { ShowschedulerComponent } from './showscheduler/showscheduler.component';
import { ReactiveFormsModule} from "@angular/forms"
import { HttpClientModule} from "@angular/common/http"
import { MatToolbarModule } from "@angular/material/toolbar"





@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    AppyforloanComponent,
    ShowLoansComponent,
    ShowschedulerComponent    
   
  ],
  imports: [
  BrowserModule,
  AppRoutingModule,
  BrowserAnimationsModule,
  MatCardModule,
  MatButtonModule,
  MatFormFieldModule,
  ReactiveFormsModule,
  HttpClientModule,
  MatToolbarModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
