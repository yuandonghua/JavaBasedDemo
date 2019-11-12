package fit.hrkj.random;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * <br>
 * 2019年5月27日 上午10:29:44
 * 
 * @author 华软科技
 * @version 1.0
 */
public class SeedTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long time1=System.currentTimeMillis();
		Random random1 = new Random(time1);
		System.out.println("time1: "+time1);
		System.out.println("random1.nextInt(): "+random1.nextInt());
		
		
		
		Random r1 = new Random(50);
		System.out.println("第一个种子为50的Random对象");
		System.out.println("r1.nextInt(): " + r1.nextInt());
		System.out.println("r1.nextBoolean(): " + r1.nextBoolean());
		System.out.println("r1.nextDouble(): " + r1.nextDouble());
		System.out.println("r1.nextGaussian(): " + r1.nextGaussian());
		System.out.println("---------------------------------------");
		Random r2 = new Random(50);
		System.out.println("第二个种子为50的Random对象");
		System.out.println("r2.nextBoolean(): " + r2.nextBoolean());
		System.out.println("r2.nextInt(): " + r2.nextInt());
		System.out.println("r2.nextDouble(): " + r2.nextDouble());
		System.out.println("r2.nextGaussian(): " + r2.nextGaussian());
		System.out.println("---------------------------------------");
		Random r3 = new Random(100);
		System.out.println("种子为100的Random对象");
		System.out.println("r3.nextBoolean(): " + r3.nextBoolean());
		System.out.println("r3.nextInt(): " + r3.nextInt());
		System.out.println("r3.nextDouble(): " + r3.nextDouble());
		System.out.println("r3.nextGaussian(): " + r3.nextGaussian());
		
		
		ThreadLocalRandom tlRandom=ThreadLocalRandom.current();
		//生成一个4~20之间的伪随机整数
		System.out.println("tlRandom.nextInt(): "+tlRandom.nextInt());
		//生成一个2.0~10.0之间的伪随机浮点数
		System.out.println("tlRandom.nextDouble(2.0,10.0): "+tlRandom.nextDouble(2.0,10.0));
		
		
		long time2=System.currentTimeMillis();
		Random random2 = new Random(time2);
		System.out.println("time2: "+time2);
		System.out.println("random2.nextInt(): "+random2.nextInt());
		
		
		
	}

}
