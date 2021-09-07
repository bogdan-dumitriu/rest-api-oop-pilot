import {Component, OnInit} from '@angular/core';
import {AlertService} from './alert.service';

@Component({
  selector: 'alert',
  templateUrl: './alert.component.html',
  styleUrls: ['./alert.component.css']
})

export class AlertComponent implements OnInit {
  message: any;

  public static readonly MAX_COUNT_CSV: number = 10000;

  constructor(private alertService: AlertService) { }

  ngOnInit() {
    this.alertService.getMessage().subscribe(message => { this.message = message; });
  }

  clearAlert():void {
    this.alertService.clearAlert();
  }
}
