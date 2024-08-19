import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { EditFlightComponent } from './edit-flight.component';
import { FormControl, Validators, FormGroup } from '@angular/forms';

const routes: Routes = [
  {path:'edit/:ID', component:EditFlightComponent}
]



@NgModule({
  declarations: [EditFlightComponent],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ],
  exports:[EditFlightComponent, RouterModule]
})


export class EditFlightModule {
  myForm = new FormGroup({
    ID: new FormControl(),
    FlightNo: new FormControl("",[Validators.required, Validators.minLength(5), Validators.maxLength(10)]),
    Airline: new FormControl("",[Validators.required, Validators.minLength(2), Validators.maxLength(25)]),
    triptype: new FormControl([Validators.required]),
    departureAirport: new FormControl("",[Validators.required, Validators.minLength(2), Validators.maxLength(5)]),
    departDate: new FormControl("",[Validators.required]),
    returndate: new FormControl("",[Validators.required])
  })
 }
