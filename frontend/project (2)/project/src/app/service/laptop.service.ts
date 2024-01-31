import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Laptop } from '../common/laptop';
import { LaptopCategory } from '../common/laptop-category';

@Injectable({
  providedIn: 'root'
})
export class LaptopService {

  baseUrl = 'http://localhost:8181/myapp/laptop';
  categoryUrl = 'http://localhost:8181/myapp/categories';

  constructor(private http: HttpClient) { }

  getLaptopList(theCategoryId: number | string | null): Observable<Laptop[]> {
    const categoryUrl = `${this.baseUrl}/laptopsByCategories/${theCategoryId}`;
    //http://localhost:8181/myapp/laptop/laptopsByCategories/1
    return this.http.get<Laptop[]>(categoryUrl);
  }


  

  getLaptopCategories(): Observable<LaptopCategory[]> {
    return this.http.get<LaptopCategory[]>(this.categoryUrl);
  }

  searchLaptops(theKeyword: string | null): Observable<Laptop[]> {
    const searchUrl = `${this.baseUrl}/search/${theKeyword}`;
    return this.http.get<Laptop[]>(searchUrl);
  }

  getLaptop(thelaptopId: number | string | null): Observable<Laptop> {
    const laptopUrl = `${this.baseUrl}/${thelaptopId}`;
    return this.http.get<Laptop>(laptopUrl);
  }
}

interface GetResponseLaptops {

  laptops: Laptop[];

};
interface GetResponseCategories {
  laptopCategory: LaptopCategory[];
};


