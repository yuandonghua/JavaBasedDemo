package fit.hrkj.generic;

/**
 * <br>
 * 2019年8月12日 下午5:30:44
 * 
 * @author 华软科技
 * @version 1.0
 */
public class ErasureTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E<Integer> e = new E(6);// ①
		// e的getSize()方法返回Integer对象
		Integer size = e.getSize();
		// 把e对象赋给E变量，丢失尖括号里的类型信息
		E e2 = e;// ②
		// b只知道size的类型是Number
		Number size2 = e2.getSize();
		// 下面代码引起编译错误
//		Integer size3 = e2.getSize();// ③

	}

}

class E<T extends Number> {
	T size;

	public E() {

	}

	public E(T size) {
		this.size = size;
	}

	public void setSize(T size) {
		this.size = size;
	}

	public T getSize() {
		return this.size;
	}
}