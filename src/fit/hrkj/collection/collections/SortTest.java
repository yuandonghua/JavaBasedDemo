package fit.hrkj.collection.collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * <br>
 * 2019年7月26日 下午4:39:45
 * 
 * @author 华软科技
 * @version 1.0
 */
public class SortTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList nums = new ArrayList();
		nums.add(2);
		nums.add(-1);
		nums.add(1);
		nums.add(-2);
		nums.add(4);
		nums.add(3);
		System.out.println(nums);// 输出[2, -1, 1, -2, 4, 3]
		Collections.reverse(nums);// 将集合元素次序反转
		System.out.println(nums);// 输出:[3, 4, -2, 1, -1, 2]
		Collections.sort(nums);// 将集合元素按自然顺序排序
		System.out.println(nums);// 输出:[-2, -1, 1, 2, 3, 4]
		Collections.shuffle(nums);// 将集合元素按随机顺序排序
		System.out.println(nums);// 输出:[-1, 2, 3, -2, 1, 4]
	}

}
