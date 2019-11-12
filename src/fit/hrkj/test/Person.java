package fit.hrkj.test;


/**
 * <br>
 * 2019年8月23日 上午11:17:16
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
	public static int eyeNum;

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

	class Arm {

	}
}
