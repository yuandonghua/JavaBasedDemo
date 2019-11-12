package fit.hrkj.collection.set;

import java.util.TreeSet;

/**
 * <br>
 * 2019年7月1日 下午2:44:23
 * 
 * @author 华软科技
 * @version 1.0
 */
public class TreeSetTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet set = new TreeSet();
		Z z1 = new Z(18);
		set.add(z1);
		// 第二次添加同一个对象,输出true,表明添加成功
		System.out.println(set.add(z1));// ①
		// 下面输出set集合,将看到有两个元素
		System.out.println(set);
		// 修改set集合的最后一个元素的age变量,将看到也变成了9
		System.out.println(((Z) (set.last())).age);

	}

}

class Z implements Comparable {
	int age;

	public Z(int age) {
		this.age = age;
	}

	/*
	 * (non-Javadoc) 重写equals方法,总是返回true
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return true;
	}

	/*
	 * (non-Javadoc) 重写compareTo方法,总是返回1
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 1;
	}

}