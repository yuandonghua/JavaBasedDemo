package fit.hrkj.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * <br>
 * 2019年6月21日 下午2:59:32
 * 
 * @author 华软科技
 * @version 1.0
 */
public class IteratorErrorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建一个集合
		ArrayList books = new ArrayList();
		books.add("java");
		books.add("h5");
		books.add("android");

		// 获取books集合对应的迭代器
		Iterator it = books.iterator();
		while (it.hasNext()) {
		    //第二次执行时,会出现异常,因为第一次调用后,修改了数组元素
			String book = (String) it.next();//②
			System.out.println(book);
			if (book.equals("java")) {
				// 在Iterator迭代过程中,修改集合元素后,继续往下遍历会引发异常
				books.remove("java");//①
			} else if (book.equals("h5")) {
				books.remove("h5");
			} else if (book.equals("android")) {
				books.remove("android");
			}
		}
		System.out.println(books);

	}

}
