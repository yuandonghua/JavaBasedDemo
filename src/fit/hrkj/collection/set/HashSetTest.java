package fit.hrkj.collection.set;

import java.util.HashSet;


/**
 * <br>
 * 2019年6月26日 上午9:17:31
 * 
 * @author 华软科技
 * @version 1.0
 */
public class HashSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet books = new HashSet();
		// 分别向books集合中添加两个A对象,两个B对象,两个C对象
		books.add(new A());
		books.add(new A());
		books.add(new B());
		books.add(new B());
		books.add(new C());
		books.add(new C());
		System.out.println(books);
	}

}

//类A的equals()方法总是返回true,但没有重写其hashCode()方法
class A {
	public boolean equals(Object obj) {
		return true;
	}
}

//类B的hashCode()方法总是返回1,但没有重写其equals()方法
class B {
	public int hashCode() {
		return 1;
	}
}

//类C的hashCode()方法总是返回2,且重写其equals()方法总是返回true
class C {
	public int hashCode() {
		return 2;
	}

	public boolean equals(Object obj) {
		return true;
	}
}
