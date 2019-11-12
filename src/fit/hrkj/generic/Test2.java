package fit.hrkj.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * <br>
 * 2019年8月12日 下午8:34:49
 * 
 * @author 华软科技
 * @version 1.0
 */
public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
		test2();
		test3();
		test4();
	}

	/**
	 *  
	 */ 
	private static void test4() {
		// TODO Auto-generated method stub
		
	}
//	<T> T[] makeArray(Collection<T> coll){
//	    //下面代码将导致编译错误
//	    return new T[coll.size];
//	}
	/**
	 *  
	 */
	private static void test3() {
		// TODO Auto-generated method stub
		List<?>[] sListA = new ArrayList<?>[10];
		Object[] oa = sListA;
		List<Integer> iList = new ArrayList<Integer>();
		iList.add(1);
		oa[1] = iList;
		Object target = sListA[1].get(0);
		if (target instanceof String) {
			// 下面代码安全了
			String string = (String) target;
		}
	}

	/**
	 *  
	 */
	private static void test2() {
		// TODO Auto-generated method stub
		// 下面代码编译时有“【unchecked】未经检查的转换”
		List<String>[] sListA = new ArrayList[10];
		// 将sListA向上转型为Object[]类型的变量
		Object[] oa = sListA;
		List<Integer> iList = new ArrayList<Integer>();
		iList.add(1);
		// 将List<Integer>对象作为o的第二个元素
		// 下面代码没有任何警告
		oa[1] = iList;
		// 下面代码也不会有任何警告，但将引发ClassCastException异常
		String s = sListA[1].get(0);// ①
	}

	/**
	 *  
	 */
	private static void test1() {
		// TODO Auto-generated method stub
		// 下面代码实际上是不允许的,假设它是允许的
//		List<String>[] sListA = new ArrayList<String>[10];
//		// 将sListA向上转型为Object[]类型的变量
//		Object[] oa = sListA;
//		List<Integer> iList = new ArrayList<Integer>();
//		iList.add(1);
//		// 将List<Integer>对象作为o的第二个元素
//		// 下面代码没有任何警告
//		oa[1] = iList;
//		// 下面代码也不会有任何警告，但将引发ClassCastException异常
//		String s = sListA[1].get(0);// ①
	}

}
