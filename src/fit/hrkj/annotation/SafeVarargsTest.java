package fit.hrkj.annotation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * 演示@SafeVarargs<br>
 * 2019年12月12日下午9:24:50
 * 
 * @author 华软科技
 * @version 1.0
 */
public class SafeVarargsTest {
	/**
	 * 程序入口
	 * 
	 * @param args 入口参数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		faultyMethod(Arrays.asList("hello"),Arrays.asList("java"));
	}

	@SafeVarargs
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void faultyMethod(List<String>... listStrArray) {//①
		List<String>[] listArray = listStrArray;
		
		List[] lists=listArray;
		
		List<Integer>[] iList=lists;
		iList[1]=new ArrayList<Integer>();
		Integer integer = iList[0].get(0);
		System.out.println(integer);
		
		

	}
}
