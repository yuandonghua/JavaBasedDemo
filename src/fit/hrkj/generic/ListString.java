package fit.hrkj.generic;

import java.util.Iterator;
import java.util.List;

/**
 * List<String>等同于如下接口 <br>
 * 2019年8月4日 下午5:21:19
 * 
 * @author 华软科技
 * @version 1.0
 */
public interface ListString extends List {
	// 原来的E形参全部变成String类型实参
	Iterator<String> iterator();
	boolean add(String e);

}
