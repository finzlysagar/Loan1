import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-showscheduler',
  templateUrl: './showscheduler.component.html',
  styleUrls: ['./showscheduler.component.css']
})
export class ShowschedulerComponent implements OnInit {

  constructor(public api:ApiService) { }

  formData=null;
  ngOnInit(): void {
    this.api.getShedule().subscribe((data:any)=>{
    this.formData=data;
    console.log(this.formData)
  })
}

}
