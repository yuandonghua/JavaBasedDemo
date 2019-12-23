package fit.hrkj.designpattern.abstractfactory.commonpattern;

/**
 * 产品等级1的实现类<br>
 * 2019年12月22日下午2:54:39
 * 
 * @author 华软科技
 * @version 1.0
 */
public class Creator1 extends AbstractCreator {
	/**
	 * 只生产产品等级为1的A产品
	 */
	@Override
	public AbstractProductA createProductA() {
		// TODO Auto-generated method stub
		return new ProductA1();
	}

	/**
	 * 只生产产品等级为1的B产品
	 */
	@Override
	public AbstractProductB createProductB() {
		// TODO Auto-generated method stub
		return new ProductB1();
	}

}
