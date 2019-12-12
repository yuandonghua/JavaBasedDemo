package fit.hrkj.object;

public class Phone {
	// 手机的价格
	public int price;
	// 手机的名字
	public String name;
	// 手机的颜色
	public   String color;
	// 手机充电口
	public  String usb ;

	/**
	 * 给手机设置一个名字
	 * 
	 * @param name 手机名字
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 设置手机的价格
	 * 
	 * @param p 价格
	 */
	public void setPrice(int p) {
		price = p;
	}

	public void setColor(String c) {
		color = c;
	}

	/**
	 * 能玩游戏
	 * 
	 * @param gameName 游戏的名字
	 */
	public void playGame(String gameName) {
		if (gameName.equals("开心消消乐")) {
			System.out.println("不喜欢这个游戏:" + gameName);
		} else if (gameName.equals("刺激战场")) {
			System.out.println("喜欢吃鸡:" + gameName);
		} else {
			System.out.println("不一定喜欢:" + gameName);
		}

	}

	/**
	 * 给某某打电话
	 * 
	 * @param p 某某
	 */
	public void call(Person p1, Person p2) {

		if (p2.answerPhoe()) {
			System.out.println(p1.getName() + "给" + p2.getName() + "打电话,打通了");
		} else {
			System.out.println(p1.getName() + "给" + p2.getName() + "打电话,没有打通");

		}

	}
	
}
