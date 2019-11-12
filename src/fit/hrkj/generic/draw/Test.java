package fit.hrkj.generic.draw;

import java.util.ArrayList;
import java.util.List;

/**
 * <br>
 * 2019年8月7日 下午12:03:40
 * 
 * @author 华软科技
 * @version 1.0
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Circle> circleList = new ArrayList<>();
		Canvas canvas = new Canvas();
		// 不能把List<Circle>当成List<Shape>使用，所以下面代码引起编译错误:类型画布中的drawAll(List<Shape>)方法不适用于参数(List<Circle>)
		// The method drawAll(List<Shape>) in the type Canvas is not applicable for the
		// arguments (List<Circle>)
		canvas.drawAll(circleList);
	}

	public void addRectangle(List<? extends Shape> shapes) {
		// 下面代码将引起编译错误
//		shapes.add(0, new Rectangle());
	}
}
