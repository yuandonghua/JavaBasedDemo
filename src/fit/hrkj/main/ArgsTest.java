package fit.hrkj.main;

/**
 * 测试Args<br>
 * 2019年5月18日 下午5:26:19
 * 
 * @author 华软科技
 * @version 1.0
 */
public class ArgsTest {

	/**
	 * 程序入口
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("args数组的长度:"+args.length);
		for (String string : args) {
			System.out.println(string);
		}
	}

}
