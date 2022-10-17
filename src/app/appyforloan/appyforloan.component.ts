import { Component, OnInit } from '@angular/core';
import { FormBuilder,FormControl,FormGroup } from '@angular/forms'
import { Router } from '@angular/router';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-appyforloan',
  templateUrl: './appyforloan.component.html',
  styleUrls: ['./appyforloan.component.css'],
})
export class AppyforloanComponent implements OnInit {

  form !:FormGroup
  
  constructor(public fb:FormBuilder,public router:Router,public api:ApiService) { }
  ngOnInit(): void {
    this.form=this.fb.group({
      loanAmount:[null],
      paymentFrequency:[null],
      tenure:[null],
      interestRate:[null],
      PaymentTerm:[null]
    })
  }
  ragister()
  {
      console.log(this.form.value)
      this.api.genrateLoan(this.form.value).subscribe((data:any)=>{
        console.log(data)
      })
  }

}
