import { Component, Input, OnInit } from '@angular/core';
import { FlightService } from 'src/app/services/flight.service';
import { Flight } from '../models/flight';
import { FlightData } from '../models/FlightData';

@Component({
  selector: 'app-flight-list',
  templateUrl: './flight-list.component.html',
  styleUrls: ['./flight-list.component.css']
})
export class FlightListComponent implements OnInit {

  show = true;
  count: number; 
  
  

  constructor(private flightService: FlightService) {
    
   }
   flights: Flight[];
  ngOnInit(): void {
    this.loadData();
  }
  flightData = FlightData;
  title = 'Flight Scheduler';

  deleteFlight(id : any){
    console.log(id)
  }

  loadData() {
    this.flightService.getFlights()
    .subscribe(
      data=> {
        this.flights = data;
        this.count = this.flights.length;
      }
      );
  }
  deleteOne(id: number) {
    this.flightService.deleteFlight(id)
    .subscribe(
      data => {
        this.loadData();
      }
    )
  }

  deleteAll() {
    this.flightService.deleteFlights()
    .subscribe(
      data => {
        this.loadData();
      }
    )
    
  }
}
