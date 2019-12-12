package fit.hrkj.designpattern.factorymethod.commonpattern;

/**
 * 抽象工厂类<br>
 * 2019年12月11日下午4:37:33
 * 
 * @author 华软科技
 * @version 1.0
 */
public abstract class Creator {
	/**
	 * 创建一个产品对象，其形参类型可以自行设置，通常为String、Enum、Class等，当然也可以为空
	 * 
	 * @param <T>
	 * @param c
	 * @return
	 */
	public abstract <T extends Product> T createProduct(Class<T> c);
}
