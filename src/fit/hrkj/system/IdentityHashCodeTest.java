package fit.hrkj.system;

/**<br>  
 * 2019年5月21日 下午8:35:39
 * @author 华软科技  
 * @version 1.0 
 */
public class IdentityHashCodeTest {

	/**
	 * @param args 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//下面程序中s1和s2是两个不同的对象
		String s1=new String("Hello");
		String s2=new String("Hello");
		//String重写了hashCode方法,改为根据字符序列计算hashCode值
		//因为s1和s2的字符序列相同,所以它们的hashCode方法返回值相同
		System.out.println("s1.hashCode:"+s1.hashCode());
		System.out.println("s2.hashCode:"+s2.hashCode());
		//s1和s2是不同的字符串对象,所以它们的identityHashCode值不同
		System.out.println("s1的identityHashCode:"+System.identityHashCode(s1));
		System.out.println("s2的identityHashCode:"+System.identityHashCode(s2));
		String s3="java";
		String s4="java";
		//s3和s4是相同的字符串对象,所以它们的identityHashCode值相同
		System.out.println("s3的identityHashCode:"+System.identityHashCode(s3));
		System.out.println("s4的identityHashCode:"+System.identityHashCode(s4));
	}

}
