package fit.hrkj.designpattern.abstractfactory;

/**
 * 生产女性的八卦炉<br>
 * 2019年12月22日下午1:25:10
 * 
 * @author 华软科技
 * @version 1.0
 */
public class FemaleFactory implements HumanFactory {
	/**
	 * 生产出黄人女性
	 */
	@Override
	public Human createYellowHuman() {
		// TODO Auto-generated method stub
		return new FemaleYellowHuman();
	}

	/**
	 * 生产出白人女性
	 */
	@Override
	public Human createWhiteHuman() {
		// TODO Auto-generated method stub
		return new FemaleWhiteHuman();
	}

	/**
	 * 生产出黑人女性
	 */
	@Override
	public Human createBlackHuman() {
		// TODO Auto-generated method stub
		return new FemaleBlackHuman();
	}

}
