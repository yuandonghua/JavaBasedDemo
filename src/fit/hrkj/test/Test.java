package fit.hrkj.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * <br>
 * 2019年7月18日 上午10:24:02
 * 
 * @author 华软科技
 * @version 1.0
 */
public class Test {
	private Test a;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> sList=new ArrayList<String>();
		sList.add("java1");
		sList.add("java2");
		sList.add("java3");
		sList.add("java4");
		sList.add("java5");
		sList.add("java6");
		sList.add("java7");
		sList.add("java8");
		sList.add("java9");
		sList.add("java10");
		sList.add("java11");
		
		
		ArrayList<Object> oList = new ArrayList<Object>();
		oList.add("test1");
		oList.add("test2");
		oList.add("test3");
		oList.add("test4");
		oList.add("test5");
		oList.add("test6");
		oList.add("test7");
		oList.add("test8");
		oList.add("test9");
		oList.add("test10");
		oList.add("test11");
		oList.add("test12");
		Collections.copy(oList, sList);
		
		System.out.println(oList);
//		for (int i = 0; i < 8; i++) {
//			new Test();
////			System.gc();
//		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#finalize()
	 */
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("finalize");
		a=this;
		
	}
}
