import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser'; 
import { HttpClientModule } from '@angular/common/http'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavComponent } from './components/nav/nav.component';
import { FooterComponent } from './components/footer/footer.component';
import { AboutModule } from './components/about/about.module';
import { AddFlightModule } from './components/add-flight/add-flight.module';
import { EditFlightModule } from './components/edit-flight/edit-flight.module';
import { HomeModule } from './components/home/home.module';
import { FlightListModule } from './components/flight-list/flight-list.module';
import { ShowHideComponent } from './components/show-hide/show-hide.component';
import { FormsModule } from '@angular/forms';
import { FlightsComponent } from './flights/flights.component';
@NgModule({
  declarations: [
    AppComponent,
    NavComponent,
    FooterComponent,
    ShowHideComponent,
    FlightsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    AboutModule,
    AddFlightModule,
    EditFlightModule,
    HomeModule,
    FlightListModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})

export class AppModule { }
