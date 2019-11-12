package fit.hrkj.extendstest;

/**
 * <br>
 * 2019年8月27日 上午11:05:29
 * 
 * @author 华软科技
 * @version 1.0
 */
public class C extends A {
	B b = new B();

	private C() {
//		System.out.print("C");
	}

	/**
	 * Description: 程序入口
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();
		C c = new C();
		B b = new B();
		
//		c=b;
//		b=c;
		a=b;
		a=c;
		
		
		if (a instanceof C) {
			System.out.println("a是C类的父类A的实例");
		}
		if (a instanceof A) {
			System.out.println("a是A类的实例");
		}
		if (c instanceof A) {
			System.out.println("c是A类的子类的实例");
		}

	}

}

class A {
	B b = new B();

	A() {
//		System.out.print("A");
	}
}

class B  extends A{
	B() {
//		System.out.print("B");
	}
}
