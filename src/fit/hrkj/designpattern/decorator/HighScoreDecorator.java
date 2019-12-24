package fit.hrkj.designpattern.decorator;

/**
 * 最高成绩的修饰器<br>
 * 2019年12月24日下午12:15:44
 * 
 * @author 华软科技
 * @version 1.0
 */
public class HighScoreDecorator extends Decorator {

	/**
	 * @param sr
	 */
	public HighScoreDecorator(SchoolReport sr) {
		super(sr);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 美化成绩的方法，汇报最高分
	 */
	private void reportHeighScore() {
		System.out.println("语文最高是75，数学是78，英语是80");
	}

	@Override
	public void report() {
		// TODO Auto-generated method stub
		// 先汇报最高分
		reportHeighScore();
		// 再汇报成绩
		super.report();
	}

}
