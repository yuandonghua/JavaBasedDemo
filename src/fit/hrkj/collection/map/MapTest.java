package fit.hrkj.collection.map;

import java.util.HashMap;
import java.util.Set;

/**
 * <br>
 * 2019年7月9日 下午9:33:30
 * 
 * @author 华软科技
 * @version 1.0
 */
public class MapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		// 成对放入多个key-value对
		// 多次放入的key-value对中value可以重复
		map.put("理论", 10);
		map.put("上机", 10);
		map.put("沟通", 10);
		map.put("考勤", 10);
		System.out.println(map);
		// 放入重复的key时,新的value会覆盖原有的value
		// 如果新的value覆盖了原有的value,该方法返回被覆盖的value
		System.out.println(map.put("理论", 9));
		System.out.println("覆盖后的集合:" + map);
		System.out.println("判断是否包含key-\"上机\":" + map.containsKey("上机"));
		System.out.println("判断是否包含value-\"10\":" + map.containsValue(10));
		// 获取Map集合的所有key组成的集合,通过遍历key来实现遍历所有的key-value对
		Set set = map.keySet();
		for (Object keyString : set) {
			System.out.println(keyString + ":" + map.get(keyString));
		}
		System.out.println("根据key删除key-value对:" + map.remove("考勤"));
		System.out.println(map);
		System.out.println("根据key-value对删除:" + map.remove("理论", 10));
		System.out.println(map);

	}

}
