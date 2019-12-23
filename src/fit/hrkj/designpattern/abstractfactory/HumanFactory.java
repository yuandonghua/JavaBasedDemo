package fit.hrkj.designpattern.abstractfactory;

/**
 * 八卦炉定义<br>
 * 2019年12月22日下午1:20:04
 * 
 * @author 华软科技
 * @version 1.0
 */
public interface HumanFactory {
	/**
	 * 制造一个黄色人种
	 */
	public Human createYellowHuman();

	/**
	 * 制造一个白色人种
	 */
	public Human createWhiteHuman();

	/**
	 * 制造一个黑色人种
	 */
	public Human createBlackHuman();
}
