package fit.hrkj.random;

import java.util.Random;

public class RandomStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//参与抽奖的人员
		String[] students = { "张林琛", "王晨", "袁超华", "王中原", "朱彩凤", "王留闯" };
		//求出抽到的学生的索引位置
		int index = (int) (Math.random() * students.length);
		//打印抽到的学生
		System.out.println("抽到学生的索引：" + students[index]);

	}

}


