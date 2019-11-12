package fit.hrkj.collection.set;

import java.util.EnumSet;

/**
 * <br>
 * 2019年7月3日 下午6:02:35
 * 
 * @author 华软科技
 * @version 1.0
 */
public class EnumSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建一个EnumSet集合,集合元素就是Season枚举类的全部枚举值
		EnumSet es = EnumSet.allOf(Season.class);
		System.out.println(es);
		// 创建一个EnumSet空集合,指定其集合元素是Season类的枚举值
		EnumSet es2 = EnumSet.noneOf(Season.class);
		System.out.println(es2);
		// 手动添加两个元素
		es2.add(Season.SPRING);
		es2.add(Season.WINTER);
		System.out.println(es2);
		// 以指定枚举值创建EnumSet集合
		EnumSet es3 = EnumSet.of(Season.SPRING, Season.SUMMER);
		System.out.println(es3);
		EnumSet es4 = EnumSet.range(Season.SUMMER, Season.WINTER);
		System.out.println(es4);
		// 新创建的EnumSet集合元素和es4集合元素有相同的类型
		// es5集合元素+es4集合元素=Season枚举类的全部枚举值
		EnumSet es5 = EnumSet.complementOf(es4);
		System.out.println(es5);
	}

}

enum Season {
	SPRING, SUMMER, FALL, WINTER
}