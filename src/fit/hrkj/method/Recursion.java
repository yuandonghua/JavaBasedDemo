package fit.hrkj.method;

/**
 * <br>
 * 2019年8月14日 上午10:29:27
 * 
 * @author 华软科技
 * @version 1.0
 */
public class Recursion {
	int a = 1;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 打印结果 3 10 5 16 8 4 2 1
		int i = 3;
		g(i);

	}

	static void g(int i) {
		System.out.print(i + "\t");

		if (i == 1) {
			return;
		}
		if (i % 2 == 0) {
			g(i / 2);
			return;
		} else {
			g(3 * i + 1);
			return;
		}
	}
}
