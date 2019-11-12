package fit.hrkj.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**<br>  
 * 2019年5月19日 下午8:36:41
 * @author 华软科技  
 * @version 1.0 
 */
public class ScannerFileTest {

	/**
	 * @param args 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//将一个File对象作为Scanner的构造器参数,Scanner读取文件内容,需要throws异常
		Scanner sc=new Scanner(new File("C:\\Users\\hrkj\\Desktop\\Java\\JavaProject\\JavaBasedDemo\\src\\fit\\hrkj\\scanner\\ScannerFileTest.java"));
		System.out.println("ScannerFileTest.java文件内容如下:");
		//判断是否还有下一行
		while (sc.hasNextLine()) {
			//输出文件中的下一行
			System.out.println(sc.nextLine());
		}
	}
	
	//创建一个数组长度为10,int

}