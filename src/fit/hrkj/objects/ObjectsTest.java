package fit.hrkj.objects;

import java.util.Objects;

/**<br>  
 * 2019年5月23日 下午7:41:38
 * @author 华软科技  
 * @version 1.0 
 */
public class ObjectsTest {
	//定义一个obj变量,它的默认值是null
	static ObjectsTest obj;
	/**
	 * @param args 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//输出一个null对象的hashCode值,输出0
		System.out.println(Objects.hashCode(obj));
		//输出一个null对象的toString,输出null
		System.out.println(Objects.toString(obj));
		//要求obj不能为null,如果obj为null则引发异常
		System.out.println(Objects.requireNonNull(obj));
	}

}
