package fit.hrkj.collection.list;

import java.util.LinkedList;

/**
 * <br>
 * 2019年7月9日 下午5:23:08
 * 
 * @author 华软科技
 * @version 1.0
 */
public class LinkedListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList movies = new LinkedList();
		// 将字符串元素加入队列的尾部
		movies.offer("机器人总动员");
		System.out.println(movies);
		// 将一个字符串元素加入栈的顶部
		movies.push("三傻大闹宝莱坞");
		System.out.println(movies);
		// 将字符串元素添加到队列的头部(相当于栈的顶部)
		movies.offerFirst("放牛班的春天");
		System.out.println(movies);
		// 将字符串元素添加到队列的尾部(相当于栈的底部)
		movies.offerLast("海上钢琴师");
		System.out.println(movies);
		// 以List的方式来遍历集合元素
		for (int i = 0; i < movies.size(); i++) {
			System.out.println("遍历元素:" + movies.get(i));
		}
		System.out.println("访问并不删除栈顶的元素:" + movies.peekFirst());
		System.out.println("访问并不删除队列的最后一个元素:" + movies.peekLast());
		System.out.println("将栈顶的元素弹出\"栈\":" + movies.pop());
		System.out.println("将看到队列中第一个元素被删除:" + movies);
		System.out.println("访问并删除队列中的最后一个元素:" + movies.pollLast());
		System.out.println("删除后的集合:" + movies);
	}

}
