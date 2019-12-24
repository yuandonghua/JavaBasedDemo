package fit.hrkj.designpattern.decorator;

/**
 * 用来修饰的成绩单抽象类<br>
 * 2019年12月24日下午12:08:35
 * 
 * @author 华软科技
 * @version 1.0
 */
public abstract class Decorator extends SchoolReport {
	/**
	 * 修饰的哪个成绩单
	 */
	private SchoolReport sr;

	/**
	 * @param sr
	 */
	public Decorator(SchoolReport sr) {
		super();
		this.sr = sr;
	}

	/**
	 * 成绩单还是要被看到的
	 */
	@Override
	public void report() {
		// TODO Auto-generated method stub
		sr.report();
	}

	/**
	 * 看完还是要签名的
	 */
	@Override
	public void sign(String name) {
		// TODO Auto-generated method stub
		sr.sign(name);
	}

}
