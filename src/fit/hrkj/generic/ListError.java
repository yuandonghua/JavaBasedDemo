package fit.hrkj.generic;

import java.util.ArrayList;

/**
 * <br>
 * 2019年8月1日 下午4:03:19
 * 
 * @author 华软科技
 * @version 1.0
 */
public class ListError {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList strList = new ArrayList();
		strList.add("java");
		strList.add("h5");
		strList.add("android");
		// 不小心把一个Integer对象“丢进”了集合
		strList.add(5);// ①
		strList.forEach(str -> System.out.println(((String) str).length()));// ②

	}

}
