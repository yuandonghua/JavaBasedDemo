package fit.hrkj.designpattern.decorator.commonpattern;

/**
 * 抽象装饰器<br>
 * 2019年12月24日下午2:42:25
 * 
 * @author 华软科技
 * @version 1.0
 */
public abstract class Decorator extends Component {
	private Component component;

	/**
	 * 构造器，接收构件
	 * 
	 * @param component 核心构件
	 */
	public Decorator(Component component) {
		super();
		// TODO Auto-generated constructor stub
		this.component = component;
	}

	/**
	 * 委托被修饰者执行
	 */
	@Override
	public void operate() {
		// TODO Auto-generated method stub
		component.operate();
	}

}
