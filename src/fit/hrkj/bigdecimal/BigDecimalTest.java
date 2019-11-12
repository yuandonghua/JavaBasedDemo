package fit.hrkj.bigdecimal;

import java.math.BigDecimal;

/**
 * <br>
 * 2019年5月27日 下午2:49:09
 * 
 * @author 华软科技
 * @version 1.0
 */
public class BigDecimalTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal f1 = new BigDecimal("0.05");
		BigDecimal f2 = BigDecimal.valueOf(0.1);
		BigDecimal f3 = new BigDecimal(0.05);
		System.out.println("使用String作为BigDecimal构造器参数:");
		System.out.println("0.05+0.1= " + f1.add(f2));
		System.out.println("0.05-0.1= " + f1.subtract(f2));
		System.out.println("0.05*0.1= " + f1.multiply(f2));
		System.out.println("0.05/0.1= " + f1.divide(f2));
		System.out.println("使用double作为BigDecimal构造器参数:");
		System.out.println("0.05+0.1= " + f3.add(f2));
		System.out.println("0.05-0.1= " + f3.subtract(f2));
		System.out.println("0.05*0.1= " + f3.multiply(f2));
		System.out.println("0.05/0.1= " + f3.divide(f2));

	}

}
