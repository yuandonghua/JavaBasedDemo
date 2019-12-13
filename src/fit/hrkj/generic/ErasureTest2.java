package fit.hrkj.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 演示擦除<br>
 * 2019年8月12日 下午8:13:17
 * 
 * @author 华软科技
 * @version 1.0
 */
public class ErasureTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> iList = new ArrayList<>();
		iList.add(1);
		iList.add(2);
		List list = iList;
		// 下面代码引起“未经检查的转换”警告，编译，运行时完全正常
		List<String> sList = list;
		// 但只要访问sList里的元素，如下面代码将引起运行时异常
		System.out.println(sList.get(0));

	}

}
