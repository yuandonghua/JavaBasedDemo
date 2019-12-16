package fit.hrkj.polymorphism;

/**
 * @Name: SubClass
 * @Description: 子类
 * @author 华软科技
 * @date 2019年4月8日 下午3:42:33
 */
class SubClass extends BaseClass {
	// 重新定义一个book实例变量book实例变量隐藏父类的book实例变量
	public String book = "java";

	public void test() {
		System.out.println("子类覆盖父类的方法");
	}

	public void sub() {
		System.out.println("子类的普通方法");
	}

	
}