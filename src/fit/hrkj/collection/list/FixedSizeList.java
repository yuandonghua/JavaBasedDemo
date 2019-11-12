package fit.hrkj.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <br>
 * 2019年7月7日 下午4:41:34
 * 
 * @author 华软科技
 * @version 1.0
 */
public class FixedSizeList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fixedList = Arrays.asList("java", "h5", "android");
		// 获取fixedList的实现类,将输出Arrays$ArrayList
		System.out.println(fixedList.getClass());
		// 使用方法引用遍历集合元素
		fixedList.forEach(System.out::println);
		// 试图增加,删除元素都会引发java.lang.UnsupportedOperationException
		fixedList.add("python");
		fixedList.remove("h5");
	}

}
