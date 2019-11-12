package fit.hrkj.generic;

import java.util.ArrayList;
import java.util.Collection;

/**
 * <br>
 * 2019年8月10日 下午6:57:12
 * 
 * @author 华软科技
 * @version 1.0
 */
public class RightTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> oList = new ArrayList<>();
		ArrayList<String> sList = new ArrayList<>();
		// 下面代码完全正常
		test(sList, oList);
	}

	public static <T> void test(Collection<? extends T> from, Collection<T> to) {
		for (T t : from) {
			to.add(t);
		}
	}

}
