package fit.hrkj.collection.map;

import java.util.HashMap;

/**
 * <br>
 * 2019年7月11日 上午11:46:41
 * 
 * @author 华软科技
 * @version 1.0
 */
public class NullHashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm = new HashMap();
		// 试图将两个key为null值的key-value对放入HashMap中
		System.out.println(hm.put(null, null));
		System.out.println(hm.put(null, null));// ①
		// 将一个value为null值的key-value对放入HashMap中
		System.out.println(hm.put("电影", null));// ②
		System.out.println(hm.put("音乐", "相信自己"));// ②
		System.out.println(hm);

	}

}
