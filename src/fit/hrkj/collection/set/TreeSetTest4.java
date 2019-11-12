package fit.hrkj.collection.set;

import java.util.TreeSet;

/**
 * <br>
 * 2019年7月2日 下午3:48:25
 * 
 * @author 华软科技
 * @version 1.0
 */
public class TreeSetTest4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 此处Lambda表达式的目标类型是Comparator
		TreeSet ts = new TreeSet((o1, o2) -> {
			ObjectB b1 = (ObjectB) o1;
			ObjectB b2 = (ObjectB) o2;
			return b1.age > b2.age ? -1 : b1.age < b2.age ? 1 : 0;
		});
		ts.add(new ObjectB(-1));
		ts.add(new ObjectB(2));
		ts.add(new ObjectB(1));
		System.out.println(ts);
	}

}

class ObjectB {
	int age;

	public ObjectB(int age) {
		this.age = age;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "B[age:" + age + "]";
	}
}