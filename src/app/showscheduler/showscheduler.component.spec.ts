import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowschedulerComponent } from './showscheduler.component';

describe('ShowschedulerComponent', () => {
  let component: ShowschedulerComponent;
  let fixture: ComponentFixture<ShowschedulerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ShowschedulerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ShowschedulerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
