 class Prod{
    pId:number=33;
    pName: string = "Phone"
    pPrice: number= 44444;

    constructor(i:number, n:string, b:number){
        
        this.pId=i;
        this.pName=n;
        this.pPrice=b;
    }

    Price():number{
       let gst:number= 100;
        return this.pPrice = this.pPrice+gst;
    }

    display(){
        console.log(this.pId);
        console.log(this.pName);
        console.log(this.pPrice);
    }


}

var f1 = new Prod(333,"phone",4444);
var u= f1.Price();
f1.display();