package fit.hrkj.object;

public class Computer {
	private static Computer instance;
	private String name;
	private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	private Computer() {
		
	}
	
	private Computer(String name,int price) {
		setName(name);
		setPrice(price);
	}
	public static Computer getInstance() {
		// TODO Auto-generated method stub
		if(instance==null) {
			instance=new Computer();
		}
		return instance;
	}
	public static Computer getInstance(String name,int price) {
		// TODO Auto-generated method stub
		if(instance==null) {
			instance=new Computer();
		}
		instance.setName(name);
		instance.setPrice(price);
		return instance;
	}
}
