package fit.hrkj.designpattern.decorator;

/**
 * 装饰过后的成绩单<br>
 * 2019年12月24日上午10:06:18
 * 
 * @author 华软科技
 * @version 1.0
 */
public class SugarFouthGradeSchoolReport extends FouthGradeSchoolReport {
	/**
	 * 美化成绩的方法，汇报最高分
	 */
	public void reporthighScore() {
		System.out.println("语文最高是75，数学是78，英语是80");
	}

	/**
	 * 看完成绩单后，汇报排名
	 */
	public void reportSort() {
		System.out.println("我排在38名");
	}

	@Override
	public void report() {
		// TODO Auto-generated method stub
		reporthighScore();// 先说最高成绩
		super.report();// 再汇报自己的成绩单
		reportSort();// 再说排名
	}


}
