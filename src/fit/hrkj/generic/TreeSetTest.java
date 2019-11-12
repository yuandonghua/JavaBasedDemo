package fit.hrkj.generic;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * <br>
 * 2019年8月7日 下午4:13:53
 * 
 * @author 华软科技
 * @version 1.0
 */
public class TreeSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Comparator的实际类型是TreeSet的元素类型的父类，满足要求
		TreeSet<String> ts1 = new TreeSet<String>(new Comparator<Object>() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return o1.hashCode() > o2.hashCode() ? 1 : (o1.hashCode() < o2.hashCode() ? -1 : 0);
			}

		});
		ts1.add("hello");
		ts1.add("world");
		// Comparator的实际类型是TreeSet的元素类型，满足要求
		TreeSet<String> ts2 = new TreeSet<String>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.hashCode() > o2.hashCode() ? -1 : (o1.hashCode() < o2.hashCode() ? 1 : 0);
			}
		});
		ts2.add("hello");
		ts2.add("world");

		System.out.println(ts1);
		System.out.println(ts2);

	}

}
