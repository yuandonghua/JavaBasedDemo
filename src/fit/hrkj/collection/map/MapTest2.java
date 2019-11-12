package fit.hrkj.collection.map;

import java.util.HashMap;

/**
 * <br>
 * 2019年7月10日 下午5:37:23
 * 
 * @author 华软科技
 * @version 1.0
 */
public class MapTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		map.put("理论", 10);
		map.put("上机", 10);
		map.put("沟通", 10);
		map.put("考勤", 10);
		// 尝试替换key为"介绍"的value,由于原Map中没有对应的key
		// 因此Map没有改变,不会添加新的key-value对
		System.out.println("替换key为\"介绍\"的结果:" + map.replace("介绍", 10));
		System.out.println(map);
		// 使用原value与传入新值计算出来的结果覆盖原有的value
		System.out.println("使用原value=10与传入新value=1计算出来的结果:"
				+ map.merge("理论", 1, (oldValue, newValue) -> (int) oldValue + (int) newValue));
		System.out.println(map);
		System.out.println("当key为\"表现\"对应的value为null(或key不存在)时,使用计算的结果作为新value:"
				+ map.computeIfAbsent("表现", key -> ((String) key).length()));
		System.out.println(map);
		System.out.println("当key为\"表现\"对应的value存在时,使用计算的结果作为新的value:"
				+ map.computeIfPresent("表现", (key, value) -> (int) value * ((String) key).length()));
		System.out.println(map);
	}

}
