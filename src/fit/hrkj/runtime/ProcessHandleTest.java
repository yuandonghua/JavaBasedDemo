package fit.hrkj.runtime;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

/**
 * <br>
 * 2019年5月22日 上午10:39:02
 * 
 * @author 华软科技
 * @version 1.0
 */
public class ProcessHandleTest {
	
	/**
	 * @param args
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Runtime rt = Runtime.getRuntime();
		// macOS上运行QQ浏览器
		Process p=rt.exec("/Applications/QQBrowser.app/Contents/MacOS/QQBrowser");
		ProcessHandle ph=p.toHandle();
		System.out.println("程序是否运行:"+ph.isAlive());
		System.out.println("进程ID:"+ph.pid());
		System.out.println("父进程:"+ph.parent());
		//获取ProcessHandle.Info信息
		ProcessHandle.Info info=ph.info();
		//通过ProcessHandle.Info信息获取进程相关信息
		System.out.println("进程命令:"+info.command());
		System.out.println("进程参数:"+info.arguments());
		System.out.println("进程启动时间:"+info.startInstant());
		System.out.println("进程累计运行时间:"+info.totalCpuDuration());
		//通过CompletableFuture在进程结束时运行某个任务
		CompletableFuture<ProcessHandle> cf=ph.onExit();
		cf.thenRunAsync(()->System.out.println("程序退出"));
		Thread.sleep(5000);
	}

}
