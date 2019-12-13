package fit.hrkj.object;

/**
 * 手机类<br>
 * 2019年12月13日下午8:00:39
 * 
 * @author 华软科技
 * @version 1.0
 */
public class Phone {
	/**
	 * 手机的价格
	 */
	public int price;
	/**
	 * 手机的名字
	 */
	public String name;
	/**
	 * 手机的颜色
	 */
	public String color;
	/**
	 * 手机的充电接口
	 */
	public String usb;

	/**
	 * ????����?��???��????��?
	 * 
	 * @param name ??����??��?
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * ?��????������?1/4???
	 * 
	 * @param p 1/4???
	 */
	public void setPrice(int p) {
		price = p;
	}

	public void setColor(String c) {
		color = c;
	}

	/**
	 * 玩游戏
	 * 
	 * @param gameName 游戏名字
	 */
	public void playGame(String gameName) {
		if (gameName.equals("??????????")) {
			System.out.println("2��?2��????????��:" + gameName);
		} else if (gameName.equals("??1/4��?1/23?")) {
			System.out.println("?2��?3?1/4|:" + gameName);
		} else {
			System.out.println("2��?��?��?2��?:" + gameName);
		}

	}

	/**
	 * 给别人打电话
	 * 
	 * @param p1 谁打的
	 * @param p2 给谁打
	 */
	public void call(Person p1, Person p2) {

		if (p2.answerPhoe()) {
			System.out.println(p1.getName() + "??" + p2.getName() + "?����?����,?��?��??");
		} else {
			System.out.println(p1.getName() + "??" + p2.getName() + "?����?����,?��???��?��");

		}

	}

}
