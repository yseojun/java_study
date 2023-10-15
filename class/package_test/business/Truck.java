package business;
import personal.*;
// import를 활용하거나 class를 선언할 때 package 명시
// ex) personal.Vehicle

public class Truck extends Vehicle {
	void extendWarranty(int months) { this.warranty += months; }
}
