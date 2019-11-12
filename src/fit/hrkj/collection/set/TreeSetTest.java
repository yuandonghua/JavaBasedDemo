package fit.hrkj.collection.set;

import java.util.TreeSet;

/**
 * <br>
 * 2019年6月28日 上午10:24:13
 * 
 * @author 华软科技
 * @version 1.0
 */
public class TreeSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> nums = new TreeSet<Integer>();
		// 向TreeSet中添加6个Integer对象
		nums.add(4);
		nums.add(5);
		nums.add(1);
		nums.add(2);
		nums.add(-1);
		nums.add(3);
		// 输出集合元素,看到集合元素已经处于排序状态
		System.out.println(nums);
		// 输出集合中的第一个元素
		System.out.println(nums.first());
		// 输出集合中的最后一个元素
		System.out.println(nums.last());
		// 返回小于4的子集,不包含4
		System.out.println(nums.headSet(4));
		// 返回大于2的子集,如果Set中包含2,子集中还包含2
		System.out.println(nums.tailSet(2));
		// 返回大于等于-1,小于3的子集
		System.out.println(nums.subSet(-1, 3));

	}

}
