package fit.hrkj.language;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * <br>
 * 2019年6月9日 下午5:16:42
 * 
 * @author 华软科技
 * @version 1.0
 */
public class Hello {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 取得系统默认的国家/语言环境
		Locale locale = Locale.getDefault(Locale.Category.FORMAT);
		//根据指定的国家/语言环境加载资源文件
		ResourceBundle bundle=ResourceBundle.getBundle("mess",Locale.CHINESE);
		//打印从资源文件中取得的消息
		System.out.println(bundle.getString("hello"));
	}

}
