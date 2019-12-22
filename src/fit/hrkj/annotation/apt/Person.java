package fit.hrkj.annotation.apt;

/**
 * 人类是个持久化类<br>
 * 2019年12月21日下午8:07:33
 * 
 * @author 华软科技
 * @version 1.0
 */
@Persistent(table = "user")
public class Person {
	/**
	 * 人的id
	 */
	@Id(column = "id", type = "integer", generator = "identity")
	private int id;
	/**
	 * 人的名字
	 */
	@Property(column = "name", type = "string")
	private String name;
	/**
	 * 人的年龄
	 */
	@Property(column = "age", type = "integer")
	private int age;

	/**
	 * 无参构造器
	 */
	public Person() {
	}

	/**
	 * @param id
	 * @param name
	 * @param age
	 */
	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	/**
	 * 获取id
	 * 
	 * @return 唯一标识
	 */
	public int getId() {
		return id;
	}

	/**
	 * 设置id
	 * 
	 * @param id 唯一标识
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 获取名字
	 * 
	 * @return 名字
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置名字
	 * 
	 * @param name 名字
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取年龄
	 * 
	 * @return 年龄
	 */
	public int getAge() {
		return age;
	}

	/**
	 * 设置年龄
	 * 
	 * @param age 年龄
	 */
	public void setAge(int age) {
		this.age = age;
	}

}
