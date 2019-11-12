package fit.hrkj.permission;


/**
 * 演示人的成员访问权限<br>
 * 2019年8月23日 上午9:35:41
 * 
 * @author 华软科技
 * @version 1.0
 */
public class Person {
	// 名字
	private String name;
	// 成绩
	double score;
	// 性别
	public String sex;
	// 眼睛的数量
	public static int eyeNum = 2;
	public static int shouNum = 2;

	/**
	 *
	 * @return name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 *
	 * @return name
	 */
	public void setName(String name) {
		this.name = name;
		Person.eyeNum = 2;
	}

	public Person() {
		super();
		this.name = name;
		this.score = score;
		this.sex = sex;
	}

	public void buyIphone(Iphone iphone) {
		System.out.println("我买了一个手机："+iphone.introduction());
	}
}
