import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';
import { Observable, of, Subject } from 'rxjs';

@Component({
  selector: 'master',
  templateUrl: './master.component.html',
  styleUrls: ['./master.component.css']
})
export class MasterComponent implements OnInit {

  firstName = 'firstName';
  lastName = "lastName";
  phone = "phone";

  httpdata;


  constructor(private http: HttpClient) {}

  ngOnInit(): void {
      this.http.get('http://localhost:8080/masters/all').pipe(map((response) => response)).
      subscribe((data) => {this.displaydata(data);});
    }
  displaydata(data) {this.httpdata = data; console.log(data); }
}
