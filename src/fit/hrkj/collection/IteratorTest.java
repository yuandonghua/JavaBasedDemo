package fit.hrkj.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * <br>
 * 2019年6月21日 下午2:12:32
 * 
 * @author 华软科技
 * @version 1.0
 */
public class IteratorTest {

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
		
		//获取books集合对应的迭代器
		Iterator it=books.iterator();
		//判断是否还有下一个元素
		while (it.hasNext()) {
			//it.next()方法返回的数据类型是Object类型,因此需要强制类型转换
			String book = (String) it.next();
			if (book.equals("h5")) {
				//从集合中删除上一次next()方法返回的元素
				it.remove();
			}
			//对book变量赋值,不会改变集合元素本身
			book="测试字符串";//①
		}
		System.out.println(books);
		
		
		
		
		
		}

}
