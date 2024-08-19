import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './about.component';

const routes: Routes = [
  {path:'about', component:AboutComponent}
]

@NgModule({
  declarations: [AboutComponent],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ],
  exports:[AboutComponent, RouterModule]
})
export class AboutModule { }
