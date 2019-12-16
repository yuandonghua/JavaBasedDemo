package fit.hrkj.object;

/**
 * 子类<br>
 * 2019年12月16日上午10:18:46
 * 
 * @author 华软科技
 * @version 1.0
 */
public class Sub extends Base {
	private String name;

	public void test() {// ②号test方法
		if (name != null) {

			System.out.println("子类重写父类的方法,其name字符串长度:" + name.length());
		} else {
			System.out.println("子类重写父类的方法,其name字符串长度:" + 0);
		}
	}

	public static void main(String[] args) {
		Sub sub = new Sub();

	}

}
