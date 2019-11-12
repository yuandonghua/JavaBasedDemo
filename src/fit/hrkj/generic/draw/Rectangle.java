package fit.hrkj.generic.draw;

/**
 * 定义Shape的子类Rectangle<br>
 * 2019年8月7日 上午11:31:44
 * 
 * @author 华软科技
 * @version 1.0
 */
public class Rectangle extends Shape {

	/**
	 * 实现画图方法，以打印字符串来模拟画图方法实现
	 */
	@Override
	public void draw(Canvas c) {
		// TODO Auto-generated method stub
		System.out.println("在画布" + c + "画一个矩形");
	}

}
