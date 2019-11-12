package fit.hrkj.collection.queue;

import java.util.ArrayDeque;

/**
 * <br>
 * 2019年7月9日 下午4:57:40
 * 
 * @author 华软科技
 * @version 1.0
 */
public class ArrayDequeStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque stack = new ArrayDeque();
		// 依次将5个元素push入"栈"
		stack.push("肖申克的救赎");
		stack.push("霸王别姬");
		stack.push("这个杀手不太冷");
		stack.push("阿甘正传");
		stack.push("美丽人生");
		System.out.println(stack);
		// 访问第一个元素,但并不将其pop出"栈"
		System.out.println(stack.peek());
		System.out.println(stack);
		// pop出第一个元素
		System.out.println(stack.pop());
		System.out.println(stack);
	}

}
