package fit.hrkj.object;

public class Person {
	private String name;
	private static int eyeNum=2;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static int getEyeNum() {
		return eyeNum;
	}

	public static void setEyeNum(int eyeNum) {
		Person.eyeNum = eyeNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
