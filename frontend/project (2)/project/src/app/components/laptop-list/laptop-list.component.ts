import { Component, OnInit } from '@angular/core';
import { Laptop } from '../../common/laptop';
import { LaptopService } from '../../service/laptop.service';
import { ActivatedRoute, Router } from '@angular/router';
import { CartItem } from '../../common/cart-item';
import { CartService } from '../../service/cart.service';

@Component({
  selector: 'app-laptop-list',
  templateUrl: './laptop-list.component.html',
  styleUrls: ['./laptop-list.component.css']
})
export class LaptopListComponent implements OnInit {

  laptops: Laptop[] = [];
  currentCategoryId: string | number | null = '1'; // Default category ID
  searchMode: boolean = false;
  keyword: string | null = null;



  constructor(
    private laptopService: LaptopService,
    private route: ActivatedRoute,
    private Cartservice: CartService
  ) { }


  ngOnInit() {
    this.route.paramMap.subscribe(() => {
      this.listLaptops();
    });
  }

  listLaptops() {
    this.searchMode = this.route.snapshot.paramMap.has('keyword');
    console.log(this.searchMode)
    if (this.searchMode) {
      this.handleSearchLaptops();
    } else {
      this.handleListLaptops();
    }
  }

  handleSearchLaptops() {
    this.keyword = this.route.snapshot.paramMap.get('keyword');
    this.laptopService.searchLaptops(this.keyword).subscribe(
      (data) => {
        this.laptops = data;
      },
      (error) => {
        console.error('Error fetching search results:', error);
        // Handle the error, e.g., show a user-friendly message
      }
    );
  }

  handleListLaptops() {
    this.currentCategoryId = this.route.snapshot.paramMap.get('categoryId');
    //this.currentCategoryId = categoryIdParam ?? '1'; // Default to '1' if no category ID is provided

    this.laptopService.getLaptopList(this.currentCategoryId).subscribe(
      (data) => {
        this.laptops = data;
      },
      (error) => {
        console.error('Error fetching laptop list:', error);
        // Handle the error, e.g., show a user-friendly message
      }
    );
  }
  
  //add to cart
  addToCart(theProdcuct: Laptop) {
    const theCartItem = new CartItem(theProdcuct);
    this.Cartservice.addToCart(theCartItem);
  }

}
