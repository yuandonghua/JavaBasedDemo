package fit.hrkj.collection.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * <br>
 * 2019年7月23日 下午2:33:00
 * 
 * @author 华软科技
 * @version 1.0
 */
public class PropertiesTest {

	/**
	 * @param args
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Properties props = new Properties();
		// 向Properties中添加属性
		props.setProperty("userName", "华软科技");
		props.setProperty("password", "123qwe");
		// 将Properties中的key-value对保存到a.txt文件中
		props.store(new FileOutputStream("a.txt"), "comment line");// ①
		// 新建一个Properties对象
		Properties props2 = new Properties();
		// 向Properties中添加属性
		props2.setProperty("gender", "男");
		// 将a.ini文件中的key-value对追加到props2中
		props2.load(new FileInputStream("a.txt"));// ②
		System.out.println(props2);

	}

}
