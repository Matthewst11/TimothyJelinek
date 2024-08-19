import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { FlightService } from 'src/app/services/flight.service';
import { Flight } from '../models/flight';

@Component({
  selector: 'app-edit-flight',
  templateUrl: './edit-flight.component.html',
  styleUrls: ['./edit-flight.component.css']
})
export class EditFlightComponent implements OnInit {

  constructor(private flightService: FlightService, private route: ActivatedRoute) { }

  id: number;
  flight = new Flight();
  ngOnInit(): void {
    this.route.paramMap.subscribe(
      params=> this.id = parseInt(params.get('id'))
    );
    this.loadData();
  }
  loadData() {
    this.flightService.getFlight(this.id)
    .subscribe(
    data => this.flight = data
  )}


}
