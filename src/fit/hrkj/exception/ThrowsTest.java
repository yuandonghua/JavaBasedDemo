package fit.hrkj.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**<br>  
 * 2019年8月22日 下午4:56:11
 * @author 华软科技  
 * @version 1.0 
 */
public class ThrowsTest {

	/**
	 * @param args 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream name = new FileInputStream("c.txt");
		System.out.println("没有出错！");
	}

}
