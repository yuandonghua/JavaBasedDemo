package fit.hrkj.object;

/**
 * <br>
 * 2019年5月22日 下午7:59:07
 * 
 * @author 华软科技
 * @version 1.0
 */
public class CloneTest {

	/**
	 * @param args
	 * @throws CloneNotSupportedException
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		User u1 = new User(28);
		// clone得到u1对象的副本
		User u2 = u1.clone();
		// 判断u1,u2是否相同
		System.out.println(u1 == u2);// ①
		// 判断u1,u2的address是否相同
		System.out.println(u1.address == u2.address);// ②

	}

}

class User implements Cloneable {
	int age;
	Address address;

	/**
	 * @param age
	 * @param address
	 */
	public User(int age) {
		super();
		this.age = age;
		this.address = new Address("商水县");
	}

	// 通过super.clone()来实现clone方法
	public User clone() throws CloneNotSupportedException {
		User user=(User) super.clone();
			user.address=address.clone();
		return user;
	}
}

class Address implements Cloneable{
	String detail;

	/**
	 * @param detail
	 */
	public Address(String detail) {
		super();
		this.detail = detail;
	}
		// 通过super.clone()来实现clone方法
	public Address clone() throws CloneNotSupportedException {

			return (Address) super.clone();
		}
}
