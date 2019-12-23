package fit.hrkj.io.file;

import java.io.File;
import java.io.IOException;

/**
 * 演示File类的功能<br>
 * 2019年12月23日下午2:27:21
 * 
 * @author 华软科技
 * @version 1.0
 */
public class FileTest {
	/**
	 * 程序入口
	 * 
	 * @param args 入口参数
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 以当前路径来创建一个File对象
		File f1 = new File(".");// 1️⃣
		// 输出一个.
		System.out.println("当前路径的文件名：" + f1.getName());
		// 获取相对路径的父路径可能出错，下面代码输出null
		System.out.println("父路径：" + f1.getParent());
		// 获取绝对路径
		System.out.println("绝对路径：" + f1.getAbsoluteFile());
		// 获取上一级路径
		System.out.println("上一级路径：" + f1.getAbsoluteFile().getParent());
		System.out.println("上一级路径的文件名：" + f1.getAbsoluteFile().getParentFile().getName());
		// 在当前路径下创建一个临时文件
		File tempFile = File.createTempFile("test", ".txt", f1);
		// 指定当JVM退出时删除该文件
		tempFile.deleteOnExit();
		// 以系统当前时间作为新文件名来创建文件
		File f2 = new File(System.currentTimeMillis() + "");
		System.out.println("f2对应的文件是否存在：" + f2.exists());
		// 把f2对应的文件创建出来
		f2.createNewFile();
		/*
		 * 以f2对象来创建一个目录， 因为f2已经存在，所以下面方法返回false，即无法创建该目录
		 */
		f2.mkdir();
		// 使用list方法列出当前路径下得所有文件和路径
		String[] list = f1.list();
		System.out.println("--------当前路径下所有文件和路径如下----------");
		for (String string : list) {
			System.out.println(string);
		}
		// listroots静态方法列出所有的磁盘根路径
		File[] listRoots = File.listRoots();
		System.out.println("\n\n--------磁盘根路径如下----------");
		for (File file : listRoots) {
			System.out.println(file);
		}

	}

}
