package fit.hrkj.object;

public class Phone {
	// ??������?1/4???
	public int price;
	// ??������???��?
	public String name;
	// ??������????��
	public   String color;
	// ??����3?��???
	public  String usb ;

	/**
	 * ????����?��???��????��?
	 * 
	 * @param name ??����??��?
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * ?��????������?1/4???
	 * 
	 * @param p 1/4???
	 */
	public void setPrice(int p) {
		price = p;
	}

	public void setColor(String c) {
		color = c;
	}

	/**
	 * ???ae???��
	 * 
	 * @param gameName ???����???��?
	 */
	public void playGame(String gameName) {
		if (gameName.equals("??????????")) {
			System.out.println("2��?2��????????��:" + gameName);
		} else if (gameName.equals("??1/4��?1/23?")) {
			System.out.println("?2��?3?1/4|:" + gameName);
		} else {
			System.out.println("2��?��?��?2��?:" + gameName);
		}

	}

	/**
	 * ???3?3?����?����
	 * 
	 * @param p ?3?3
	 */
	public void call(Person p1, Person p2) {

		if (p2.answerPhoe()) {
			System.out.println(p1.getName() + "??" + p2.getName() + "?����?����,?��?��??");
		} else {
			System.out.println(p1.getName() + "??" + p2.getName() + "?����?����,?��???��?��");

		}

	}
	
}
