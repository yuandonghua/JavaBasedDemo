package fit.hrkj.designpattern.abstractfactory.commonpattern;

/**
 * 场景类<br>
 * 2019年12月22日下午2:59:41
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
		// 定义出两个工厂
		AbstractCreator creator1 = new Creator1();
		AbstractCreator creator2 = new Creator2();
		// 产生A1对象
		AbstractProductA a1 = creator1.createProductA();
		// 产生A2对象
		AbstractProductA a2 = creator2.createProductA();
		// 产生B1对象
		AbstractProductB b1 = creator1.createProductB();
		// 产生B2对象
		AbstractProductB b2 = creator2.createProductB();
	}
}
