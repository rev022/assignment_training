class Stud{

sid:number=22;
sName:string="rev";
sClass:string="fifth"
constructor(i:number, n:string, s:string){
    this.sid=i;
    this.sName=n;
    this.sClass=s;


    
}


display(){
    console.log(this.sid);
    console.log(this.sName);
    console.log(this.sClass);

}

}

var e1 = new Stud(333,"rfff","first");
e1.display();

var e2 = new Stud(66,"ruhi","second");
e2.display();