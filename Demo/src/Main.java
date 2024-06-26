
class A {

	void meth() {
		System.out.println("A");
	}

	void meth(int a) {
		System.out.println(a);
	}

}

class B extends A {

	@Override
	void meth() {

		System.out.println("B");
	}

}

public class Main {
	public static void main(String[] args) {

		A a = new A();
		a.meth();
		a.meth(10);
		
		B b = new B();
		b.meth();
	}
}
