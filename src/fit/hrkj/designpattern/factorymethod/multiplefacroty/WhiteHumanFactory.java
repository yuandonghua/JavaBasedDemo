package fit.hrkj.designpattern.factorymethod.multiplefacroty;

import fit.hrkj.designpattern.factorymethod.nvwazaoren.BlackHuman;
import fit.hrkj.designpattern.factorymethod.nvwazaoren.Human;

/**
 * 黑种人的创建工厂<br>
 * 2019年12月11日下午5:29:17
 * 
 * @author 华软科技
 * @version 1.0
 */
public class WhiteHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createHuman() {
		// TODO Auto-generated method stub
		return new BlackHuman();
	}

}
