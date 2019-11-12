package fit.hrkj.innerclass;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Inner in1 = new Outer().new Inner();

		Outer outer = new Outer();
		
		Outer.Inner in2 =outer.new Inner();
		Outer.Inner in3 =outer.new Inner();
		Outer.Inner in4 =outer.new Inner();

	}

}
