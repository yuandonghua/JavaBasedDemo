package fit.hrkj.string;

/**<br>  
 * 2019年6月1日 上午10:48:55
 * @author 华软科技  
 * @version 1.0 
 */
public class EqualsTest {

	/**
	 * @param args 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="hrkj";
		String name2="hrkj";
		String name3="wzy";
		
		
		Student s1 = new Student();
		s1.setName("hrkj");
		Student s2 = new Student();
		s2.setName("hrkj");
		System.out.println(s1.getName()==s2.getName());
		
		
	}

}

class Student{
	String name;

	/**
	 *
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 *
	 * @return name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}