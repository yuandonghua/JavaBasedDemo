package fit.hrkj.collection;

import java.util.HashSet;

/**
 * <br>
 * 2019年6月21日 下午4:18:03
 * 
 * @author 华软科技
 * @version 1.0
 */
public class ForeachTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建一个集合
		HashSet<String> books = new HashSet<String>();
		books.add("java");
		books.add("h5");
		books.add("android");
		//异常出现在下次使用book的时候
		for (String book : books) {
			//此处的book变量也不是集合元素本身
			System.out.println(book);
			if (book.equals("java")) {
				//下面代码将会引发java.util.ConcurrentModificationException
				books.remove(book);
			}
		}
		System.out.println(books);
	}

}
