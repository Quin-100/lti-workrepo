import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {ReactiveFormsModule,FormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { AddUserComponent } from './add-user/add-user.component';
import { ListUserComponent } from './list-user/list-user.component';
import { EditUserComponent } from './edit-user/edit-user.component';
import { LoginComponent } from './login/login.component';
import { UserService } from './services/user.service';
import { CalculatorComponent } from './calculator/calculator.component';
import { MathService } from './services/math.service';
import { TeowaydatabindingComponent } from './components/teowaydatabinding/teowaydatabinding.component';
import { SqrtPipe } from './custompipes/sqrt.pipe';
import { ChangetextDirective } from './customdirectives/changetext.directive';
import { LifecycleComponent } from './components/lifecycle/lifecycle.component';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AddUserComponent,
    ListUserComponent,
    EditUserComponent,
    LoginComponent,
    CalculatorComponent,
    TeowaydatabindingComponent,   //All Compponents
    SqrtPipe,                     //All pipes
    ChangetextDirective, LifecycleComponent           //All directives are part of declarations
  ],
  imports: [
    BrowserModule,                //All predefined modules are part of imports
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [
    UserService,MathService       //All services are part of providers
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
