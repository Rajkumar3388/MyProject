import { Component } from '@angular/core';
import { CartService } from '../../service/cart.service';


@Component({
  selector: 'app-cart-status',
  templateUrl: './cart-status.component.html',
  styleUrl: './cart-status.component.css'
})
export class CartStatusComponent {
  totalPrice = 0.0;
  totalQuantity = 0;
  constructor(private carServive: CartService) { }

  updateCartStatus() {

    this.carServive.totalPrice.subscribe((data) => {

      this.totalPrice = data;
    });
    this.carServive.totalQuantity.subscribe((data) => {

      this.totalQuantity = data;
    });
  }
  ngOnInit() {
    this.updateCartStatus();
  }
}
