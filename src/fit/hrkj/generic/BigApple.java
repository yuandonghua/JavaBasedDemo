package fit.hrkj.generic;

/**
 * <br>
 * 2019年8月4日 下午8:20:33
 * 
 * @author 华软科技
 * @version 1.0
 */
public class BigApple extends Apple<String> {
	// 正确重写了父类的方法，返回值
	// 与父类Apple<String>的返回值完全相同
	public String getInfo() {
		return "子类：" + super.getInfo();
	}

//	public Object getInfo() {
//
//		return "子类";
//	}
	public static void main(String[] args) {
		BigApple bigApple = new BigApple();
		bigApple.setInfo("我是大苹果");
		System.out.println(bigApple.getInfo());
	}
}
