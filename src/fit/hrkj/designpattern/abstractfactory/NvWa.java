package fit.hrkj.designpattern.abstractfactory;

/**
 * 女娲重造人类<br>
 * 2019年12月22日下午1:30:13
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
		// 第一条生产线，男性生产线
		HumanFactory maleHumanFactory = new MaleFactory();
		// 第二条生产线，女性生产线
		HumanFactory femaleHumanFactory = new FemaleFactory();

		// 生产线建立完毕，开始生产人了:
		System.out.println("---生产一个黄色男性---");
		Human maleYellowHuman = maleHumanFactory.createYellowHuman();
		maleYellowHuman.getColor();
		maleYellowHuman.talk();
		maleYellowHuman.getSex();

		System.out.println("\n\n---生产一个黄色女性---");
		Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
		femaleYellowHuman.getColor();
		femaleYellowHuman.talk();
		femaleYellowHuman.getSex();
	}
}
