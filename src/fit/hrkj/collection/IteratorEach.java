package fit.hrkj.collection;

import java.util.HashSet;
import java.util.Iterator;

/**
 * <br>
 * 2019年6月21日 下午3:58:49
 * 
 * @author 华软科技
 * @version 1.0
 */
public class IteratorEach {

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
		// 获取books集合对应的迭代器
		Iterator it = books.iterator();
		// 使用Lambda表达式(目标类型是Comsumer)来遍历集合元素
		it.forEachRemaining(obj -> System.out.println("迭代集合元素:" + obj));

	}

}
