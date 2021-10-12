package lv10_1;

// 상속

// 클래스 정의 -> 객체 생성 (instance)
// 모든 클래스는 최상위 클래스인 Object를 상속을 받는다(Object가 부모) : default
// 부모가 가진 모든 멤버는 자식이 모두 물려받는다(메서드, 맴버변수)

class Sample {

}

class A {
	int a;
	private String name;
	protected String info;

	void print() {
		System.out.println("a : " + this.a);
	}
}

class B extends A {
	int b;
}

class C extends B {
	int c;
}

//별도의 패키지를 만들어
//class 

public class Ex02 {
	public static void main(String[] args) {
		Sample sample = new Sample();
		System.out.println(sample.toString());
		System.out.println(sample);

		A a = new A();
		a.a = 10;

		B b = new B(); // B가 생성되기 전에 부모 클래스인 A가 먼저 생성된다
		b.b = 20;
		b.a = 100;

		C c = new C();
		c.c = 30;
		c.a = 1000;
		c.b = 100000;
		System.out.println(a.a);
		System.out.println(b.a);
		System.out.println(b.b);
		System.out.println(c.c);
		System.out.println(c.a);
		System.out.println(c.b);
	}
}
