import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';
import { Observable, of, Subject } from 'rxjs';

class Master{
    id: number;
    firstName: string;
    lastName: string;
    phone: string;

    constructor(firstName: string, lastName: string, phone: string) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
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
    console.log("log")
      }
}
