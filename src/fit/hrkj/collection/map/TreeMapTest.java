package fit.hrkj.collection.map;

import java.util.TreeMap;

/**
 * <br>
 * 2019年7月24日 上午10:58:08
 * 
 * @author 华软科技
 * @version 1.0
 */
public class TreeMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap tm = new TreeMap();
		tm.put(new R(0), "熔炉");
		tm.put(new R(1), "大话西游之大圣娶亲");
		tm.put(new R(2), "星际穿越");
		tm.put(new R(3), "龙猫");
		tm.put(new R(4), "无间道");
		System.out.println(tm);
		System.out.println("返回该TreeMap的第一个Entry对象:" + tm.firstEntry());
		System.out.println("返回该TreeMap的最后一个key值:" + tm.lastKey());
		System.out.println("返回该TreeMap的比new R(2)大的最小key值:" + tm.higherKey(new R(2)));
		System.out.println("返回该TreeMap的比new R(2)小的key-value对:" + tm.lowerEntry(new R(2)));
		System.out.println("返回该TreeMap的子TreeMap:" + tm.subMap(new R(1), new R(3)));
	}

}

class R implements Comparable {
	int count;

	public R(int count) {
		this.count = count;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "R[count:" + count + "]";
	}

	/**
	 * 根据count来判断两个对象是否相等
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this == obj) {
			return true;
		}
		if (obj != null && obj.getClass() == this.getClass()) {
			R r = (R) obj;
			return r.count == r.count;
		}
		return false;
	}

	/**
	 * 根据count属性值来判断两个对象的大小
	 */
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		R r = (R) o;
		return this.count > r.count ? 1 : (this.count < r.count ? -1 : 0);
	}

}
