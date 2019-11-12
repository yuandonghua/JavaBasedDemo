package fit.hrkj.collection.map;

import java.util.IdentityHashMap;

/**
 * <br>
 * 2019年7月24日 下午3:15:02
 * 
 * @author 华软科技
 * @version 1.0
 */
public class IdentityHashMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IdentityHashMap ihm = new IdentityHashMap();
		// 下面两行代码将会向IdentityHashMap对象中添加两个key-value对
		ihm.put(new String("理论"), 10);
		ihm.put(new String("理论"), 9);
		// 下面两行代码只会向IdentityHashMap对象中添加一个key-value对
		ihm.put("沟通", 8);
		ihm.put("沟通", 10);
		System.out.println(ihm);

	}

}
