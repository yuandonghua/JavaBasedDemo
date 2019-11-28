package fit.hrkj.runtime;

import java.io.IOException;

/**<br>  
 * 2019年5月22日 上午10:03:52
 * @author 华软科技  
 * @version 1.0 
 */
public class ExecTest {

	/**
	 * @param args 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Runtime rt=Runtime.getRuntime();
		//运行记事本程序
//		rt.exec("notepad.exe");
		//macOS上运行QQ浏览器
		rt.exec("/Applications/360Chrome.app");
//		rt.exec("/Applications/QQLive.app/Contents/MacOS/QQLive");
		
	}

}
