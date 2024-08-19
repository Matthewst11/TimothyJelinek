import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';


@Component({
  selector: 'app-add-flight',
  templateUrl: './add-flight.component.html',
  styleUrls: ['./add-flight.component.css']
})


export class AddFlightComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

flights: string[] = [];

  onSubmit(f:NgForm) {
    this.flights.push(f.value);
    console.log(f);
  }
}
