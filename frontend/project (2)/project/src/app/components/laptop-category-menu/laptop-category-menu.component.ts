import { Component } from '@angular/core';
import { LaptopCategory } from '../../common/laptop-category';
import { LaptopService } from '../../service/laptop.service';

@Component({
  selector: 'app-laptop-category-menu',
  templateUrl: './laptop-category-menu.component.html',
  styleUrl: './laptop-category-menu.component.css'
})
export class LaptopCategoryMenuComponent {
  laptopCategories: LaptopCategory[];

  constructor(private laptopService: LaptopService) { }

  ngOnInit() {
    this.listLaptopCategories();
  }

  listLaptopCategories() {
    this.laptopService.getLaptopCategories().subscribe((data) => {
      this.laptopCategories = data;

    })
  }

}
