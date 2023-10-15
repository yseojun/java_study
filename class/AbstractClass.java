public class AbstractClass {
	public static void main(String[] args) {
		Vehicle a = new E_Truck("testing!");

		System.out.println(a);
	}
}

class Vehicle {
	String plate;
	double gas_liters;
	
	Vehicle() {
		plate = "TBD";
	}

	Vehicle(String a) {
		plate = a;
	}
	
	void	refuel(){
		System.out.println("* Plate : " + plate + "\n- [Fuel] Gasoline");
	}
}

class Truck extends Vehicle {
	Truck(String plate) { super(plate); };
	
	@Override void	refuel(){
		System.out.println("* Plate : " + plate + "\n- [Fuel] Disel");
	}
}

class E_Truck extends Truck {
	E_Truck(String plate) { super(plate); };
	
	@Override void	refuel(){
		System.out.println("* Plate : " + plate + "\n- [Fuel] Electric");
	}
	
	void charge() {
		System.out.println("* Plate : " + plate + "\n- [Status] Charging");
	}

	public String toString() {
		return this.plate;
	}
}