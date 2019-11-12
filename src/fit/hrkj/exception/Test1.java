package fit.hrkj.exception;

/**
 * <br>
 * 2019年8月13日 下午8:51:52
 * 
 * @author 华软科技
 * @version 1.0
 */
public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1 = null;
		try {
			t1.test1();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("这个对象为空，不能调用实例方法");
		}
		String[] strArr = { "java", null, "h5", "android" };
		for (String string : strArr) {
			try {

				System.out.println("元素的长度：" + string.length());

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("这个数组元素为空跳过去");
				continue;
			}
		}

	}

	public void test1() {

	}

}
