package fit.hrkj.designpattern.decorator.commonpattern;

/**
 * 一个具体的装饰器<br>
 * 2019年12月24日下午2:47:02
 * 
 * @author 华软科技
 * @version 1.0
 */
public class ConcreteDecorator1 extends Decorator {

	/**
	 * @param component
	 */
	public ConcreteDecorator1(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	private void method1() {
		System.out.println("定义自己的修饰方法method1");
	}

	@Override
	public void operate() {
		// TODO Auto-generated method stub
		// 重写父类的操作方法
		// 先调用修饰方法
		method1();
		// 再调用父类的操作方法
		super.operate();
	}
}
