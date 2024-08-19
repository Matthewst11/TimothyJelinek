import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddFlightComponent } from './components/add-flight/add-flight.component';
import { EditFlightComponent } from './components/edit-flight/edit-flight.component';
import { FlightListComponent } from './components/flight-list/flight-list.component';
import { FlightsComponent } from './components/flights/flights.component';
import { FlightData } from './components/models/FlightData';

const routes: Routes = [
  {path:'flights', component: FlightsComponent,
    children:[{path:'show', component:FlightListComponent},
              {path:'add', component:AddFlightComponent},
              {path:'edit/:id', component:EditFlightComponent}]}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
