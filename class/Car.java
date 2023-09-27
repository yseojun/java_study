import java.util.Scanner;

public class Car{
	public static void main(String[] args) {
		// 인스턴스 오브젝트 생성을 하지 않고 동작 가능
		Vehicle sedan = new Vehicle("Porche Panamera GTS", 0.14, 90);
		Vehicle coupe = new Vehicle("Porche Panamera GTS", 0.14, 90);

		// static에 접근할 때는 class 이름으로 접근하자
		System.out.println("There are " + Vehicle.vehicles + " vehicles.");

		Vehicle car = new Vehicle();
		car.plate = "Porche 911 GTS";
		car.gas_per_distance = 0.12; car.gas_liters=64;
		System.out.println("Plate: " + car.plate);
		System.out.println("- Gas left: " + car.gas_liters + " liter(s)");
		do {
			System.out.print("How far do you want to drive: ");
			Scanner input = new Scanner(System.in);
			double distance = input.nextDouble();
			System.out.println(distance);
			if (distance > 0)
				car.drive(distance);
			System.out.println("- Gas left: " + car.gas_liters + " liter(s)");
		} while (car.gas_liters > 0);
	}
}

class Vehicle {
	String plate;
	double gas_per_distance, gas_liters;

	// static : 프로그램이 실행되고 종료될 때 까지 이전 값을 저장하고 있는 변수
	static int vehicles = 0;
	
	void drive (double distance) {
		gas_liters -= distance * gas_per_distance;
		System.out.println("distance : " + gas_per_distance);
		if (gas_liters < 0){
			System.out.println("- [WARNING] There is not enough gas");
			gas_liters = 0;
		}
	}

	Vehicle() {
		plate = "TBD";
		gas_liters = 0;
		gas_liters = 0;
		vehicles++;
	}
	
	Vehicle(String s, double d, double g) {
		plate = s;
		gas_per_distance = d;
		gas_liters = g;
		vehicles++;
	}

	public void setGasLiters(double gas_liters) {
		this.gas_liters = gas_liters;
	}

	public void setGasPerDistance(double gas_per_distance) {
		this.gas_per_distance = gas_per_distance;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public double getGasLiters() {
		return gas_liters;
	}

	public double getGasPerDistance() {
		return gas_per_distance;
	}

	public String getPlate() {
		return plate;
	}

}
