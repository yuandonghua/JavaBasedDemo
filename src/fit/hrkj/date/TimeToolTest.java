package fit.hrkj.date;

import java.util.Calendar;
import java.util.Scanner;
import static java.util.Calendar.*;

/**
 * 	练习题
 * @author zk
 * 2019年5月31日下午7:12:20
 * Practice2.java-Practice2
 */
public class TimeToolTest {
	public static void main(String[] args) {
		//获取扫描器
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要格式化的时间:");
		while (sc.hasNextLine()) {
			//获取输入的内容
			String timeString=sc.nextLine();
			if (timeString.equals("exit")||timeString.equals("退出")) {
				break;
			}
			//用工具类处理时间
			String timeResultString=TimeTool.timeFormat(timeString);
			if (timeResultString.equals(TimeTool.INVALID_DATE)||timeResultString.equals(TimeTool.INVALID_TIME)) {
				
				System.out.println(timeResultString+",请重新输入:");
				continue;
			}
			System.out.println("时间结果:"+timeResultString);
		}
		System.out.println("程序结束,欢迎下次使用");
		
	}
}

