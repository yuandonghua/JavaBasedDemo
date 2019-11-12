package fit.hrkj.exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * <br>
 * 2019年8月29日 上午11:50:04
 * 
 * @author 华软科技
 * @version 1.0
 */
public class ThrowTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args)
			// java6认为①号代码可能抛出Exception
			// 所以此处必须声明抛出Exception
			// java7会检查①号代码可能抛出异常的实际类型
			// 因此此处只需声明抛出FileNotFoundException异常即可
			throws FileNotFoundException {
		// TODO Auto-generated method stub
		try {
			new FileOutputStream("a.txt");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;// ①
		}
	}

}
