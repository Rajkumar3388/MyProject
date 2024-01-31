import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { CheckoutService } from '../../service/checkout-service.service';


@Component({
  selector: 'app-checkout',
  templateUrl: './checkout.component.html',
  styleUrl: './checkout.component.css'
})
export class CheckoutComponent {
  checkoutFormGroup: FormGroup
  creditCardMonths: number[];
  creditCardYears: number[];


  constructor(private formBuilder: FormBuilder,
    private checkoutService: CheckoutService) {

  }
  ngOnInit() {
    this.checkoutFormGroup = this.formBuilder.group({
      customer: this.formBuilder.group({
        firstName: [''],
        lastName: [''],
        email: [''],
      }),
      shippingAddress: this.formBuilder.group({
        street: [''],
        city: [''],
        state: [''],
        country: [''],
        zipCode: [''],
      }),
      billingAddress: this.formBuilder.group({
        street: [''],
        city: [''],
        state: [''],
        country: [''],
        zipCode: [''],
      }),
      creditCard: this.formBuilder.group({
        cardType: [''],
        nameOnCard: [''],
        cardNumber: [''],
        securityCode: [''],
        expirationMonth: [''],
        expirationYear: [''],
      }),
    });

    const startMonth = new Date().getMonth() + 1;
    console.log(startMonth);

    this.checkoutService.getCreditCardMonths(startMonth).subscribe((data: number[]) => {
      this.creditCardMonths = data;
    });

    this.checkoutService.getCreditCardYears().subscribe((data: number[]) => {
      this.creditCardYears = data;
    });
  }

  onSubmit() {
    console.log(this.checkoutFormGroup?.get('customer')?.value);
    console.log("Email Id:" + this.checkoutFormGroup?.get('customer')?.value.email);
  }
  copyShippingAddressToBillingAddress(event: any) {
    if (event.target.checked) {
      this.checkoutFormGroup.controls?.['billingAddress'].setValue(
        this.checkoutFormGroup.controls?.['shippingAddress'].value);
    } else {
      this.checkoutFormGroup.controls?.['billingAddress'].reset();
    }
  }
}