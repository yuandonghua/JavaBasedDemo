package fit.hrkj.object;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person.eat();
		
		
		
		Person zhangXiang=new Person("����");
		
		Phone mate=new Phone();
		mate.setName("��Ϊmate30 pro");
		mate.setPrice(6888);
		mate.setColor("��ɫ");
		mate.color="";
		
		Person.breathe="����";
		
		zhangXiang.breathe="����";
		Person liuJiuZhou=new Person("������");
		String name=liuJiuZhou.setName("������").setStatus("æ").getName();
		
		zhangXiang.usePhoneCallPerson(mate, liuJiuZhou);
		
		
		
	}

}
