package fit.hrkj.generic;

/**
 * <br>
 * 2019年8月4日 下午5:53:22
 * 
 * @author 华软科技
 * @version 1.0
 */
public class Apple<T> {
	// 使用T类型定义实例变量
	private T info;

	public Apple() {
	}

	// 下面方法中使用T类型来定义构造器
	public Apple(T info) {
		setInfo(info);
	}

	/**
	 *
	 * @return info
	 */
	public T getInfo() {
		return info;
	}

	/**
	 *
	 * @return info
	 */
	public void setInfo(T info) {
		this.info = info;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 由于传给T形参的是String，所以构造器参数只能是String
		Apple<String> a1 = new Apple<>("苹果");
		System.out.println("这个水果的名字叫：" + a1.getInfo());
		// 由于传给T形参的是Double，所以构造器参数只能是Double或double
		Apple<Double> a2 = new Apple<>(5.67);
		System.out.println("这个水果的重量是：" + a2.getInfo() + "克");
	}

}
