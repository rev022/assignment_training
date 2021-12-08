import {Bank } from "./Bank";
class Savingsacc extends Bank{

   
     deposite(){
         console.log("subclass");
     }
    

}

var m1 = new Savingsacc(45,"kkk",78888);
m1.deposite();