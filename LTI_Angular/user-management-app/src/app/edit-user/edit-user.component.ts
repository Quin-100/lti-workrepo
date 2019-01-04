import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../services/user.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { User } from 'src/model/user.model';
import { first } from 'rxjs/operators';

@Component({
  selector: 'app-edit-user',
  templateUrl: './edit-user.component.html',
  styleUrls: ['./edit-user.component.css']
})
export class EditUserComponent implements OnInit {

  //Instance variables - Bydefault public in Typescript
  editForm : FormGroup;
  submitted : boolean = false;  
  users : User[];

  constructor(private formBuilder:FormBuilder, private router:Router, private userService:UserService) { }

  ngOnInit() {
    if(localStorage.getItem('username')!=null){
      let id = localStorage.getItem('editUserId');
      if(!id){
        alert('Invalid action.');
        this.router.navigate(['/list-user']);
        return;
      }

      this.editForm = this.formBuilder.group({
        id : [],
        firstName : ['',Validators.required],
        lastName : ['',Validators.required],
        email : ['',Validators.required]
      });

      this.userService.getUsersById(+id)
      .subscribe(data =>{
        this.editForm.setValue(data); 
      });      
    }
      
    else{
      this.router.navigate(['/login']);
    }
  }

  onSubmit(){
    this.submitted = true;
    if(this.editForm.invalid){
      return;
    }
    this.userService.updateUsers(this.editForm.value)
    .pipe(first())
    .subscribe(data => {
      this.router.navigate(['/list-user'])
    },
    error =>{
      alert(error);
    });
  }

  //log off user 
  logout():void{
    if(localStorage.getItem('username')!=null){
      localStorage.removeItem('username');
      this.router.navigate(['/login']);
    }
  }

}
