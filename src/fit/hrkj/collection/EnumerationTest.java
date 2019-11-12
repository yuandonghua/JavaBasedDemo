package fit.hrkj.collection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/**
 * <br>
 * 2019年7月31日 上午11:30:09
 * 
 * @author 华软科技
 * @version 1.0
 */
public class EnumerationTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vector = new Vector();
		vector.add("java");
		vector.add("h5");
		Hashtable hashtable = new Hashtable();
		hashtable.put("理论", 10);
		hashtable.put("上机", 10);

		Enumeration em = vector.elements();

		while (em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}

		Enumeration em2 = hashtable.keys();
		while (em2.hasMoreElements()) {
			Object key = (Object) em2.nextElement();
			System.out.println(key + ":" + hashtable.get(key));

		}

	}

}
