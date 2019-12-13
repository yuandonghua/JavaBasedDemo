package fit.hrkj.annotation;

/**
 * 玩耍接口<br>
 * 2019年12月13日下午8:38:36
 * 
 * @author 华软科技
 * @version 1.0
 */
@FunctionalInterface
public interface PlayInterface {
	/**
	 * 只定义一个抽象方法
	 */
	void playGame();

	/**
	 * 静态方法
	 */
	static void hasTime() {
		System.out.println("有时间玩");
	}

	/**
	 * 默认方法
	 */
	default void playChiJi() {
		System.out.println("如果不知道玩什么，就玩吃鸡");
	}

}
