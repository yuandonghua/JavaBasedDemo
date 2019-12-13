package fit.hrkj.annotation;

/**
 * 演示@Deprecated<br>
 * 2019年12月12日下午8:49:14
 * 
 * @author 华软科技
 * @version 1.0
 */
public class Phone {
	@Deprecated(since = "9", forRemoval = true)
	public void support2G() {
		System.out.println("支持2G信号");
	}

	/**
	 * 程序入口
	 * 
	 * @param args 入口参数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Phone().support2G();
	}
}
