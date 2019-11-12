package fit.hrkj.collection;

import java.util.HashSet;

/**
 * 演示Collection的Stream操作<br>
 * 2019年6月24日 上午11:38:15
 * 
 * @author 华软科技
 * @version 1.0
 */
public class CollectionStream {

	/**
	 * 程序入口
	 * 
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
		// 统计书名中出现"基础"字符串的图书数量
		System.out.println(books.stream().filter(ele -> ele.contains("基础")).count());
		// 统计书名中出现"java"字符串的图书数量
		System.out.println(books.stream().filter(ele -> ele.contains("java")).count());
		// 统计书名长度大于8的图书数量
		System.out.println(books.stream().filter(ele -> ele.length() > 8).count());
		// 先调用Collection对象的stream()方法将集合转换为Stream
		// 再调用Stream的mapToInt()方法获取原有的Stream对应的IntStream
		books.stream().mapToInt(ele -> ele.length()).forEach(System.out::println);
	}

}
