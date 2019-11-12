package fit.hrkj.exception;

/**
 * <br>
 * 2019年8月18日 上午11:07:17
 * 
 * @author 华软科技
 * @version 1.0
 */
public class CatchTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] objects = { "1", "0" };
		try {

			int a = Integer.parseInt(objects[0]);
			int b = Integer.parseInt(objects[1]);
			int c = a / b;
			System.out.println(c);
		} catch (IndexOutOfBoundsException e1) {
			// TODO: handle exception
			System.out.println("数组越界：运行时程序输入的参数个数不够");
		} catch (NumberFormatException e2) {
			// TODO: handle exception
			System.out.println("数字格式异常：程序只能接收整数参数");
		} catch (ArithmeticException e3) {
			// TODO: handle exception
			System.out.println("算术异常");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("未知异常");
		}
	}

}
