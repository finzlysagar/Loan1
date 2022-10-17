import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api.service';
@Component({
  selector: 'app-show-loans',
  templateUrl: './show-loans.component.html',
  styleUrls: ['./show-loans.component.css']
})
export class ShowLoansComponent implements OnInit {

  constructor(public api:ApiService) { }

  formData=null;
  ngOnInit(): void {
    this.api.getLoan().subscribe((data:any)=>{
      this.formData=data;
      console.log(this.formData)
    })
  }

  


}
