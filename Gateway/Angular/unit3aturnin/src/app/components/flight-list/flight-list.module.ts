import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { FlightListComponent } from './flight-list.component';

const routes: Routes = [
  {path:'flights', component:FlightListComponent}
]

@NgModule({
  declarations: [FlightListComponent],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ],
  exports:[FlightListComponent, RouterModule]
})
export class FlightListModule { }
