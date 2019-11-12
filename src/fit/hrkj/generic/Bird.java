package fit.hrkj.generic;


/**
 * <br>
 * 2019年8月7日 下午4:28:57
 * 
 * @author 华软科技
 * @version 1.0
 */
public class Bird<T extends Number & java.io.Serializable> {
	T t;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird<Integer> iBird = new Bird<Integer>();
		Bird<Double> dBird = new Bird<Double>();
		// 下面代码将引发编译异常，试图把String类型传给T形参
		// 但String不是Number的子类型，所以引发编译错误
//		Bird<String> sBird = new Bird<>();

	}

}
