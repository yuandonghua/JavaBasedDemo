package fit.hrkj.date;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;

/**
 * <br>
 * 2019年5月28日 下午7:59:52
 * 
 * @author 华软科技
 * @version 1.0
 */
public class NewDatePackageTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ----------下面是关于Clock的用法----------
		// 获取当前Clock
		Clock clock = Clock.systemUTC();
		// 通过Clock获取当前时刻
		System.out.println("当前时刻为: " + clock.instant());
		// 获取clock对应的毫秒数,与System.currentTimeMillis()输出相同
		System.out.println(clock.millis());
		System.out.println(System.currentTimeMillis());
		// ----------下面是关于Duration的用法----------
		Duration d = Duration.ofSeconds(6000);
		System.out.println("6000秒相当于" + d.toMinutes() + "分");
		System.out.println("6000秒相当于" + d.toHours() + "小时");
		System.out.println("6000秒相当于" + d.toDays() + "天");
		// 在Clock基础上增加6000秒,返回新的Clock
		Clock clock2 = Clock.offset(clock, d);
		// 可以看到clock2与clock相差1小时40分
		System.out.println("当前时刻加6000秒为: " + clock2.instant());
		// ----------下面关于Instant的用法----------
		// 获取当前时间
		Instant instant = Instant.now();
		System.out.println(instant);
		// instant添加6000秒,返回新的Instant
		Instant instant2 = instant.plusSeconds(6000);
		System.out.println(instant2);
		// 根据字符串解析Instant对象
		Instant instant3 = Instant.parse("2019-05-28T20:11:40.512Z");
		System.out.println(instant3);
		// 在instant3的基础上添加5小时4分钟
		Instant instant4 = instant3.plus(Duration.ofHours(5).plusMinutes(4));
		System.out.println(instant4);
		// 获取instant4的5天以前的时刻
		Instant instant5 = instant4.minus(Duration.ofDays(5));
		System.out.println(instant5);
		// ----------下面是关于LocalDate的用法----------
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		// 获得2011年的第208天
		localDate = LocalDate.ofYearDay(2011, 315);
		System.out.println(localDate);
		// 设置为2019年1月1日
		localDate = LocalDate.of(2019, 1, 1);
		System.out.println(localDate);
		// ----------下面是关于LocalTime的用法----------
		// 获取当前时间
		LocalTime localTime = LocalTime.now();
		// 设置为20点20分
		localTime = LocalTime.of(20, 20);
		System.out.println(localTime);
		// 返回一天中的第6000秒
		localTime = LocalTime.ofSecondOfDay(6000);
		System.out.println(localTime);
		// ----------下面是关于LocalDateTime的用法----------
		// 获取当前日期,时间
		LocalDateTime localDateTime = LocalDateTime.now();
		// 当前日期时间加上10小时10分钟
		LocalDateTime localDateTime2 = localDateTime.plusHours(10).plusMinutes(10);
		System.out.println(localDateTime2);
		// ----------下面是关于Year,YearMonth,MonthDay的用法示例----------
		// 获取当前年份
		Year year = Year.now();
		System.out.println(year);
		// 当前年份加5年
		year = year.plusYears(5);
		System.out.println(year);
		// 根据指定月份获取YearMonth
		YearMonth yearMonth = year.atMonth(10);
		System.out.println(yearMonth);
		// 当前年月再加5年,减3个月
		yearMonth = yearMonth.plusYears(5).minusMonths(3);
		System.out.println(yearMonth);
		MonthDay monthDay = MonthDay.now();
		System.out.println(monthDay);
		// 设置6月18日
		monthDay = monthDay.with(Month.JUNE).withDayOfMonth(18);
		System.out.println(monthDay);

	}

}
