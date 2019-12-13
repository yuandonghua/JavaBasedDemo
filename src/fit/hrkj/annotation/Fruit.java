package fit.hrkj.annotation;

/**
 * 水果类<br>
 * 2019年12月12日下午5:28:12
 * 
 * @author 华软科技
 * @version 1.0
 */
public class Fruit {
	public void info() {
		System.out.println("水果的info方法。。。");
	}
}

class Apple extends Fruit {
	// 使用@Override指定下面方法必须重写父类方法
	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("苹果重写水果的info方法。。。。");
	}

}
