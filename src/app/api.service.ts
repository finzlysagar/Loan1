import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(private http:HttpClient) { }

 
  genrateLoan(data:any){
    return this.http.post('http://localhost:8080/genratelone',data)
  }
  getLoan(){
    return this.http.get('http://localhost:8080/showloans')
  }
  getShedule()
  {
    return this.http.get('http://localhost:8080/showschedule')
  }

}
