package fit.hrkj.designpattern.decorator;

/**
 * 四年级成绩单<br>
 * 2019年12月24日上午10:06:18
 * 
 * @author 华软科技
 * @version 1.0
 */
public class FouthGradeSchoolReport extends SchoolReport {

	@Override
	public void report() {
		// TODO Auto-generated method stub
		System.out.println("尊敬的XXX家长：");
		System.out.println("\t......");
		System.out.println("\t语文：63");
		System.out.println("\t数学：60");
		System.out.println("\t英语：62");
		System.out.println("\t......");
		System.out.println("\t\t家长签名：\t");
	}

	@Override
	public void sign(String name) {
		// TODO Auto-generated method stub
		System.out.println("家长签名为：" + name);
	}

}
