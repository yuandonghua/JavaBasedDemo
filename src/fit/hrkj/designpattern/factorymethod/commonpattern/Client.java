package fit.hrkj.designpattern.factorymethod.commonpattern;

/**
 * 场景类<br>
 * 2019年12月11日下午4:47:22
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
		Creator creator = new ConcreteCreator();
		Product product = creator.createProduct(ConcreteProduct1.class);
		// 继续处理业务逻辑

	}
}
