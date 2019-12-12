package fit.hrkj.designpattern.factorymethod.nvwazaoren;

/**
 * 黑种人<br>
 * 2019年12月11日下午2:31:20
 * 
 * @author 华软科技
 * @version 1.0
 */
public class BlackHuman implements Human {

	@Override
	public void getColor() {
		// TODO Auto-generated method stub
		System.out.println("黑色人种的皮肤颜色是黑色的！");
	}

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("黑人会说话，一般人听不懂。");
	}

}
