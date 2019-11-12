package fit.hrkj.collection;

import java.util.PriorityQueue;

/**
 * <br>
 * 2019年7月7日 下午9:17:29
 * 
 * @author 华软科技
 * @version 1.0
 */
public class PriorityQueueTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue pq = new PriorityQueue();
		// 下面代码依次向pq中加入4个元素
		pq.offer(1);
		pq.offer(-1);
		pq.offer(2);
		pq.offer(-2);
		// 输出pq队列,并不是按元素的加入顺序排列
		System.out.println(pq);
		// 访问队列的第一个元素,其实就是队列中最小的元素:-2
		System.out.println(pq.poll());
		System.out.println(pq);

	}

}
