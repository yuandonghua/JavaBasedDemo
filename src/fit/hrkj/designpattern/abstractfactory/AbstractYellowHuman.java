package fit.hrkj.designpattern.abstractfactory;

/**
 * 黄种人<br>
 * 2019年12月22日下午1:11:21
 * 
 * @author 华软科技
 * @version 1.0
 */
public abstract class AbstractYellowHuman implements Human {
	public void getColor() {
		System.out.println("黄色人种的皮肤颜色是黄色的！");
	}

	public void talk() {
		System.out.println("黄色人种会说话，一般说的都是双字节。");
	}
}
