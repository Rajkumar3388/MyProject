import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { UserServiceService } from '../../service/user-service.service';

@Component({
  selector: 'app-user-registration',
  templateUrl: './user-registration.component.html',
  styleUrl: './user-registration.component.css'
})
export class UserRegistrationComponent {
  userForm: FormGroup;

  constructor(private formBuilder: FormBuilder,
    private service: UserServiceService,
    private router: Router) { }

  ngOnInit() {
    this.userForm = this.formBuilder.group({
      userName: ['', [Validators.required, Validators.pattern('^[a-zA-z]*$')]],
      userEmail: ['', [Validators.required, Validators.email]],
      userPassword: ['', [Validators.required]],
      gender:['',[Validators.required]],
      mobileNumber: ['', [Validators.required, Validators.pattern('^[6-9][0-9]{9}$')]],
      
    });

  }
  createCustomers() {
    if (this.userForm.valid) {
      this.service.createCustomer(this.userForm.value)
        .subscribe((data: any) => {
          alert("Registration Successful");
          this.router.navigate(['/login']);


        })
    } else {
      alert("Please fill all the fields correctly")
    }
  }
}



