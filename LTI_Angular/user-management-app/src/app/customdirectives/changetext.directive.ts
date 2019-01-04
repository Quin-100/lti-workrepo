import { Directive, ElementRef } from '@angular/core';

@Directive({
  selector: '[changeText]'
})
export class ChangetextDirective {

  constructor(element : ElementRef) {
    element.nativeElement.innerText = "Welcome to Custom Directive";
  }

}
