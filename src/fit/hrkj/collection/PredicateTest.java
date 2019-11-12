package fit.hrkj.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

/**
 * <br>
 * 2019年6月21日 下午4:55:27
 * 
 * @author 华软科技
 * @version 1.0
 */
public class PredicateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建一个集合
		HashSet<String> books = new HashSet<String>();
		books.add("java基础");
		books.add("java轻量级");
		books.add("java企业级");
		books.add("h5基础");
		books.add("h5轻量级");
		books.add("h5企业级");
		books.add("android基础");
		books.add("android轻量级");
		books.add("android企业级");
		// 使用Lambda表达式(Predicate)过滤集合
//		books.removeIf(ele -> ele.length() < 8);
//		System.out.println(books);

		// 统计书名中出现"基础"字符串的图书数量
		System.out.println(calAll(books, ele -> ((String) ele).contains("基础")));
		// 统计书名中出现"java"字符串的图书数量
		System.out.println(calAll(books, ele -> ((String) ele).contains("java")));
		// 统计书名长度大于8的图书数量
		System.out.println(calAll(books, ele -> ((String) ele).length() > 8));
	}

	public static int calAll(Collection books, Predicate p) {

		int total = 0;
		for (Object book : books) {
			// 使用Predicate的test()方法判断该对象是否满足Predicate指定的条件
			if (p.test(book)) {
				total++;
			}
		}
		return total;
	}
}
