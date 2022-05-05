package week1.day2assignment;


public class Car {
	public void applyBrake() {
		System.out.println("apply Brake");
	}
public void applyGear() {
	System.out.println("Apply Gear ");
}
public void switchOnAc() {
	System.out.println("switching on Ac ");
}
public void applyAccelerate() {
	System.out.println("apply accelerate");

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Car();
		car.applyBrake();
		car.applyGear();
		car.switchOnAc();
		car.applyAccelerate();
	}
}
