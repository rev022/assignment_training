export class Bank{
    accId:number=33;
    accName: string = "myAccount"
    bal: number= 44444;

    constructor(i:number, n:string, b:number){
        
        this.accId=i;
        this.accName=n;
        this.bal=b;
    }

    deposite(){
        console.log(this.accId);
        console.log(this.accName);
        console.log(this.bal);
    }


}

var e1 = new Bank(333,"gggjjuuyy",4444);
e1.deposite();