package fit.hrkj.designpattern.abstractfactory;

/**
 * 白种人<br>
 * 2019年12月22日下午1:07:52
 * 
 * @author 华软科技
 * @version 1.0
 */
public abstract class AbstractWhiteHuman implements Human {
	/**
	 * 白色人种的皮肤颜色是白色的
	 */
	public void getColor() {
		System.out.println("白色人种的皮肤颜色是白色的！");
	}

	/**
	 * 白色人种讲话
	 */
	public void talk() {
		System.out.println("白色人种会说话，一般说的都是单字节。");
	}
}
