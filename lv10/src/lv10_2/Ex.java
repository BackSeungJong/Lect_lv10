package lv10_2;
//상속 < 추상화 < 인터페이스(강제성이 제일 강함)

//"메소드" 강제성 부여할 수 있게 됨

// 상속 : 아무런 강제성이 없음
// 추상화 : abstract가 붙어 있는 것만 강제
// 인터페이스 : 모든 메소드 강제(메소드의 군집), 상수만 가지고있어야 한다.final, 다중상속의 효과를 가져갈 수 있다. => 클래스의 표준

// super() -> 부모의 생성자
// super. -> 부모가 가진 맴버에 접근
class A {
	int a;

	void methodA() {

	}
}

// 추상 클래스
// 클래명 앞에 abstract
abstract class B {
	int b;

	void methodB() {

	}

	// 강제할 메소드 앞에 abstract 키워드를 붙임
	// body없이 정의부만 있어야 함
	abstract void methodBB();
}

// 인터페이스
// interface 인터페이스명{}
// 인터페이스는 메소드의 군집
// 상수와 메소드만 정의할 수 있다.
interface C {
	final int c = 10;

	void methodC();

	void methodCC();
}

interface CC {
	final int c = 10;

	void methodCC1();

	void methodCC2();
}

class D extends A {
	// 강제성 X
//	@Override
//	void methodA() {
//	};
}

// 추상 클래스를 상속받은 자식 클래스는
// 부모가 정해놓은(강제하는) 메소드를 반드시 재정의 해야 한다.
class E extends B {
	// abstract가 있는 메소드만 강제함

	@Override
	void methodBB() {
		// TODO Auto-generated method stub
	}

//	@Override
//	void methodB() {
//
//	}
}

// 인터페이스에 대한 상속은 여러개를 할 수 있다
class F implements C, CC {

	public void myMethod() {
		int ab = C.c;
	}

	// C
	@Override
	public void methodC() {
		// TODO Auto-generated method stub
	}

	@Override
	public void methodCC() {
		// TODO Auto-generated method stub

	}

	// CC
	@Override
	public void methodCC1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void methodCC2() {
		// TODO Auto-generated method stub

	}

}

public class Ex {

}
