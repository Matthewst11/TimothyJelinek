import { Component } from '@angular/core';

@Component({
  selector: 'app-nav',
  templateUrl: './nav.component.html',
  styleUrls: []
})
export class NavComponent {
  navMenus = [
    {"url":"/", "text":"Home", "active":true},
    {"url":"/about", "text":"About", "active":false},
    {"url":"/flights", "text":"Flight List", "active":false},
    {"url":"/add", "text":"Add Flights", "active":false},
  ]
}
