import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule }   from '@angular/forms';
import { AppComponent }   from './app.component';
import { MasterComponent } from './master/master.component';
import { HttpClientModule } from '@angular/common/http';


@NgModule({
    imports:      [ BrowserModule, FormsModule, HttpClientModule ],
    declarations: [ AppComponent, MasterComponent ],
    bootstrap:    [ AppComponent, MasterComponent ]
})
export class AppModule { }