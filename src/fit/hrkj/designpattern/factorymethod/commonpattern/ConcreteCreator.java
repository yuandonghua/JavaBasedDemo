package fit.hrkj.designpattern.factorymethod.commonpattern;

import java.lang.reflect.InvocationTargetException;

/**
 * 具体工厂类<br>
 * 2019年12月11日下午4:43:29
 * 
 * @author 华软科技
 * @version 1.0
 */
public class ConcreteCreator extends Creator {

	public <T extends Product> T createProduct(Class<T> c) {
		// TODO Auto-generated method stub
		T product = null;

		try {
			product = (T) Class.forName(c.getName()).getDeclaredConstructor().newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("创建产品对象错误");
			e.printStackTrace();
		}

		return product;
	}

}
