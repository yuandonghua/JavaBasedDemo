package fit.hrkj.generic;

import java.util.ArrayList;

/**
 * <br>
 * 2019年8月5日 上午11:36:41
 * 
 * @author 华软科技
 * @version 1.0
 */
public class ListError3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ilist = new ArrayList<>();
		// 下面代码将导致编译错误:类型不匹配:无法从ArrayList<Integer>转换为ArrayList<Number>
		// Type mismatch: cannot convert from ArrayList<Integer> to ArrayList<Number>
//		ArrayList<Number> nList = ilist;
	}

}
