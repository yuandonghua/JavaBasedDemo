package fit.hrkj.designpattern.decorator.commonpattern;

/**
 * 场景类<br>
 * 2019年12月24日下午2:51:44
 * 
 * @author 华软科技
 * @version 1.0
 */
public class Client {
	/**
	 * 程序入口
	 * 
	 * @param args 入口参数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建核心构件
		Component component = new ConcreteComponent();
		// 第一次修饰
		component = new ConcreteDecorator1(component);
		// 第二次修饰
		component = new ConcreteDecorator2(component);
		// 修饰后构件的操作方法
		component.operate();

	}
}
