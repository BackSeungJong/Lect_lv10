package lv10_1;

public class Vehicle {
	public String name;
	protected String color; // 타 패키지의 자식 클래스까지만 참조할 수 있게 제한
	private int speed;

	public Vehicle(String name) {

	}
}
