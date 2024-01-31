import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Route, Router } from '@angular/router';
import { UserServiceService } from '../../service/user-service.service';
import { Customerregistration } from '../../common/customerregistration';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  

  constructor(private userService: UserServiceService, private router: Router) { }


  loginForm = new FormGroup({
    userEmail: new FormControl('', [Validators.required, Validators.maxLength(30)]),
    userPassword: new FormControl('', [Validators.required, Validators.maxLength(30)]),
  
  });
  login(insert: any) {
    console.log(this.loginForm);
  }
  get userEmail() {
    return this.loginForm.get('userEmail');

  }
  get userPassword() {
    return this.loginForm.get('userPassword')
  }
  submit() {
    if (this.userEmail?.value?.length === 0 || this.userPassword?.value?.length == 0 || this.userEmail?.invalid || this.userPassword?.invalid) {
      alert("enter valid details")
    }
    else {
      alert(JSON.stringify(this.loginForm.value))
      let customer: Customerregistration = new Customerregistration()
      

      customer.userEmail = this.loginForm.value.userEmail
      customer.userPassword = this.loginForm.value.userPassword
      


      this.userService.getCustomerUser(customer).subscribe
        (data => {
            console.log(data)
            this.userService.getCustomerUser(customer).subscribe()
            localStorage.setItem('currentUser', JSON.stringify({ email: this.userEmail?.value }));
            alert("loged in")
            this.router.navigate(['/user-page'])
          },
          error => {
            alert("invalid credentials")
          }

        )
      

    }
  }

}
