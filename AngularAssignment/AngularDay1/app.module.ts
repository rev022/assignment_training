import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { Directive } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MyComp2 } from './MyComp2';
import { MyComp3 } from './MyComp3';
import{ifExample} from  './ifExample'
import { CustomDirectives } from './CustomDirectives';
import { MyComponent } from './MyComponent';
import { Product } from './Product';

@NgModule({
  declarations: [
    AppComponent,MyComponent, MyComp2, MyComp3,ifExample,CustomDirectives,Product
  ],
  imports: [
    BrowserModule,FormsModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
