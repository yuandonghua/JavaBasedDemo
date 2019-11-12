package fit.hrkj.system;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

/**
 * <br>
 * 2019年5月20日 下午5:47:35
 * 
 * @author 华软科技
 * @version 1.0
 */
public class SystemTest {
	protected int a=10;

	/**
	 * @param args
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		// 获取系统所有的环境变量
		Map<String, String> env = System.getenv();
		for (String name : env.keySet()) {
			System.out.println(name + "--->" + env.get(name));
		}
		// 获取指定环境变量的值
		System.out.println(System.getenv("JAVA_HOME"));
		// 获取所有的系统属性
		Properties properties = System.getProperties();
		// 将所有的系统属性保存到properties.txt文件中
		properties.store(new FileOutputStream("properties.txt"), "System.Properties");
		// 输出特定的系统属性
		System.out.println(System.getProperty("os.name"));
	}

}
