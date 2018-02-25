import { Component, Input, EventEmitter, Output, OnInit, ViewEncapsulation } from '@angular/core';

@Component({
  selector: 'default-einput',
  templateUrl: './default-einput.component.html',
  styleUrls: ['./default-einput.component.css'],
  encapsulation: ViewEncapsulation.None
})
export class DefaultEinputComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  	this.val = this.initialValue;
  }

  @Input() type : string;
  @Input() initialValue: any;
  @Output() value = new EventEmitter<any>();
  val : any;


  test(val:any){
  	console.log(this.value);
  	//TODO change this so only emits after a period of nothing
  	this.value.emit(val);
  	console.log("yay!");
  }
}
