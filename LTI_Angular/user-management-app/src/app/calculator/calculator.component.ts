import { Component, OnInit } from '@angular/core';
import { MathService } from '../services/math.service';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {

  //calcForm : FormGroup;
  submitted : boolean = false;
  constructor( private mathService : MathService) { }

  ngOnInit() {
    
  }  

  add(fn:string,sn:string){   
    let res1 = this.mathService.add(parseFloat(fn),parseFloat(sn));
    alert(res1);   
    
  }

  multiply(fn:string,sn:string){
    let res2 = this.mathService.multiply(parseFloat(fn),parseFloat(sn));
    alert(res2);    
  }

}
