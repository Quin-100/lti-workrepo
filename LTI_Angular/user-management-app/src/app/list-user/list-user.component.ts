import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from 'src/model/user.model';
import { Router } from '@angular/router';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-list-user',
  templateUrl: './list-user.component.html',
  styleUrls: ['./list-user.component.css']
})
export class ListUserComponent implements OnInit {

  users : User[];
  constructor(private router:Router, private userService : UserService) { }

  addUser():void{
    this.router.navigate(['/add-user']);
  }

  //log off user 
  logout():void{
    if(localStorage.getItem('username')!=null){
      localStorage.removeItem('username');
      this.router.navigate(['/login']);
    }
  }

  //delete user
  deleteUser(user:User):void{
    let result = confirm("Do you want to delete user.");
    if(result){
      this.userService.deleteUsers(user.id)
      .subscribe(data=>{
        this.users = this.users.filter(u=>u!==user);
        this.router.navigate(['list-user']);
      });
     
    }
    
  }

  //update user
  updateUser(user:User):void{
    localStorage.removeItem('editUserId');
    localStorage.setItem('editUserId',user.id.toString());
    this.router.navigate(['/edit-user']);    
  }

  //loading all users as soon as component gets loaded.
  ngOnInit() {
    if(localStorage.getItem('username')!=null){
      this.userService.getUsers()
      .subscribe(data=>{
        this.users = data;
      });
    }
    else{
      this.router.navigate(['/login']);
    }
  }

}
