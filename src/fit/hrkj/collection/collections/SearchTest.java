package fit.hrkj.collection.collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * <br>
 * 2019年7月28日 下午2:35:41
 * 
 * @author 华软科技
 * @version 1.0
 */
public class SearchTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList nums = new ArrayList();
		nums.add(2);
		nums.add(-2);
		nums.add(0);
		nums.add(6);
		System.out.println(nums);// 输出[2, -2, 0, 6]
		System.out.println("输出最大元素:" + Collections.max(nums));// 输出6
		System.out.println("输出最小元素:" + Collections.min(nums));// 输出-2
		Collections.replaceAll(nums, 0, 1);// 将nums中的0使用1来代替
		System.out.println(nums);// 输出[2, -2, 1, 6]
		System.out.println("-2在List集合中出现的次数:" + Collections.frequency(nums, -2));// 输出1
		Collections.sort(nums);// 对nums集合排序
		System.out.println(nums);// 输出:[-2, 1, 2, 6]
		System.out.println("只有排序后的List集合才可用二分法查询,6的索引是:" + Collections.binarySearch(nums, 6));// 输出3

	}

}
