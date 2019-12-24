package fit.hrkj.designpattern.decorator;

/**
 * 家长类，查看成绩单<br>
 * 2019年12月24日上午10:14:04
 * 
 * @author 华软科技
 * @version 1.0
 */
public class Father {
	/**
	 * 程序入口
	 * 
	 * @param args 入口参数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//家长拿到你的成绩单
		SchoolReport sr = new SugarFouthGradeSchoolReport();
		//查看你的分数
		sr.report();
		//分数还可以，名次还可以，签名吧
		sr.sign("小明爸爸");
		
		

	}
}
