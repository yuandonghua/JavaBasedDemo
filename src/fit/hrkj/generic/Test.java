package fit.hrkj.generic;

import java.util.ArrayList;
import java.util.Collection;

/**
 * <br>
 * 2019年8月8日 上午10:03:13
 * 
 * @author 华软科技
 * @version 1.0
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] oa = { "Object1", "Object2" };
		ArrayList<Object> oList = new ArrayList<Object>();
		// 下面代码中T代表Object类型
		Collection<Object> c1 = fromArrayToCollection(oa, oList);
		System.out.println("c1:" + c1);
		String[] sa = { "String1", "String2" };
		ArrayList<String> sList = new ArrayList<String>();
		// 下面代码中T代表String类型
		Collection<String> c2 = fromArrayToCollection(sa, sList);
		System.out.println("c2:" + c2);
		// 下面代码中T代表Object类型
		Collection<Object> c3 = fromArrayToCollection(sa, oList);
		System.out.println("c3:" + c3);
		Integer[] ia = { 1, 2, 3 };
		Float[] fa = { 4.0f, 5.0f };
		Number[] na = { 1.111, 2.222 };
		ArrayList<Number> nList = new ArrayList<Number>();
		// 下面代码T代表Number类型
		Collection<Number> c4 = fromArrayToCollection(ia, nList);
		System.out.println("c4:" + c4);
		// 下面代码T代表Number类型
		Collection<Number> c5 = fromArrayToCollection(fa, nList);
		System.out.println("c5:" + c5);
		// 下面代码T代表Number类型
		Collection<Number> c6 = fromArrayToCollection(na, nList);
		System.out.println("c6:" + c6);
		// 下面代码T代表Object类型
		Collection<Object> c7 = fromArrayToCollection(na, oList);
		System.out.println("c7:" + c7);
		// 下面代码T代表String类型，但na是一个Number数组
		// 因为Number既不是String类型，也不是它的子类型，所以出现编译错误
//		fromArrayToCollection(na, sList);
	}

	public static <T> Collection<T> fromArrayToCollection(T[] a, Collection<T> c) {
		for (T o : a) {
			c.add(o);
		}
		return c;
	}

}
