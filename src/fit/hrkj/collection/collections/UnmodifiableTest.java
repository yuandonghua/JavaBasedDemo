package fit.hrkj.collection.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * <br>
 * 2019年7月28日 下午4:18:54
 * 
 * @author 华软科技
 * @version 1.0
 */
public class UnmodifiableTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建一个空的,不可变的List对象
		List unmodifiableList = Collections.emptyList();
		// 创建一个只有一个元素,且不可改变的集合对象
		Set unmodifiableSet = Collections.singleton("java");
		List unmodifiableList2 = Collections.singletonList("h5");
		Map unmodifiableMap = Collections.singletonMap("name", "孙悟空");
		// 创建一个普通的Map对象
		HashMap scores = new HashMap();
		scores.put("理论", 9);
		scores.put("上机", 10);
		// 返回普通的Map对象对应的不可变版本
		Map unmodifiableMap2 = Collections.unmodifiableMap(scores);
		// 下面任意一行代码都将引发java.lang.UnsupportedOperationException异常
		unmodifiableList.add("测试元素");
		unmodifiableSet.add("测试元素");
		unmodifiableMap2.put("沟通", 8);

	}

}
