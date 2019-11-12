package fit.hrkj.collection.list;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.concurrent.ThreadLocalRandom;

/**
 * <br>
 * 2019年7月7日 下午2:35:06
 * 
 * @author 华软科技
 * @version 1.0
 */
public class ListIteratorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] books = { "java", "h5", "android" };
		ArrayList bookList = new ArrayList();
		for (int i = 0; i < books.length; i++) {
			bookList.add(books[i]);
		}
		ListIterator lit = bookList.listIterator();
		// 从前向后遍历
		while (lit.hasNext()) {
			System.out.println(lit.next());
			lit.add("-----分隔符-----");
		}
		System.out.println("-----------下面开始反向迭代-----------");
		// 从后向前遍历
		while (lit.hasPrevious()) {
			System.out.println(lit.previous());

		}
	}

}
