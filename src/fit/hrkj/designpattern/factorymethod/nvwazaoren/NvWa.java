package fit.hrkj.designpattern.factorymethod.nvwazaoren;

/**
 * 女娲造人场景类<br>
 * 2019年12月11日下午3:03:46
 * 
 * @author 华软科技
 * @version 1.0
 */
public class NvWa {
	/**
	 * 程序入口
	 * 
	 * @param args 入口参数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractHumanFactory baGuaLu = new HumanFactory();
		//女娲第一次造人，火候不足，于是白人产生了
		System.out.println("------造出的第1批人是白种人-----");
		Human whiteHuman = baGuaLu.createHuman(WhiteHuman.class);
		whiteHuman.getColor();
		whiteHuman.talk();
		//女娲第二次造人，火候过足，于是黑人产生了
		System.out.println("------造出的第2批人是黑种人-----");
		Human blackHuman=baGuaLu.createHuman(BlackHuman.class);
		blackHuman.getColor();
		blackHuman.talk();
		//第三次造人，火候刚刚好，于是黄色人种产生了
		System.out.println("------造出的第3批人是黄种人-----");
		Human yellowHuman=baGuaLu.createHuman(YellowHuman.class);
		yellowHuman.getColor();
		yellowHuman.talk();
		
		
	}
}
