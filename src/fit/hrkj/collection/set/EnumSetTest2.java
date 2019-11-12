package fit.hrkj.collection.set;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * <br>
 * 2019年7月4日 下午4:26:47
 * 
 * @author 华软科技
 * @version 1.0
 */
public class EnumSetTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		hs.clear();
		hs.add(Season.FALL);
		hs.add(Season.SPRING);
		// 复制Collection集合中的所有元素来创建EnumSet集合
		EnumSet es = EnumSet.copyOf(hs);// ①
		System.out.println(es);
		hs.add("java");
		hs.add("h5");
		// 下面代码出现异常:因为hs集合里的元素不是全部都为枚举值;
		// java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Enum
		EnumSet es2 = EnumSet.copyOf(hs);// ②
		SortedSet s=Collections.synchronizedSortedSet(new TreeSet());
	}

}
