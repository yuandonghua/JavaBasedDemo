/**
 * 
 */
package fit.hrkj.gc;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/**
 * <br>
 * 2019年5月6日 下午2:39:27
 * 
 * @author 华软科技
 * @version 1.0
 */
public class PhantomReferenceTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 创建一个字符串对象
        String str = new String("java基础");
        // 创建一个引用队列
        ReferenceQueue rq = new ReferenceQueue();
        // 创建一个虚引用,让此虚引用引用到"java基础"字符串
        PhantomReference pr = new PhantomReference(str, rq);
        // 切断str引用和"java基础"字符串之间的引用
        str = null;
        if (rq.poll()==null) {
			System.out.println("为空");
		}else {
			System.out.println("不为空");
			
		}
        System.out.println(rq.poll() == pr);

        // 取出虚引用所引用的对象,并不能通过虚引用获取被引用的对象,所以此处输出null
        System.out.println(pr.get());// ①
        // 强制垃圾回收
        System.gc();
        System.runFinalization();
        // 垃圾回收之后,虚引用将被放入引用队列中
        // 取出引用队列中最先进入队列的引用与pr进行比较
        System.out.println(rq.poll() == pr);//②true
        System.out.println(rq.poll() == pr);//rq.poll()=null false

    }

}
