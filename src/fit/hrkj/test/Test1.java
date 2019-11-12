package fit.hrkj.test;

/**
 * <br>
 * 2019年8月20日 下午4:43:56
 * 
 * @author 华软科技
 * @version 1.0
 */
public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int b = 0;
		b = n++;
		System.out.println("b:" + b + " n:" + n);
		// n=6
		n = n++;// 第一步：表达式的值6；第二步：n=6+1;
		System.out.println("n:" + n);
		// n=6
		n = n++ + n++ + n--;
		// 6 n=7
		// 7 n=8
		// 8 n=7
		System.out.println("n:" + n);
		// n=21
		n = --n - n++ + n-- + --n + ++n;
		// n=20 20
		// n=21 20
		// n=20 21
		// n=19 19
		// n=20 20
		System.out.println("n:" + n);

	}

}
