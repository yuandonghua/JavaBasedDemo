package fit.hrkj.annotation;

import java.util.Arrays;

/**
 * <br>
 * 2019年12月18日下午3:36:22
 * 
 * @author 华软科技
 * @version 1.0
 */
@HRKJTag(age = 2)
@HRKJTag(name = "华软科技", age = 3)
public class HRKJTagTest {
	/**
	 * 程序入口
	 * 
	 * @param args 入口参数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<HRKJTagTest> clazz = HRKJTagTest.class;
		/*
		 * 使用java8新增的getDeclaredAnnotationsByType方法获取修饰HRKJTagTest类的多个@HRKJTag注解
		 */
		HRKJTag[] tags = clazz.getDeclaredAnnotationsByType(HRKJTag.class);
		// 遍历修饰HRKJTest类的多个@HRKJTag注解
		for (HRKJTag hrkjTag : tags) {
			System.out.println(hrkjTag.name() + "->" + hrkjTag.age());
		}
		/*
		 * 使用传统的方法获取修饰HRKJTagTest类的@HRKJTag注解
		 */
		HRKJTags tag = clazz.getDeclaredAnnotation(HRKJTags.class);
		System.out.println(Arrays.toString(tag.value()));
	}
}
