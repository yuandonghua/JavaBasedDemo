package fit.hrkj.object;
/**
 * 演示人类、手机类<br>  
 * 2019年12月13日下午8:02:54
 * @author 华软科技
 * @version 1.0
 */
public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person.eat();
		
		
		
		Person zhangXiang=new Person("张象");
		
		Phone mate=new Phone();
		mate.setName("华为mate30 pro");
		mate.setPrice(6888);
		mate.setColor("紫色");
		mate.color="";
		
		Person.breathe="氮气";
		
		zhangXiang.breathe="氧气";
		Person liuJiuZhou=new Person("刘九洲");
		String name=liuJiuZhou.setName("刘九洲").setStatus("忙").getName();
		
		zhangXiang.usePhoneCallPerson(mate, liuJiuZhou);
		
		
		
	}

}
