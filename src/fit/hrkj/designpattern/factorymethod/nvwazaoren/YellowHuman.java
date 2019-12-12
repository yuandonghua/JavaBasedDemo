package fit.hrkj.designpattern.factorymethod.nvwazaoren;

/**
 * 黄种人<br>
 * 2019年12月11日下午2:33:23
 * 
 * @author 华软科技
 * @version 1.0
 */
public class YellowHuman implements Human {

	@Override
	public void getColor() {
		// TODO Auto-generated method stub
		System.out.println("黄色人种的皮肤颜色是黄色的！");
	}

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("黄色人种会说话，一般说的都是双字节。");
	}

}
