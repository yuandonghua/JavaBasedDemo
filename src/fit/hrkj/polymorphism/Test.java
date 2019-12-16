package fit.hrkj.polymorphism;

public class Test {
	/**
	 * 
	 * Description: 程序入口
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 下面编译时类型和运行时类型完全一样,因此不存在多态
		BaseClass bc = new BaseClass();
		// 输出6
		System.out.println(bc.book);
		// 下面两次调用将执行BaseClass的方法
		bc.base();
		bc.test();
		// 下面编译时类型和运行时类型完全一样,因此不存在多态
		SubClass sc = new SubClass();
		// 输出java
		System.out.println(sc.book);
		// 下面调用将执行从父类继承得到的base方法
		sc.base();
		// 下面调用将执行当前类的test方法
		sc.test();
		sc.base2();
		// 下面编译时类型和运行时类型不一样,多态发生
		BaseClass baseClass = new SubClass();
		// 输出6,表明访问的是父类对象的实例变量
		System.out.println(baseClass.book);
		// 下面调用将执行从父类继承到的base方法
		baseClass.base();
		// 下面调用将执行当前类的test方法
		baseClass.test();
		// 因为baseClass的编译时类型是BaseClass
		// BaseClass类没有提供sub方法,所以下面代码编译时会出现错误
        ((SubClass)baseClass).sub();
	}
}
