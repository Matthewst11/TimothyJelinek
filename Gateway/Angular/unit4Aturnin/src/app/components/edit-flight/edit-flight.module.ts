import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { EditFlightComponent } from './edit-flight.component';

const routes: Routes = [
  {path:'edit/:id', component:EditFlightComponent}
]


@NgModule({
  declarations: [EditFlightComponent],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ],
  exports:[EditFlightComponent, RouterModule]
})
export class EditFlightModule { }
