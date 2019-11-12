package fit.hrkj.language;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * <br>
 * 2019年6月9日 下午7:56:40
 * 
 * @author 华软科技
 * @version 1.0
 */
public class HelloArg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 定义一个Locale变量
		Locale currentLocale = null;
		// 如果运行程序指定了两个参数
		if (args.length == 2) {
			// 使用运行程序的两个参数构造Locale实例
			currentLocale = new Locale(args[0], args[1]);
		} else {
			// 否则直接使用系统默认的Locale
			currentLocale = Locale.getDefault(Locale.Category.FORMAT);
		}
		//根据Locale加载语言资源
		ResourceBundle bundle=ResourceBundle.getBundle("myMess",currentLocale);
		//取得已加载的语言资源文件中msg对应的消息
		String msg=bundle.getString("msg");
		//使用MessageFormat为带占位符的字符串传入参数
		System.out.println(MessageFormat.format(msg, "华软科技",new Date()));
	}

}
