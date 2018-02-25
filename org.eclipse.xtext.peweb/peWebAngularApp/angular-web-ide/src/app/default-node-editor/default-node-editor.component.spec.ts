import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DefaultNodeEditorComponent } from './default-node-editor.component';

describe('DefaultNodeEditorComponent', () => {
  let component: DefaultNodeEditorComponent;
  let fixture: ComponentFixture<DefaultNodeEditorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DefaultNodeEditorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DefaultNodeEditorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
