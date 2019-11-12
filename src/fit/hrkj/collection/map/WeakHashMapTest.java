package fit.hrkj.collection.map;

import java.util.WeakHashMap;

/**
 * <br>
 * 2019年7月24日 下午2:35:29
 * 
 * @author 华软科技
 * @version 1.0
 */
public class WeakHashMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeakHashMap whm = new WeakHashMap();
		// 向WeakHashMap中添加三个key-value对
		// 三个key都是匿名字符串对象(没有其他引用)
		whm.put(new String("java"), "资深");
		whm.put(new String("h5"), "高级");
		whm.put(new String("android"), "高级");
		// 向WeakHashMap中添加一个key-value对
		// 该key是一个系统缓存的字符串对象
		whm.put("python", new String("中级"));
		// 输出whm对象,将看到4个key-value对
		System.out.println(whm);
		// 通知系统立即进行垃圾回收
		System.gc();
		System.runFinalization();
		// 在通常情况下,将只看到一个key-value对
		System.out.println(whm);

	}

}
