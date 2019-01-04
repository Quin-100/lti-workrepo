import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { AddUserComponent } from './add-user/add-user.component';
import { ListUserComponent } from './list-user/list-user.component';
import { EditUserComponent } from './edit-user/edit-user.component';
import { CalculatorComponent } from './calculator/calculator.component';
import { TeowaydatabindingComponent } from './components/teowaydatabinding/teowaydatabinding.component';
import { LifecycleComponent } from './components/lifecycle/lifecycle.component';

const routes: Routes = [
  {path:'login',component:LoginComponent},
  {path:'home',component:HomeComponent},
  {path:'add-user',component:AddUserComponent},
  {path:'list-user',component:ListUserComponent},
  {path:'edit-user',component:EditUserComponent},
  {path:'calculator',component:CalculatorComponent},  
  {path:'twoway', component:TeowaydatabindingComponent},
  {path:'lifecycle', component:LifecycleComponent},
  {path:'',redirectTo:'/home', pathMatch:'full'},
  {path:'**', component:HomeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
