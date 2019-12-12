package fit.hrkj.designpattern.factorymethod.nvwazaoren;

/**
 * 抽象人类创建工厂<br>
 * 2019年12月11日下午2:42:16
 * 
 * @author 华软科技
 * @version 1.0
 */
public abstract class AbstractHumanFactory {
	/**
	 * 创建一个具体的人类
	 * 
	 * @param <T> 必须是Human接口的实现类
	 * @param c   具体人类所属的类
	 * @return 创建出来的具体人类
	 */
	public abstract <T extends Human> T createHuman(Class<T> c);
}
