package fit.hrkj.regex;

/**
 * 演示正则表达式<br>
 * 2019年12月10日上午9:40:50
 * 
 * @author 华软科技
 * @version 1.0
 */
public class Regex2Test {
	/**
	 * 程序入口
	 * 
	 * @param args 入口参数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "正则表达式";
		 boolean matches = str.matches("[\\u4E00-\\u9FA5][\\u4E00-\\u9FA5][\\u4E00-\\u9FA5][\\u4E00-\\u9FA5][\\u4E00-\\u9FA5]");
		System.out.println(matches);
		

	}

}
