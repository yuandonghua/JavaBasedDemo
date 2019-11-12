package fit.hrkj.enums;

/**
 * <br>
 * 2019年7月8日 上午9:29:55
 * 
 * @author 华软科技
 * @version 1.0
 */
public class SeasonEnumTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (SeasonEnum season : SeasonEnum.values()) {
			System.out.println(season);
		}
		test(SeasonEnum.SPRING);

	}

	public static void test(SeasonEnum seasonEnum) {
		switch (seasonEnum) {
		case SPRING:
			System.out.println("春天放风筝");

		case SUMMER:
			System.out.println("夏天洗澡");

		case FALL:
			System.out.println("秋天收玉米");

		case WINTER:
			System.out.println("过年");

		default:
			System.out.println("默认执行吗？");
			break;
		}
	}

}
