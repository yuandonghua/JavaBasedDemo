package fit.hrkj.object;

import java.util.Properties;

public class Person {
	// �˵�����
	public String name;
	// �˵�״̬
	public String status;
	// �˺�������
	public static String breathe = "����";

	public Person(String name) {
		setName(name);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Person setName(String name) {
		this.name = name;

		return this;
	}

	/**
	 * �����˵�״̬
	 * 
	 * @param s æ,��
	 */
	public Person setStatus(String s) {
		status = s;

		return this;
	}

	/**
	 * �ӵ绰
	 * 
	 * @param status �ӵ绰��״̬
	 * @return �Ƿ�ӵ绰
	 */
	public boolean answerPhoe() {
		if (this.status.equals("æ")) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * ʹ���ֻ���ĳĳ��绰
	 * 
	 * @param phone   ����ֻ�
	 * @param persion ��˭��绰
	 */
	public void usePhoneCallPerson(Phone phone, Person person) {
		phone.call(this, person);
	}

	public static void eat() {
		System.out.println("��Է�");
	}

}
