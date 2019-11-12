package fit.hrkj.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <br>
 * 2019年8月1日 下午7:51:43
 * 
 * @author 华软科技
 * @version 1.0
 */
public class DiamondTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// java自动推断出ArrayList的<>里应该是String
		List<String> language = new ArrayList<>();
		language.add("java");
		language.add("h5");
		language.add("android");
		// 遍历language集合，集合元素就是String类型
		language.forEach(ele -> System.out.println(ele.length()));
		// java自动推断出HashMap的<>里应该是String，List<String>
		Map<String, List<String>> monsterInfo = new HashMap<>();
		// java自动推断出ArrayList的<>里应该是String
		List<String> names = new ArrayList<>();
		names.add("美猴王");
		names.add("齐天大圣");
		monsterInfo.put("孙悟空", names);
		// 遍历Map时，Map的key是String类型，value是List<String>类型
		monsterInfo.forEach((key, value) -> System.out.println(key + ":" + value));

	}

}
