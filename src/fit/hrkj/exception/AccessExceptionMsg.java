package fit.hrkj.exception;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * <br>
 * 2019年8月21日 下午8:09:33
 * 
 * @author 华软科技
 * @version 1.0
 */
public class AccessExceptionMsg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("b.txt");
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
