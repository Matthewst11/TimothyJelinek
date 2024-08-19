import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { AddFlightComponent } from './add-flight.component';

const routes: Routes = [
  {path:'add', component:AddFlightComponent}
]

@NgModule({
  declarations: [AddFlightComponent],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ],
  exports:[AddFlightComponent, RouterModule]
})
export class AddFlightModule { }
