package fit.hrkj.collection.set;

import java.util.Date;
import java.util.TreeSet;

/**
 * <br>
 * 2019年6月28日 下午2:43:19
 * 
 * @author 华软科技
 * @version 1.0
 */
public class TreeSetErrorTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet set = new TreeSet();
		set.add(new String("java基础"));
		set.add(new Date());// ①
	}

}
