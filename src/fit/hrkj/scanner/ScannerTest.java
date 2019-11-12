package fit.hrkj.scanner;

import java.util.Scanner;

/**<br>  
 * 2019年5月22日 下午2:42:15
 * @author 华软科技  
 * @version 1.0 
 */
public class ScannerTest {

	/**
	 * @param args 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner	 s = new Scanner(System.in);
		System.out.println("请输入邮箱:");
		
		s.useDelimiter("\n");
		
		while (s.hasNext()) {
			String str=s.next();
			if (str==null||str.equals("")) {
				System.out.println("账号不能为空");
			}else if (!str.endsWith("@hrkj.fit")) {
				System.out.println("账号只能是邮箱");
			}else if (str.length()<=9) {
				System.out.println("账号的长度最少为10");
			}else if (str.equals("exit")) {
				System.out.println("程序已退出");
				break;
			}else {
				System.out.println("请输入密码:");
				ScannerTest.checkPassword(s);
				break;
			}
			
		}
		
		
		
	}
	
	public static void checkPassword(Scanner s) {
		while (s.hasNext()) {
			String str=s.next();
			if (str==null||str.equals("")) {
				System.out.println("密码不能为空");
			}else if (str.length()<8||str.length()>16) {
				System.out.println("密码长度不对");
			}else {
				System.out.println("登陆成功");
				break;
			}
			
		}
	}

}
