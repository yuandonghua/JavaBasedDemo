package fit.hrkj.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * <br>
 * 2019年8月24日 下午2:22:40
 * 
 * @author 华软科技
 * @version 1.0
 */
public class OverrideThrows {
	public void test() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("b.txt");
	}
}

class Sub extends OverrideThrows {
	/**
	 * 子类方法声明抛出了比父类方法更大的异常 所以下面方法出错
	 */
//	@Override
//	public void test() throws IOException {
//		// TODO Auto-generated method stub
//
//	}
}
