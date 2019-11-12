package fit.hrkj.language;

import java.util.ListResourceBundle;

/**
 * <br>
 * 2019年6月9日 下午8:25:21
 * 
 * @author 华软科技
 * @version 1.0
 */
public class myMess_zh_CN extends ListResourceBundle {
	// 定义资源
	private final Object[][] myData = { { "msg", "你好,{0}!今天是{1}." } };

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.ListResourceBundle#getContents()
	 */
	@Override
	protected Object[][] getContents() {
		// TODO Auto-generated method stub
		return myData;
	}

}
