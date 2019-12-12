package fit.hrkj.designpattern.factorymethod.nvwazaoren;

/**
 * 白种人<br>
 * 2019年12月11日下午2:36:39
 * 
 * @author 华软科技
 * @version 1.0
 */
public class WhiteHuman implements Human {

	@Override
	public void getColor() {
		// TODO Auto-generated method stub
		System.out.println("白色人种的皮肤颜色是白色的！");
	}

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("白色人种会说话，一般都是但是单字节。");
	}

}
