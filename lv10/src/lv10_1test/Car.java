package lv10_1test;

import lv10_1.Vehicle;

public class Car extends Vehicle {
	public Car(String name) {
		super(name);// 부모의 생성자를 먼저 맞춰줘야 한다.
		super.name = "Ray";
		super.color = "blue";
	}
}
