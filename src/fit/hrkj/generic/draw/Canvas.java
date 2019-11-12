package fit.hrkj.generic.draw;

import java.util.List;

/**
 * 画布<br>
 * 2019年8月7日 上午11:36:12
 * 
 * @author 华软科技
 * @version 1.0
 */
public class Canvas {
	//同时在画布上绘制多个形状，使用被限制的泛型通配符
	public void drawAll(List<? extends Shape> shapes) {
		for (Shape shape : shapes) {
			shape.draw(this);
		}
	}
}
