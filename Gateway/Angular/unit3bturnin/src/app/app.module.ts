import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavComponent } from './components/nav/nav.component';
import { FooterComponent } from './components/footer/footer.component';
import { AboutModule } from './components/about/about.module';
import { AddFlightModule } from './components/add-flight/add-flight.module';
import { EditFlightModule } from './components/edit-flight/edit-flight.module';
import { HomeModule } from './components/home/home.module';
import { FlightListModule } from './components/flight-list/flight-list.module';
@NgModule({
  declarations: [
    AppComponent,
    NavComponent,
    FooterComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    AboutModule,
    AddFlightModule,
    EditFlightModule,
    HomeModule,
    FlightListModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
