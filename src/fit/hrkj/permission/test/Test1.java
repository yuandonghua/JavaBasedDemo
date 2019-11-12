package fit.hrkj.permission.test;

import fit.hrkj.permission.Person;
import fit.hrkj.permission.Iphone;
import static fit.hrkj.permission.Iphone.*;

/**
 * <br>
 * 2019年8月23日 上午9:44:56
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

		Person p1 = new Person();
		p1.setName("朱永齐");
		Iphone iphone = new Iphone();
		iphoneName = "小米9";
		iphonePrice = 3999;
		System.out.println(introduction());
		p1.buyIphone(iphone);

	}

}
