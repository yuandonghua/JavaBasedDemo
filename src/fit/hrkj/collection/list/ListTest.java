package fit.hrkj.collection.list;

import java.util.ArrayList;

/**
 * <br>
 * 2019年7月6日 下午9:20:25
 * 
 * @author 华软科技
 * @version 1.0
 */
public class ListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList books = new ArrayList();
		// 向books中添加3个元素
		books.add("java");
		books.add("h5");
		books.add(new String("android"));
		System.out.println(books);
		// 将新字符串对象插入在第二个位置
		books.add(1, new String("python"));
		for (int i = 0; i < books.size(); i++) {
			System.out.println(books.get(i));
		}
		// 删除第三个元素
		books.remove(2);
		System.out.println(books);
		// 判断指定元素在List集合中的位置:输出1,表明位于第二位
		System.out.println(books.indexOf(new String("android")));// ①
		// 将第二个元素替换成新的字符串对象
		books.set(1, "h5");
		System.out.println(books);
		// 将books集合的第二个元素(包括)到第三个元素(不包括)截取成子集合
		System.out.println(books.subList(1, 2));

	}

}
