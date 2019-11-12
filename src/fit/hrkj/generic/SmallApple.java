package fit.hrkj.generic;

/**
 * <br>
 * 2019年8月4日 下午8:49:55
 * 
 * @author 华软科技
 * @version 1.0
 */
public class SmallApple extends Apple {
	// 重写父类的方法
	@Override
	public Object getInfo() {
		// TODO Auto-generated method stub
		// super.getInfo()方法返回值是Object类型
		// 所以加toString()才返回String类型
		return super.getInfo().toString();
	}

	public static void main(String[] args) {
		SmallApple smallApple = new SmallApple();
		smallApple.setInfo("我是小苹果");
		System.out.println( smallApple.getInfo());
	}
}
