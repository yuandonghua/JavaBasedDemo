package fit.hrkj.designpattern.abstractfactory;

/**
 * 黑种人<br>
 * 2019年12月22日下午1:11:21
 * 
 * @author 华软科技
 * @version 1.0
 */
public abstract class AbstractBlackHuman implements Human {
	public void getColor() {
		System.out.println("黑色人种的皮肤颜色是黑色的！");
	}

	public void talk() {
		System.out.println("黑人会说话，一般人听不懂。");
	}
}
