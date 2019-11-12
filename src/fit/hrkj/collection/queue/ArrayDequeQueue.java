package fit.hrkj.collection.queue;

import java.util.ArrayDeque;

/**
 * <br>
 * 2019年7月9日 下午5:08:01
 * 
 * @author 华软科技
 * @version 1.0
 */
public class ArrayDequeQueue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque queue = new ArrayDeque();
		// 依次将5个元素push入"栈"
		queue.offer("泰坦尼克号");
		queue.offer("千与千寻");
		queue.offer("辛德勒的名单");
		queue.offer("盗梦空间");
		queue.offer("忠犬八公");
		System.out.println(queue);
		// 访问队列的头部元素,但并不将其pop出队列"栈"
		System.out.println(queue.peek());
		System.out.println(queue);
		// poll出第一个元素
		System.out.println(queue.poll());
		System.out.println(queue);
	}

}
