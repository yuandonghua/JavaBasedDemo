package fit.hrkj.io.file;

import java.io.File;

/**
 * 演示File类的list方法，过滤文件<br>
 * 2019年12月23日下午3:03:57
 * 
 * @author 华软科技
 * @version 1.0
 */
public class FilenameFilterTest {
	/**
	 * 程序入口
	 * 
	 * @param args 入口参数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("src/fit/hrkj/io/file");
		// 使用Lambda表达式（目标类型为FilenameFilter）实现文件过滤器
		// 如果文件名以.java结尾，或者文件对应一个路径，则返回true
		String[] list = f1.list((dir, name) -> name.endsWith(".java") || new File(name).isDirectory());// 1️⃣
		for (String name : list) {
			System.out.println(name);
		}
	}
}
