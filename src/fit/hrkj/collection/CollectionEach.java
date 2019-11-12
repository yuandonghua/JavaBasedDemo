package fit.hrkj.collection;

import java.util.HashSet;

/**
 * <br>
 * 2019年6月20日 下午4:02:34
 * 
 * @author 华软科技
 * @version 1.0
 */
public class CollectionEach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建一个集合
		HashSet books = new HashSet();
		books.add("java");
		books.add("h5");
		books.add("android");
		// 调用forEach()方法遍历集合
		books.forEach(obj -> System.out.println("迭代集合元素:" + obj));

	}

}
