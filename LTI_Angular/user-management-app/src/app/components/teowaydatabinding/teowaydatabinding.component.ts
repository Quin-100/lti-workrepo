import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-teowaydatabinding',
  templateUrl: './teowaydatabinding.component.html',
  styleUrls: ['./teowaydatabinding.component.css']
})
export class TeowaydatabindingComponent implements OnInit {
  firstName:string;

  constructor() { }

  ngOnInit() {
    this.firstName="Winston";
  }

}
