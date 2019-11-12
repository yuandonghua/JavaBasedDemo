package fit.hrkj.collection.map;

import java.util.LinkedHashMap;

/**
 * <br>
 * 2019年7月18日 下午2:54:21
 * 
 * @author 华软科技
 * @version 1.0
 */
public class LinkedHashMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap scores = new LinkedHashMap();
		scores.put("理论", 10);
		scores.put("上机", 8);
		scores.put("沟通", 6);
		// 调用forEach方法遍历scores里的所有key-value对
		scores.forEach((key, value) -> System.out.println(key + "->" + value));

	}

}
