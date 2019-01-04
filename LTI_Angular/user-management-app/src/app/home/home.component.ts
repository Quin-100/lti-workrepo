import { Component, OnInit } from '@angular/core';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  submitted : boolean =   true;
  //date
  todaysDate = new Date();
  //JSON Data
  cust = {
    name : 'Winston',
    age : 150,
    address : {
      city : 'Mumbai',
      State : 'Maharashtra'
    }
  };

  //Array data
  months = ["Jan","Feb","Mar","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec"];

  constructor() { }

  ngOnInit() {
  }

}
