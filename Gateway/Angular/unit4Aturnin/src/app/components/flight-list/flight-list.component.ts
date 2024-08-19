import { Component, Input, OnInit } from '@angular/core';
import { FlightData } from '../models/FlightData';

@Component({
  selector: 'app-flight-list',
  templateUrl: './flight-list.component.html',
  styleUrls: ['./flight-list.component.css']
})
export class FlightListComponent implements OnInit {

  show = true;
  @Input()
  flights = [];

  constructor() { }

  ngOnInit(): void {
  }
  flightData = FlightData;
  title = 'Flight Scheduler';

  deleteFlight(id : any){
    console.log(id)
  }
}
