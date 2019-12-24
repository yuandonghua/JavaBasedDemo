package fit.hrkj.designpattern.decorator;

/**
 * 抽象成绩单<br>
 * 2019年12月24日上午10:03:09
 * 
 * @author 华软科技
 * @version 1.0
 */
public abstract class SchoolReport {
	/**
	 * 展示成绩
	 */
	public abstract void report();

	/**
	 * 家长签字
	 * 
	 * @param name 签名
	 */
	public abstract void sign(String name);
}
