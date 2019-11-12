package fit.hrkj.log;

import java.io.IOException;
import java.lang.System.Logger;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.FileHandler;
import java.util.logging.Level;

/**<br>  
 * 2019年6月10日 下午2:32:23
 * @author 华软科技  
 * @version 1.0 
 */
public class LoggerI18N {

	/**
	 * @param args 
	 * @throws IOException 
	 * @throws SecurityException 
	 */
	public static void main(String[] args) throws SecurityException, IOException {
		// TODO Auto-generated method stub
		//加载国际化资源包
		ResourceBundle resourceBundle=ResourceBundle.getBundle("logMess",Locale.US);
		//获取System.Logger对象
		Logger logger=System.getLogger("hrkj", resourceBundle);
		//设置系统日志级别
		java.util.logging.Logger.getLogger("hrkj").setLevel(Level.INFO);
		//设置使用a.xml保存日志记录
		java.util.logging.Logger.getLogger("hrkj").addHandler(new FileHandler("a.xml"));
		//下面三个方法的第二个参数是国际化消息key
		logger.log(System.Logger.Level.DEBUG, "debug");
		logger.log(System.Logger.Level.INFO, "info");
		logger.log(System.Logger.Level.ERROR, "error");
	}	

}
