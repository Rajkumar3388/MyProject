import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LaptopListComponent } from './components/laptop-list/laptop-list.component';
import { LaptopCategoryMenuComponent } from './components/laptop-category-menu/laptop-category-menu.component';
import { LaptopDetailsComponent } from './components/laptop-details/laptop-details.component';
import { CartDetailsComponent } from './components/cart-details/cart-details.component';
import { CheckoutComponent } from './components/checkout/checkout.component';
import { LoginComponent } from './components/login/login.component';
import { HomePageComponent } from './components/home-page/home-page.component';
import { AboutUsComponent } from './components/about-us/about-us.component';
import { ContactUsComponent } from './components/contact-us/contact-us.component';
import { UserRegistrationComponent } from './components/user-registration/user-registration.component';



const routes: Routes = [
  { path: '', component: HomePageComponent },
  {path: 'user-registration', component: UserRegistrationComponent},
  { path: 'login', component: LoginComponent },
  { path: "about-us", component: AboutUsComponent },
  { path: "contact-us", component: ContactUsComponent },
  { path: "home-page", component: HomePageComponent },
  { path: 'checkout', component: CheckoutComponent },
  { path: 'cart-details', component: CartDetailsComponent },
  { path: 'laptops/:id', component: LaptopDetailsComponent },
  { path: 'Laptop', component: LaptopListComponent },
  { path: 'search/:keyword', component: LaptopListComponent },
  { path: 'LaptopCategory', component: LaptopCategoryMenuComponent },
  { path: 'category/:categoryId', component: LaptopListComponent },
  { path: 'details', component: LaptopDetailsComponent }
 


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
