import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  //Instance variables - Bydefault public in Typescript
  loginForm : FormGroup;
  submitted : boolean = false;
  invalidLogin: boolean = false;

  constructor(private formBuilder : FormBuilder, private router : Router) { }

  onSubmit(){
    this.submitted = true;
    //If validation failed, it should return to validate
    if(this.loginForm.invalid){
      return; 
    }

    let username = this.loginForm.controls.email.value;
    if(this.loginForm.controls.email.value == "amit@gmail.com" && this.loginForm.controls.password.value=="123"){
      localStorage.setItem("username",username);
      this.router.navigate(['list-user']);
    }
    else{
      this.invalidLogin = true;
    }
  }
  
  ngOnInit() {
    this.loginForm = this.formBuilder.group({
      email : ['',Validators.required],
      password : ['',Validators.required]
    });
  }

}
