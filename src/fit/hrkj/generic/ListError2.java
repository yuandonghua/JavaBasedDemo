package fit.hrkj.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * <br>
 * 2019年8月5日 上午11:17:23
 * 
 * @author 华软科技
 * @version 1.0
 */
public class ListError2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建一个List<String>对象
		List<String> strList = new ArrayList<>();
		// 将strList作为参数来调用前面的test方法
//		test(strList);// ①
	}

	public static void test(List<Object> c) {
		for (var i = 0; i < c.size(); i++) {
			System.out.println(c.get(i));
		}
	}

}
