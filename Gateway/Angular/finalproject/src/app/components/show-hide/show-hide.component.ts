import { Component, EventEmitter, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-show-hide',
  templateUrl: './show-hide.component.html',
  styleUrls: ['./show-hide.component.css']
})
export class ShowHideComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  isShowHide = true;
  textShowHide = "Hide";

  @Output() isActivated = new EventEmitter<boolean>();

  onShowHide() {
    
  }
}
