package myOwnAutoShopProject;

public class Car {

	int speed;
	double regprice;
	String colour;
	
	
	Car(){}
	
	Car(int a, double b, String c){
		this.speed=a;
		this.colour=c;
		this.regprice=b;
	}
	
	public double getsaleprice(){
		return this.regprice*1.18;
	}

	public void display() {
		System.out.println("Speed is " + speed);
		System.out.println("Regular price is " + regprice);
		System.out.println("Colour is " + colour);
	}
	
	public static void main(String args[]) {
		Car c1= new Car(240,500000,"blue");
		
		c1.display();
		System.out.println("Sale price is" + c1.getsaleprice());
	}
	
}
