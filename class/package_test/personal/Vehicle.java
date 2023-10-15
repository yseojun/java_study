package personal;

public class Vehicle {
	String plate;
	protected int warranty;

	public void setPlate(String plate) { // public으로 선언해야 defualt package에서 접근 가능
		this.plate = plate;
	}
}
