import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AppyforloanComponent } from './appyforloan.component';

describe('AppyforloanComponent', () => {
  let component: AppyforloanComponent;
  let fixture: ComponentFixture<AppyforloanComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AppyforloanComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AppyforloanComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
