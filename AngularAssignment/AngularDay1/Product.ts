import { Component } from "@angular/core";

@Component({

    selector:'my-prod',

    template: `
<div style="text-align:center">

    <p> products  are </p>
    <ul *ngFor = "let h of prod">
    <h2>{{h}} </h2>

    </ul>

    <h1>The product is : {{prod[0]}} </h1>
    <h1>The price for the product is : {{price[0]}} </h1>
    <h1>  <img src={{image[0]}} width=300px height=300px> </h1>

    <p> Users  are </p>
    <ul *ngFor = "let u of users">
    <h2>{{u}} </h2>
</ul>

    </div>

    `

})

export class Product{

    prod = ["Mobile","Laptop","Tablet"];
    price=[1000,23333,4444];
    image=["./assets/mobile.jpg","./assets/laptop.jpg","./assets/tablet.jpg"]
users=["revathi","dhanush","sharan"];


}