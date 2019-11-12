package fit.hrkj.collection.set;

import java.util.LinkedHashSet;

/**
 * <br>
 * 2019年6月27日 下午2:52:28
 * 
 * @author 华软科技
 * @version 1.0
 */
public class LinkedHashSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> books = new LinkedHashSet<String>();
		books.add("java基础");
		books.add("java轻量级");
		books.add("java企业级");
		System.out.println(books);
		// 删除"java基础"
		books.remove("java基础");
		System.out.println(books);
		// 重新添加"java基础"
		books.add("java基础");
		System.out.println(books);
	}

}
