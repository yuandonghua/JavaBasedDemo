package fit.hrkj.log;

import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.logging.FileHandler;

/**
 * <br>
 * 2019年6月9日 下午8:46:24
 * 
 * @author 华软科技
 * @version 1.0
 */
public class LoggerTest {

	/**
	 * @param args
	 * @throws IOException
	 * @throws SecurityException
	 */
	public static void main(String[] args) throws SecurityException, IOException {
		// TODO Auto-generated method stub
		// 获取System.Logger对象
		Logger logger = System.getLogger("hrkj");
		// 设置系统日志级别(FINE对应DEBUG)
		java.util.logging.Logger logger2 = java.util.logging.Logger.getLogger("hrkj");
		logger2.setLevel(java.util.logging.Level.OFF);
		// 设置使用a.xml保存日志记录
		logger2.addHandler(new FileHandler("a.xml"));
		
		
//		logger2.log(java.util.logging.Level.WARNING, "WARNING");
		
		logger.log(Level.ALL, "ALL信息");
		logger.log(Level.TRACE, "TRACE信息");
		logger.log(Level.DEBUG, "debug信息");
		logger.log(Level.INFO, "info信息");
		logger.log(Level.WARNING, "warning信息");
		logger.log(Level.ERROR, "error信息");
		
		
		
	}

}
