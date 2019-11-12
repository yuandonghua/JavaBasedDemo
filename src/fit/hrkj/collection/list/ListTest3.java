package fit.hrkj.collection.list;

import java.util.ArrayList;

/**
 * <br>
 * 2019年7月7日 上午11:03:53
 * 
 * @author 华软科技
 * @version 1.0
 */
public class ListTest3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList books = new ArrayList();
		books.add("java基础");
		books.add("java轻量级");
		books.add("java企业级");
		books.add("h5基础");
		books.add("h5轻量级");
		books.add("h5企业级");
		books.add("android基础");
		books.add("android轻量级");
		books.add("android企业级");

		// 使用目标类型为Comparator的Lambda表达式对List集合排序
		books.sort((o1, o2) -> ((String) o1).length() - ((String) o2).length());// ①
		System.out.println(books);

		// 使用目标类型为UnaryOperator的Lambda表达式来替换集合中所有元素
		// 该Lambda表达式控制使用每个字符串的长度为新的集合元素
		books.replaceAll(ele -> ((String) ele).length());// ②
		System.out.println(books);

	}

}
