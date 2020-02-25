import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule }   from '@angular/forms';
import { MasterComponent } from './master/master.component';
import { HttpClientModule } from '@angular/common/http';
import { AppointmentComponent } from './appointment/appointment.component';
import { RouterModule, Routes } from '@angular/router';

const appRoutes: Routes = [
    { path: 'masters', component: MasterComponent },
    { path: 'appointment', component: AppointmentComponent, data: { title: 'appointment' } },
];

@NgModule({
    imports:      [ RouterModule.forRoot(appRoutes), BrowserModule, FormsModule, HttpClientModule ],
    declarations: [ MasterComponent, AppointmentComponent ],
    bootstrap:    [ MasterComponent, AppointmentComponent ]
})
export class AppModule { }