import { Component } from '@angular/core';
import { Laptop } from '../../common/laptop';
import { LaptopService } from '../../service/laptop.service';
import { ActivatedRoute } from '@angular/router';
import { CartItem } from '../../common/cart-item';
import { CartService } from '../../service/cart.service';

@Component({
  selector: 'app-laptop-details',
  templateUrl: './laptop-details.component.html',
  styleUrl: './laptop-details.component.css'
})
export class LaptopDetailsComponent {


  laptop: Laptop = new Laptop();

  constructor(
    private service: LaptopService,
    private route: ActivatedRoute,
    private cartService: CartService

  ) { }

  ngOnInit() {
    this.route.paramMap.subscribe(() => {
      this.listLaptops();
    })
  }

  listLaptops() {
    const thelaptopId: number | string | null =
      this.route.snapshot.paramMap.get("laptopId");
    this.service.getLaptop(thelaptopId).subscribe((data) => {
      this.laptop = data;
    })
  }

  //add to cart
  addToCart(theProdcuct: Laptop) {
    const theCartItem = new CartItem(theProdcuct);
    this.cartService.addToCart(theCartItem);
  }

}
