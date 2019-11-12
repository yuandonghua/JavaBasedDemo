/**
 * 
 */
package fit.hrkj.enums;

/**
 * <br>
 * 2019年10月29日下午2:32:05
 * 
 * @author 华软科技
 * @version 1.0
 */
public enum Gender {
	// 此处的枚举值必须调用对应的构造器来创建
	MALE, FEMALE;// ①
	
	static {
		MALE.name="3";
		System.out.println("静态初始化块");
	}
	{
		this.name="2";
		System.out.println("非静态初始化块");
	}
	// 定义一个public修饰的实例变量
	private  String name="1" ;

	/**
	 *
	 * @return name
	 */
	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		Gender male = Gender.valueOf("MALE");
		Gender FEMALE = Gender.valueOf("FEMALE");
		System.out.println(male.name);
		
	}

}
