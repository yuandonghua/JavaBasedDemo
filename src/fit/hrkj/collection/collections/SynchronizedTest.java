package fit.hrkj.collection.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * <br>
 * 2019年7月28日 下午2:50:38
 * 
 * @author 华软科技
 * @version 1.0
 */
public class SynchronizedTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c1 = Collections.synchronizedCollection(new ArrayList());
		List c2 = Collections.synchronizedList(new ArrayList());
		Set c3 = Collections.synchronizedSet(new HashSet());
		Map c4 = Collections.synchronizedMap(new HashMap());
	}

}
