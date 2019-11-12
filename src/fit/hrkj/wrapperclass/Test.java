package fit.hrkj.wrapperclass;


/**
 * <br>
 * 2019年9月11日下午2:21:52
 * 
 * @author 华软科技
 * @version 1.0
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1是int类型，会自动装箱Integer
		// Integer是Object的子类，父类变量可以指向子类的对象，这叫多态
		Object a = 1;
		Integer c = 1;
		int b = c;
		byte d = 1;
		
		test(1, true);
		test("hello", "world");
		test(new String[]{"hello","world"}, "world");
		
		Integer.parseInt("12");
		Integer.valueOf("123");
		
		String.valueOf(1);
		
		String  aString=1+"";
		
		Integer.toUnsignedString(100);
		
		Integer.divideUnsigned(-2, 3);
		
		System.out.println(0b11111101);
	}

	public static void test(Object a, Object b) {
			if (a instanceof Integer) {
				Integer aInteger=(Integer)a;
				int c=aInteger*100;
				System.out.println(c);
			}
			if (a instanceof String) {
				
				System.out.println(a+"你好");
				
				
			}
			
	}
}
