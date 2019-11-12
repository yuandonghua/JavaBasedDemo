package fit.hrkj.collection.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * <br>
 * 2019年7月31日 上午8:49:56
 * 
 * @author 华软科技
 * @version 1.0
 */
public class FinalCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建包含4个元素的Set集合
		var set = Set.of("java", "h5", "android", "python");
		System.out.println(set);
		// 不可变集合,下面代码导致运行时错误
//		set.add("C++");
		// 创建包含4个元素的List集合
		List list = List.of(1, 2, 3, 4);
		System.out.println(list);
		// 不可变集合,下面代码导致运行时错误
//		list.remove(1);
		// 创建包含3个key-value对的Map集合
		Map map = Map.of("上机", 10, "理论", 9, "自我介绍", 9);
		System.out.println(map);
		// 不可变集合,下面代码导致运行时错误
//		map.remove("自我介绍");
		// 使用Map.entry()方法显式构建key-value对
		Map map2 = Map.ofEntries(Map.entry("理论", 10), Map.entry("上机", 10), Map.entry("沟通", 10));
		System.out.println(map2);
		// 不可变集合,下面代码导致运行时错误
//		map2.remove("理论");
	}

}
