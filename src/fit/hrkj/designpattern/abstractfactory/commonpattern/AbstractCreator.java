package fit.hrkj.designpattern.abstractfactory.commonpattern;

/**
 * 抽象工厂类<br>
 * 2019年12月22日下午2:51:18
 * 
 * @author 华软科技
 * @version 1.0
 */
public abstract class AbstractCreator {
	/**
	 * 创建A产品家族
	 */
	public abstract AbstractProductA createProductA();

	/**
	 * 创建B产品家族
	 */
	public abstract AbstractProductB createProductB();
}
