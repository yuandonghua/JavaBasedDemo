package fit.hrkj.designpattern.abstractfactory.commonpattern;

/**
 * 抽象产品类<br>
 * 2019年12月22日下午1:53:05
 * 
 * @author 华软科技
 * @version 1.0
 */
public abstract class AbstractProductA {
	/**
	 * 每个产品共有的方法
	 */
	public void shareMethod() {
		System.out.println("每个产品共有的方法shareMethod");
	}

	/**
	 * 每个产品相同方法，不同实现
	 */
	public abstract void doSomething();
}
