import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { CustomerRegistration } from '../common/customerregistration';

@Injectable({
  providedIn: 'root'
})
export class UserServiceService {
  
  baseUrl: string = "http://localhost:8181/myapp/customers"

  constructor(private http: HttpClient) { }

  createCustomer(custemer: CustomerRegistration):Observable<CustomerRegistration>{
    return this.http.post<CustomerRegistration>(this.baseUrl,custemer)
  }

  getCustomers(data: any): Observable<any> {
    return this.http.post<any>(`${this.baseUrl}/Valid`, data);
  }
}