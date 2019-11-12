package fit.hrkj.generic;

import java.util.ArrayList;
import java.util.Collection;

/**
 * <br>
 * 2019年8月9日 下午5:46:46
 * 
 * @author 华软科技
 * @version 1.0
 */
public class ErrorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> oList = new ArrayList<>();
		ArrayList<String> sList = new ArrayList<>();
		// 下面代码将产生编译错误
//		test(sList, oList);

	}

	// 声明一个泛型方法，该泛型方法中带一个T泛型形参
	static <T> void test(Collection<T> from, Collection<T> to) {
		for (T t : from) {
			to.add(t);
		}
	}

}
