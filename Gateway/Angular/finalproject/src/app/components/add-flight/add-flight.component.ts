import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { FlightService } from 'src/app/services/flight.service';


@Component({
  selector: 'app-add-flight',
  templateUrl: './add-flight.component.html',
  styleUrls: ['./add-flight.component.css']
})


export class AddFlightComponent implements OnInit {

  constructor(private flightService: FlightService) { }

  ngOnInit(): void {
  }

flights: string[] = [];

  onSubmit(f:NgForm) {
    this.flightService.addFlight(f.value)
      .subscribe(
        data=> console.log(f.value)
      );
  }
}
