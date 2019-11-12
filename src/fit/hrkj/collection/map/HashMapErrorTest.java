package fit.hrkj.collection.map;

import java.util.HashMap;
import java.util.Iterator;

/**
 * <br>
 * 2019年7月17日 下午4:59:51
 * 
 * @author 华软科技
 * @version 1.0
 */
public class HashMapErrorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap ht = new HashMap();
		// 此处的A类与前一个程序的A类是同一个类
		ht.put(new A(1), "java");
		ht.put(new A(2), "h5");
		// 获得Hashtable的key Set集合对应的Iterator迭代器
		Iterator it = ht.keySet().iterator();
		// 取出Map中第一个key,并修改它的count值
		A first = (A) it.next();
		first.count = 10;// ①
		System.out.println(ht);
		// 只能删除没有被修改过key所对应的key-value对
		ht.remove(new A(10));
		System.out.println(ht);
		// 无法获取剩下的value,下面两行代码将输出null
		System.out.println(ht.get(new A(10)));//②
		System.out.println(ht.get(new A(1)));//③

	}

}
