package fit.hrkj.generic;

/**
 * <br>
 * 2019年8月5日 上午11:27:31
 * 
 * @author 华软科技
 * @version 1.0
 */
public class ArrayError {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 定义一个Integer数组
		Integer[] i = new Integer[5];
		// 可以把一个Integer[]数组赋给Number[]变量
		Number[] n = i;
		// 下面代码编译正常，但运行时会引发ArrayStoreException异常
		// 因为0.8并不是Integer
		n[0] = 0.8;// ①
	}

}
