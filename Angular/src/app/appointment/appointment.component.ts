import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';
import { Observable, of, Subject } from 'rxjs';

class Reservation{
    clientId: number;
    masterId: number;
    timeStart: string;

    constructor(clientId: number, masterId: number, timeStart: string) {
        this.clientId = clientId;
        this.masterId = masterId;
        this.timeStart = timeStart;
    }
}

@Component({
  selector: 'appointment',
  templateUrl: './appointment.component.html',
  styleUrls: ['./appointment.component.css']
})
export class AppointmentComponent implements OnInit {
  name: string;
  phone: string;
  masterId: number;
  time: string;
  httpdata;

  constructor(private http: HttpClient) {}

  ngOnInit(): void {
        this.http.get('http://localhost:8080/masters/all').pipe(map((response) => response)).
        subscribe((data) => {this.displaydata(data);});
      }
    displaydata(data) {this.httpdata = data; console.log(data); }

    addReservation(): void {
      this.http.post('http://localhost:8080/reservations', new Reservation(1, this.masterId, this.time)).pipe(map((response) => response)).
      subscribe((data) => {console.log(data);});
      window.location.reload();
      }
}
