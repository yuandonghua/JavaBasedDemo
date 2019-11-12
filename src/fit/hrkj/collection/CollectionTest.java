package fit.hrkj.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


/**<br>  
 * 2019年6月17日 下午8:13:14
 * @author 华软科技  
 * @version 1.0 
 */
public class CollectionTest {

	/**
	 * @param args 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		//添加元素
		//虽然集合里不能放基本类型的值,但java支持自动装箱
		list.add(10);
		list.add("朱四伟");
		System.out.println("list集合的元素个数为:"+list.size());
		//删除指定元素
		list.remove(Integer.valueOf(10));
//		list.remove("朱四伟");
//		System.out.println("list集合的元素个数为:"+list.size());
//		list.add("王中原");
//		list.add("朱四伟");
//		System.out.println("判断是否包含字符串:"+list.contains("王中原"));
//		System.out.println("list集合的元素:"+list);
//		HashSet set=new HashSet();
//		set.add("朱四伟");
//		set.add("王中原");
//		System.out.println("set集合的元素:"+set);
//		System.out.println("list集合是否完全包含set集合:"+list.containsAll(set));
//		//用list集合减去set集合里的元素
//		list.removeAll(set);
//		System.out.println("list集合的元素:"+list);
//		set.clear();
//		System.out.println("set集合的元素:"+set);
//		
//		list.add("王中原");
//		list.add("朱四伟");
//		list.add("贾洪真");
//		set.add("朱四伟");
//		set.add("王中原");
//		set.add("刘二朋");
//		set.retainAll(list);
//		System.out.println("set集合的元素:"+set);
//		System.out.println("list集合的元素:"+list);
//		
//		
//		List<String> strList=List.of("java", "h5","android");
//		//toArray()方法参数是一个Lambda表达式,代表IntFunction对象
//		//此时toArray()方法的返回值类型是String[],而不是Object[]
//		String[] strs=strList.toArray(String[]::new);
//		System.out.println(Arrays.toString(strs));
		
	}

}
