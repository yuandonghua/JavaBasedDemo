package fit.hrkj.object;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c1=Computer.getInstance("外星人",80000);
		Computer c2=Computer.getInstance("imac",180000);
		
		System.out.println(c1.getName());
		System.out.println(c1.getPrice());
		System.out.println(c2.getName());
		System.out.println(c2.getPrice());
	}

}
