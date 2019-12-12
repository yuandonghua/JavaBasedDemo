package fit.hrkj.designpattern.factorymethod.nvwazaoren;

import java.lang.reflect.InvocationTargetException;

/**
 * 人类创建工厂<br>
 * 2019年12月11日下午2:50:17
 * 
 * @author 华软科技
 * @version 1.0
 */
public class HumanFactory extends AbstractHumanFactory {

	@SuppressWarnings("unchecked")
	@Override
	public <T extends Human> T createHuman(Class<T> c) {
		// TODO Auto-generated method stub
		// 定一个人类
		T human = null;
		try {
			human = (T) Class.forName(c.getName()).getDeclaredConstructor().newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("人类创建错误");
			e.printStackTrace();
		}
		return human;
	}

}
