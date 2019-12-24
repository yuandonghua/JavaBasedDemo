package fit.hrkj.designpattern.decorator;

/**
 * 排名情况修饰器<br>
 * 2019年12月24日下午2:20:15
 * 
 * @author 华软科技
 * @version 1.0
 */
public class SortDecorator extends Decorator {

	/**
	 * @param sr
	 */
	public SortDecorator(SchoolReport sr) {
		super(sr);
		// TODO Auto-generated constructor stub
	}

	private void reportSort() {
		System.out.println("我排在38名");
	}

	@Override
	public void report() {
		// TODO Auto-generated method stub
		// 先汇报成绩排名
		reportSort();
		// 再汇报成绩单
		super.report();
	}
}
