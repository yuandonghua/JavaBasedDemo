package fit.hrkj.collection.list;

import java.util.ArrayList;

/**
 * <br>
 * 2019年7月6日 下午9:45:21
 * 
 * @author 华软科技
 * @version 1.0
 */
public class ListTest2 {

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

		// 删除集合中的C对象,将导致第一个元素被删除
		books.remove(new D());// ①
		System.out.println(books);
		// 删除集合中的C对象,再次删除集合中的第一个元素
		books.remove(new D());// ②
		System.out.println(books);

	}

}

class D {
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return true;
	}
}
