package fit.hrkj.object;

public class Phone {
	// �ֻ��ļ۸�
	public int price;
	// �ֻ�������
	public String name;
	// �ֻ�����ɫ
	public   String color;
	// �ֻ�����
	public  String usb ;

	/**
	 * ���ֻ�����һ������
	 * 
	 * @param name �ֻ�����
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * �����ֻ��ļ۸�
	 * 
	 * @param p �۸�
	 */
	public void setPrice(int p) {
		price = p;
	}

	public void setColor(String c) {
		color = c;
	}

	/**
	 * ������Ϸ
	 * 
	 * @param gameName ��Ϸ������
	 */
	public void playGame(String gameName) {
		if (gameName.equals("����������")) {
			System.out.println("��ϲ�������Ϸ:" + gameName);
		} else if (gameName.equals("�̼�ս��")) {
			System.out.println("ϲ���Լ�:" + gameName);
		} else {
			System.out.println("��һ��ϲ��:" + gameName);
		}

	}

	/**
	 * ��ĳĳ��绰
	 * 
	 * @param p ĳĳ
	 */
	public void call(Person p1, Person p2) {

		if (p2.answerPhoe()) {
			System.out.println(p1.getName() + "��" + p2.getName() + "��绰,��ͨ��");
		} else {
			System.out.println(p1.getName() + "��" + p2.getName() + "��绰,û�д�ͨ");

		}

	}
	
}
