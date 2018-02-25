import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DefaultEinputComponent } from './default-einput.component';

describe('DefaultEinputComponent', () => {
  let component: DefaultEinputComponent;
  let fixture: ComponentFixture<DefaultEinputComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DefaultEinputComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DefaultEinputComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
