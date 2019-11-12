package fit.hrkj.exception;

/**
 * <br>
 * 2019年8月18日 下午4:14:46
 * 
 * @author 华软科技
 * @version 1.0
 */
public class MultiExceptionTest {

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
		} catch (IndexOutOfBoundsException | NumberFormatException | ArithmeticException e) {
			// TODO: handle exception
			System.out.println("数组越界、数据格式异常、算术异常之一");
			// 捕获多异常时，异常变量默认有final修饰
			// 所以下面代码有错误
//			e = new ArithmeticException("test");// ①
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("未知异常");
			// 捕获一种类型的异常时，异常变量没有final修饰
			// 所以下面代码完全正确
			e = new RuntimeException("test");// ②
		}
	}

}
