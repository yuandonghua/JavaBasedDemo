package fit.hrkj.collection.set;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 如果向HashSet中添加一个可变对象后,后面程序修改了该可变对象的实例变量,
 * 则可能导致它与集合中的其他元素相同(即两个对象通过equals()方法比较返回true,两个对象的hashCode值也相等),
 * 这就有可能导致HashSet中包含两个相同的对象.<br>
 * 2019年6月26日 下午5:08:30
 * 
 * @author 华软科技
 * @version 1.0
 */
public class HashSetTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		hs.add(new R(5));
		hs.add(new R(-3));
		hs.add(new R(9));
		hs.add(new R(-2));
		// 打印HashSet集合,集合元素没有重复
		System.out.println(hs);
		// 取出第一个元素
		Iterator it = hs.iterator();
		R firstR = (R) it.next();
		// 为第一个元素的count实例变量赋值
		firstR.count = -3;// ①
		// 再次输出HashSet集合,集合元素有重复元素
		System.out.println(hs);
		// 删除count为-3的R对象
		hs.remove(new R(-3));// ②
		// 可以看到被删除了一个R元素
		System.out.println("删除后的:"+hs);
		hs.remove(new R(-2));
		System.out.println("删除后的:"+hs);
		Iterator it2 = hs.iterator();
		R r2 = (R) it2.next();
		r2.count=-2;
		hs.remove(new R(-2));
		System.out.println(hs);
		System.out.println("hs是否包含count为-3的R对象?" + hs.contains(new R(-3)));
		System.out.println("hs是否包含count为-2的R对象?" + hs.contains(new R(-2)));
	}

}

class R {
	int count;

	public R(int count) {
		this.count = count;
	}

	public String toString() {
		return "R[count:" + count + "]";
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj != null && obj.getClass() == this.getClass()) {
			R r = (R) obj;
			return this.count == r.count;
		}
		return false;
	}

	public int hashCode() {
		return this.count;
	}
}
