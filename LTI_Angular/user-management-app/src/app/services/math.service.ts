import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MathService {

  constructor() { }

  add(num1:number,num2:number) : number{
    return (num1 + num2);
  }

  //get all users by Id
  multiply(num1:number,num2:number) : number{
    return (num1 * num2 );
  }
}
