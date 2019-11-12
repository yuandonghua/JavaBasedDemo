package fit.hrkj.collection.map;

import java.util.EnumMap;

/**
 * <br>
 * 2019年7月24日 下午4:12:40
 * 
 * @author 华软科技
 * @version 1.0
 */
public class EnumMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建EnumMap对象,该EnumMap的所有key都是Season枚举类的枚举值
		EnumMap em = new EnumMap(Season.class);
		em.put(Season.SUMMER, "去河里洗澡");
		em.put(Season.FALL, "去果园偷桃");
		System.out.println(em);

	}

}

enum Season {
	SPRING, SUMMER, FALL, WINTER
}