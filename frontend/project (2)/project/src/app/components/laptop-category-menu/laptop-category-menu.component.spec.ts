import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LaptopCategoryMenuComponent } from './laptop-category-menu.component';

describe('LaptopCategoryMenuComponent', () => {
  let component: LaptopCategoryMenuComponent;
  let fixture: ComponentFixture<LaptopCategoryMenuComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [LaptopCategoryMenuComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(LaptopCategoryMenuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
