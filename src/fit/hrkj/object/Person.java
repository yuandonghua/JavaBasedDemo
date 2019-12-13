package fit.hrkj.object;

import java.util.Properties;
/**
 * 人类<br>  
 * 2019年12月13日下午8:02:43
 * @author 华软科技
 * @version 1.0
 */
public class Person {
	// 人的名字
	public String name;
	// 人的状态
	public String status;
	// 人呼吸空气
	public static String breathe = "氧气";

	public Person(String name) {
		setName(name);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Person setName(String name) {
		this.name = name;

		return this;
	}

	/**
	 * 设置人的状态
	 * 
	 * @param s 忙,闲
	 */
	public Person setStatus(String s) {
		status = s;

		return this;
	}

	/**
	 * 接电话
	 * 
	 * @param status 接电话的状态
	 * @return 是否接电话
	 */
	public boolean answerPhoe() {
		if (this.status.equals("忙")) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * 使用手机给某某打电话
	 * 
	 * @param phone   你的手机
	 * @param persion 给谁打电话
	 */
	public void usePhoneCallPerson(Phone phone, Person person) {
		phone.call(this, person);
	}

	public static void eat() {
		System.out.println("会吃饭");
	}

}
