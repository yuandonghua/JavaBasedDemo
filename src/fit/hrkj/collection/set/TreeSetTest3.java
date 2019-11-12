package fit.hrkj.collection.set;

import java.util.TreeSet;

/**
 * <br>
 * 2019年7月1日 下午5:37:18
 * 
 * @author 华软科技
 * @version 1.0
 */
public class TreeSetTest3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet set = new TreeSet();
		set.add(new ObjectA(1));
		set.add(new ObjectA(-2));
		set.add(new ObjectA(2));
		set.add(new ObjectA(-1));
		// 打印TreeSet集合,集合元素是有序排列的
		System.out.println(set);// ①
		// 取出第一个元素
		ObjectA first = (ObjectA) set.first();
		// 对第一个元素的count赋值
		first.count = 3;
		// 取出最后一个元素
		ObjectA last = (ObjectA) set.last();
		// 对最后一个元素的count赋值,与第二个元素的count相同
		last.count = -1;
		// 再次输出将看到TreeSet里的元素处于无序状态,且有重复元素
		System.out.println("修改后的集合:"+set);// ②
		// 删除实例变量被改变的元素,删除失败
		System.out.println("删除-1的结果:"+set.remove(new ObjectA(-1)));// ③
		System.out.println("是否包含-1:"+set.contains(new ObjectA(-1)));
		System.out.println(set);
		// 删除实例变量没有被改变的元素,删除成功
		System.out.println("删除3的结果:"+set.remove(new ObjectA(3)));
		System.out.println(set);
		System.out.println("删除1的结果:"+set.remove(new ObjectA(1)));
		System.out.println(set);
		System.out.println("删除3的结果:"+set.remove(new ObjectA(3)));
		System.out.println(set);
		System.out.println("删除-1的结果:"+set.remove(new ObjectA(-1)));
		System.out.println(set);
		System.out.println("删除3的结果:"+set.remove(new ObjectA(3)));
		System.out.println(set);
		System.out.println("删除-1的结果:"+set.remove(new ObjectA(-1)));
		System.out.println(set);
		System.out.println("删除3的结果:"+set.remove(new ObjectA(3)));
		System.out.println(set);

	}

}

class ObjectA implements Comparable {
	int count;

	public ObjectA(int count) {
		this.count = count;
	}

	/*
	 * (non-Javadoc) 重写compareTo方法,根据count来比较大小
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		if (this == obj) {
			return 0;
		}
		if (obj != null && obj.getClass() == this.getClass()) {
			ObjectA a = (ObjectA) obj;
			return this.count > a.count ? 1 : this.count < a.count ? -1 : 0;
		}
		return 0;
	}

	/*
	 * (non-Javadoc) 重写equals方法,根据count来判断是否相等
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this == obj) {
			return true;
		}
		if (obj != null && obj.getClass() == this.getClass()) {
			ObjectA a = (ObjectA) obj;
			return a.count == this.count;
		}

		return super.equals(obj);
	}

	public String toString() {
		return "ObjectA[count:" + count + "]";
	}

}
