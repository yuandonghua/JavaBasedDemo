package fit.hrkj.designpattern.abstractfactory.commonpattern;

/**
 * 产品等级2的实现类<br>
 * 2019年12月22日下午2:54:39
 * 
 * @author 华软科技
 * @version 1.0
 */
public class Creator2 extends AbstractCreator {
	/**
	 * 只生产产品等级为2的A产品
	 */
	@Override
	public AbstractProductA createProductA() {
		// TODO Auto-generated method stub
		return new ProductA2();
	}

	/**
	 * 只生产产品等级为2的B产品
	 */
	@Override
	public AbstractProductB createProductB() {
		// TODO Auto-generated method stub
		return new ProductB2();
	}

}
