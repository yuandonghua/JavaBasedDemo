package fit.hrkj.string;

/**
 * <br>
 * 2019年5月26日 下午6:56:29
 * 
 * @author 华软科技
 * @version 1.0
 */
public class StringBuilderTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		// 追加字符串
		sb.append("java");
		System.out.println("sb: " + sb);
		// 插入
		sb.insert(0, "hello ");
		System.out.println("sb: " + sb);
		// 替换
		sb.replace(5, 6, ",");
		System.out.println("sb: " + sb);
		// 删除
		sb.delete(5, 6);
		System.out.println("sb: " + sb);
		// 反转
		sb.reverse();
		System.out.println("sb: " + sb);

		System.out.println("sb.length(): " + sb.length());
		System.out.println("sb.capacity(): " + sb.capacity());
		// 改变StringBuilder的长度,将只保留前面部分
		sb.setLength(5);
		System.out.println("sb: " + sb);
	}

}
