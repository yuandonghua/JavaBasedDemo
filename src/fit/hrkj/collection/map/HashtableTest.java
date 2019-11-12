package fit.hrkj.collection.map;

import java.util.Hashtable;

/**
 * <br>
 * 2019年7月17日 上午10:42:26
 * 
 * @author 华软科技
 * @version 1.0
 */
public class HashtableTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable ht = new Hashtable();
		ht.put(new A(1), "java");
		ht.put(new A(2), "h5");
		ht.put(new A(3), new B());
		System.out.println(ht);
		// 只要两个对象通过equals()方法比较返回true
		// Hashtable就认为它们是相等的value
		// 由于Hashtable中有一个B对象它与任何对象通过equals()方法比较都相等,所以下面输出true
		System.out.println(ht.containsValue("android"));// ①
		// 只要两个A对象的count相等,它们通过equals()方法比较返回true,且hashCode值相等
		// Hashtable即认为它们是相同的key,所以下面输出true
		System.out.println(ht.containsKey(new A(1)));// ②
		// 下面语句可以删除最后一个key-value对
		ht.remove(new A(3));// ③
		System.out.println(ht);

	}

}

class A {
	int count;

	public A(int count) {
		this.count = count;
	}

	/**
	 * 根据count的值来判断两个对象是否相等
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == this) {
			return true;
		}
		if (obj != null && obj.getClass() == this.getClass()) {
			A a = (A) obj;
			return this.count == a.count;
		}

		return false;
	}

	/**
	 * 根据count来计算hashCode值
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.count;
	}

}

class B {
	/**
	 * 重写equals方法,B对象与任何对象通过equals方法比较都返回true
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return true;
	}

}
