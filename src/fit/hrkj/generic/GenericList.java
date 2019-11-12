package fit.hrkj.generic;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * <br>
 * 2019年8月1日 下午4:55:04
 * 
 * @author 华软科技
 * @version 1.0
 */
public class GenericList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> strList = new ArrayList<String>();// ①
		strList.add("java");
		strList.add("h5");
		strList.add("android");
		// 下面代码将会引起编译错误
//		strList.add(5);// ②
		strList.forEach(str -> System.out.println(((String) str).length()));// ③
	}

}
