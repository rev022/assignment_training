package myOwnAutoShopProject;

public class Truck extends Car {
	int wt;
	
	public Truck(int a) {
		this.wt=a;
	}
	public double getsalesprice(int w, double r){
		if (w>2000) {
			return r*0.9;
		}
		else return r*0.8;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck t=new Truck(500);
		t.speed=200;
		t.regprice=500000;
		t.colour="red";
		t.display();
		System.out.println("Weight is "+t.wt+" kgs");
		System.out.println("Sale Price is "+t.getsalesprice(t.wt,t.regprice));
	}

}
