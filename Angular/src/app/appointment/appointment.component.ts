import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';
import { Observable, of, Subject } from 'rxjs';

class Reservation{
    clientName: number;
    clientPhone: number;
    masterId: number;
    date: string;
    time: string;

    constructor(clientName, clientPhone,masterId,date,time) {
        this.clientName = clientName;
        this.clientPhone = clientPhone;
        this.masterId = masterId;
        this.date = date;
        this.time = time;
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
  date: string;
  time: string;
  httpdata;

  constructor(private http: HttpClient) {}

  ngOnInit(): void {
        this.http.get('http://localhost:8080/masters/all').pipe(map((response) => response)).
        subscribe((data) => {this.displaydata(data);});
      }
    displaydata(data) {this.httpdata = data; console.log(data); }

    addReservation(): void {
      this.time = this.time + ":00";
      this.http.post('http://localhost:8080/reservations', new Reservation(this.name,this.phone,this.masterId,this.date,this.time)).pipe(map((response) => response)).
      subscribe((data) => {console.log(data);});
      window.location.reload();
      }
}
