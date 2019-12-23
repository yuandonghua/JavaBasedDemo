package fit.hrkj.designpattern.abstractfactory;

/**
 * 生产男性的八卦炉<br>
 * 2019年12月22日下午1:25:10
 * 
 * @author 华软科技
 * @version 1.0
 */
public class MaleFactory implements HumanFactory {
	/**
	 * 生产出黄人男性
	 */
	@Override
	public Human createYellowHuman() {
		// TODO Auto-generated method stub
		return new MaleYellowHuman();
	}

	/**
	 * 生产出白人男性
	 */
	@Override
	public Human createWhiteHuman() {
		// TODO Auto-generated method stub
		return new MaleWhiteHuman();
	}

	/**
	 * 生产出黑人男性
	 */
	@Override
	public Human createBlackHuman() {
		// TODO Auto-generated method stub
		return new MaleBlackHuman();
	}

}
