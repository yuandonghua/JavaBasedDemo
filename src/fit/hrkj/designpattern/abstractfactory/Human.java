package fit.hrkj.designpattern.abstractfactory;

/**
 * 人类接口<br>
 * 2019年12月22日下午1:05:12
 * 
 * @author 华软科技
 * @version 1.0
 */
public interface Human {
	/**
	 * 每个人种都有相应的颜色
	 */
	public void getColor();

	/**
	 * 人类会说话
	 */
	public void talk();

	/**
	 * 每个人都有性别
	 */
	public void getSex();
}
