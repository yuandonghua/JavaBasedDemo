package fit.hrkj.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * <br>
 * 2019年8月7日 下午3:43:23
 * 
 * @author 华软科技
 * @version 1.0
 */
public class MyUtils {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Number> nList = new ArrayList<>();
		ArrayList<Integer> iList = new ArrayList<>();
		iList.add(5);
		// 此处可准确地知道最后一个被复制的元素是Integer类型
		// 与src集合元素的类型相同
		Integer last = copy(nList, iList);
		System.out.println(nList);
	}

	public static <T> T copy(Collection<? super T> dest, Collection<T> src) {
		T last = null;
		for (T t : src) {
			last = t;
			// 逆变的泛型集合添加元素是安全的
			dest.add(t);
		}
		return last;
	}

}
