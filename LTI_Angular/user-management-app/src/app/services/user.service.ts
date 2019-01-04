import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from 'src/model/user.model';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  //Dependency Injection - Injecting built in Http service inside constructor
  constructor(private Http:HttpClient) { }

  baseURL : string = "http://localhost:3000/users";

  //get all users
  getUsers(){
    return this.Http.get<User[]>(this.baseURL);
  }

  //get all users by Id
  getUsersById(Id:number){
    return this.Http.get<User>(this.baseURL+"/"+Id);
  }

  //Add users
  createUser(user:User){
    return this.Http.post(this.baseURL,user);
  }

  //update users
  updateUsers(user:User){
    return this.Http.put(this.baseURL+'/'+user.id,user);
  }

  //delete users
  deleteUsers(Id:number){
    return this.Http.delete(this.baseURL+'/'+Id);
  }
}
