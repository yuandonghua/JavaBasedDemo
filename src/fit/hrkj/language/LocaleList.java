package fit.hrkj.language;

import java.util.Locale;

/**
 * <br>
 * 2019年6月2日 下午7:42:00
 * 
 * @author 华软科技
 * @version 1.0
 */
public class LocaleList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 返回java所支持的全部国家和语言的数组
		Locale[] locales = Locale.getAvailableLocales();
		// 遍历数组的每个元素,依次获取所支持的国家和语言
		for (int i = 0; i < locales.length; i++) {
			Locale locale = locales[i];
			// 输出所支持的国家和语言
			System.out.println("国家:" + locale.getDisplayCountry() + "=" + locale.getCountry() + "    语言:  "
					+ locale.getDisplayLanguage() + "=" + locale.getLanguage());
		}
	}

}
