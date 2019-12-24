package fit.hrkj.designpattern.decorator;

/**
 * 小明爸爸查看成绩单<br>
 * 2019年12月24日下午2:23:18
 * 
 * @author 华软科技
 * @version 1.0
 */
public class Father1 {
	/**
	 * 程序入口
	 * 
	 * @param args 入口参数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 拿来原装成绩单
		SchoolReport sr = new FouthGradeSchoolReport();
		// 加了最高分的成绩单
		sr = new HighScoreDecorator(sr);
		// 加了成绩排名的成绩单
		sr = new SortDecorator(sr);
		// 给小明爸爸看成绩单
		sr.report();
		// 小明爸爸比较满意，签名
		sr.sign("小明爸爸");

	}
}
