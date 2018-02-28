import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomNodeEditorComponent } from './custom-node-editor.component';

describe('CustomNodeEditorComponent', () => {
  let component: CustomNodeEditorComponent;
  let fixture: ComponentFixture<CustomNodeEditorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CustomNodeEditorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CustomNodeEditorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
