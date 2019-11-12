package fit.hrkj.string;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.util.SortedMap;

/**
 * <br>
 * 2019年5月25日 上午11:38:04
 * 
 * @author 华软科技
 * @version 1.0
 */
public class StringTest {

	/**
	 * @param args
	 * @throws UnsupportedEncodingException 
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
//		char[] s6 = { 'j', 'a', 'v', 'a', 'h', '5', 'a', 'n', 'd', 'r', 'o', 'i', 'd' };
//		String s7 = "abc";
//		s7.getChars(0, 3, s6, 7);
//		System.out.println(s6);
//
//		System.out.println(s7.indexOf('b'));
//		
//		String sa="www.hrkj.fit";
//		String ss="hrkj";
//		System.out.println("sa.indexOf('w'): "+sa.indexOf('w'));
//		System.out.println("sa.indexOf('w',2): "+sa.indexOf('w',2));
//		System.out.println("sa.indexOf(ss): "+sa.indexOf(ss));
//		
//		String a1="www.hrkj.fit";
//		String a2="www";
//		String a3="hrkj";
//		
//		System.out.println("a1.startsWith(a2): "+a1.startsWith(a2));
//		System.out.println("a1.startsWith(a3,4): "+a1.startsWith(a3,4));
//		
//		String a4="www.hrkj.fit";
//		String a5="WWW.HRKJ.FIT";
//		System.out.println("a4.toUpperCase(): "+a4.toUpperCase());
//		System.out.println("a4.toLowerCase(): "+a5.toLowerCase());
//		
//		String a6="java";
//		System.out.println("a6.length(): "+a6.length());
//		a6=a6+"h5";
//		System.out.println("a6.length(): "+a6.length());
//		a6=a6+"android";
//		System.out.println("a6.length(): "+a6.length());
		// 获取Java支持的全部字符集
		SortedMap<String,Charset> map=Charset.availableCharsets();
		for (String alias : map.keySet())
		{
			// 输出字符集的别名
			System.out.println(alias);
		}
		//Charset.defaultCharset()是默认的字符集
		String s1=new String(new byte[] {65,66,67,68,69,70},Charset.forName("UTF-8"));
		System.out.println(s1);
	}

}
