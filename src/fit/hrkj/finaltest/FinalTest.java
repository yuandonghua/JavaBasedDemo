package fit.hrkj.finaltest;

public class FinalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalTest ft=new FinalTest();
	}

	final int a;
	{
//		System.out.println("a:"+a);
		a=1;
		getA();
		
	}
	public FinalTest() {
		getA();
		
	}
	private void getA() {
		System.out.println("a:" + a);
		
		new Double(0);
		
		new String("hello");
		
		
	}

}
