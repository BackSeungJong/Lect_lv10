package lv10_2;

//마크 인터페이스
interface Repairable { // Mark Interface : 이를 상속받아 정의한 클래스들이 -> 수리가능하다, 마크 인터페이스의 하위 자료형이 됨

}
//damage() 메소드를 가진
// Interface Damagealbe 를 정의하고
// 최하위 유닛들 (모든)에게 damagealble 상속
// main에서 각각의 유닛들을 손상시킨 후 -> repair

interface Damageable {
	void damage(int att);
}

class Unit {// 모든 유닛의 최고 조상 클래스
	String name;
	final int MAX_HP;
	int hp; // hitpoint

	public Unit(int hp) { // 자식 유닛의 고유한 맥스값을 지정
		this.MAX_HP = hp;
	}

	public void setName(String name) {
		this.name = name;
	}
}

// GroundUnit
class GroundUnit extends Unit {

	public GroundUnit(int hp) {
		super(hp);
		// TODO Auto-generated constructor stub
	}
}

// AirUnit
class AirUnit extends Unit {

	public AirUnit(int hp) {
		super(hp);
		// TODO Auto-generated constructor stub
	}

}

// GroundUnit
// ㄴ Tank (수리가능)
// ㄴ Marine 
// ㄴ SCV 우주 건설 로봇 (수리가능)

class Tank extends GroundUnit implements Repairable, Damageable {

	public Tank() {
		super(150);// MAX_HP 초기화
		hp = MAX_HP; // Unit의 hp
		System.out.printf("TANK의 생성... Unit [hp : %d]\n", hp);
		setName("TANK");
	}

	@Override
	public void damage(int att) {
		if (hp > 0) {
			hp -= att;
		}
	}

}

class Marine extends GroundUnit implements Damageable {

	public Marine() {
		super(70);// MAX_HP 초기화
		hp = MAX_HP; // Unit의 hp
		System.out.printf("MARINE의 생성... Unit [hp : %d]\n", hp);
		setName("MARINE");
	}

	@Override
	public void damage(int att) {
		if (hp > 0) {
			hp -= att;
		}
	}

}

// SCV는 수리가능한 유닛을 -> 수리가능한 = 인터페이스
// 수리하는 기능을 가짐
class SCV extends GroundUnit implements Repairable, Damageable {

	public SCV() {
		super(200);// MAX_HP 초기화
		hp = MAX_HP; // Unit의 hp
		System.out.printf("SCV의 생성... Unit [hp : %d]\n", hp);
		setName("SCV");
	}

	public void repair(Repairable repairable) { // 인터페이스 Repairable의 하위 인자
		// Upcasting
		Unit unit = (Unit) repairable;
		while (unit.hp < unit.MAX_HP) {
			unit.hp++;
			System.out.println("수리중 >>");
		}
		System.out.printf("[%s 수리완료]\n", unit.name);
	}

	@Override
	public void damage(int att) {
		if (hp > 0) {
			hp -= att;
		}
	}
}

// AirUnit
// ㄴ DropShip

class DropShip extends AirUnit implements Repairable,Damageable {

	public DropShip() {
		super(120);// MAX_HP 초기화
		hp = MAX_HP; // Unit의 hp
		System.out.printf("DROPSHIP의 생성... Unit [hp : %d]\n", hp);
		setName("DROPSHIP");
	}

	@Override
	public void damage(int att) {
		// TODO Auto-generated method stub
		if (hp > 0)
			hp -= att;
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Tank tank = new Tank();
		Marine marine = new Marine();
		SCV scv = new SCV();
		DropShip dropship = new DropShip();

		tank.damage(10);
		marine.damage(10);
		scv.damage(10);
		dropship.damage(10);

		scv.repair(scv);
		scv.repair(tank);
//		scv.repair(marine);// 타입이 맞지 않음
//		scv.repair(dropship);
	}
}
