package fit.hrkj.date;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.util.Arrays;
import java.util.Calendar;


/**
 * 处理时间的工具类<br>  
 * 2019年6月10日 上午9:31:13
 * @author 华软科技  
 * @version 1.0 
 */
public class TimeTool {
	/**
	 * 无效的日期标识
	 */
	public static final String INVALID_DATE="日期不合法";
	/**
	 * 无效的时间标识
	 */
	public static final String INVALID_TIME="时间不合法";
	/**
	 * 今天的标识
	 */
	private static final String TODAY="今天";
	/**
	 * 明天的标识
	 */
	private static final String TOMORROW="明天";
	/**
	 * 昨天的标识
	 */
	private static final String YESTERDAY="昨天";
	
	/**
	 * 大月数组
	 */
	private static  int[] BIG_MONTH= {1,3,5,7,8,10,12};
	/**
	 * 小月数组
	 */
	private static int[] SMALL_MONTH= {4,6,9,11};
	
	
	/**
	 * 格式化时间的工具方法
	 * @param time 时间源(没有格式化:2019.9.1 0:0,2019-9-1 12:1,2019/9/1 23:59)
	 * @return 处理后的时间(2019年5月3日 上午8:19;星期三 下午5:20;昨天 上午11:09;上午9:30;明天 上午10:30)
	 */
	public static String timeFormat(String time) {
		if (time==null||time.equals("")||!time.contains(" ")||!time.contains(":")) {
			return INVALID_TIME;
		}else if (time.length()<12||time.length()>16) {
			return INVALID_TIME;
		}else{
			String[] dateTime=time.split(" ");
			String dateResult=dateHandler(dateTime[0]);
			String timeResult=timeHandler(dateTime[1]);
			if (timeResult.equals(INVALID_TIME)) {
				return timeResult;
			}
			if (dateResult.equals(INVALID_DATE)) {
				return dateResult;
			}
			return (dateResult.equals(TODAY)?"":dateResult+" ")+timeResult;
		}
		
	}
	/**
	 * 时间处理器
	 * @param string 要处理的时间字符串
	 * @return 格式化的时间
	 */ 
	private static String timeHandler(String timeString) {
		// TODO Auto-generated method stub
		int[] time=splitTime(timeString);
		if (time==null||time.length!=2) {
			return INVALID_TIME;
		}else {
			//取出小时和分钟
			int h=time[0];
			int m=time[1];
			//是上午还是下午
			String type=null;
			//是:还是:0
			String colon=null;
			if (h>=0&&h<12) {
				type="上午 ";
			}else {
				type="下午 ";
				//如果不是12点减去12变成下午
				h=h!=12?h-12:h;
			}
			//如果分钟小于10补0变成两位
			colon=m<10?":0":":";
			//拼接时间
			return type+h+colon+m;
			
		}
	}
	/**
	 * 分割时间字符串
	 * @param timeString 要分割的时间字符串
	 * @return 分割好的时间数组
	 */ 
	private static int[] splitTime(String timeString) {
		// TODO Auto-generated method stub
		String[] time=timeString.split(":");
		int h=Integer.valueOf(time[0]);
		int m=Integer.valueOf(time[1]);
		if (h<0||h>=24) {
			return null;
		}else if (m<0||m>59) {
			return null;
		}else {
			return new int[]{h,m};
		}
	}
	/**
	 * 日期处理器
	 * @param date 要处理的日期字符串
	 * @return 格式化的日期
	 */ 
	private static String dateHandler(String dateString) {
		// TODO Auto-generated method stub
		//把日期字符串分割成数组
		String[] date=splitDate(dateString);
		String resultString=null;
		if (date==null||date.length!=3) {
			resultString=INVALID_DATE;
		}else {
			//获取输入时间的年月日
			int year=Integer.valueOf(date[0]);
			int month=Integer.valueOf(date[1]);
			int day=Integer.valueOf(date[2]);
			//获取当前时间的年月日
			int currentMonth=MonthDay.now().getMonth().getValue();
			int currentDay=MonthDay.now().getDayOfMonth();
			int currentYear=Year.now().getValue();
			
			if (year==currentYear) {
				//同一年
				if (month==currentMonth) {
					//同一月
					resultString=dayToNear(year,month,day,currentDay);
				}else if (month-currentMonth==1) {
					//下个月
					resultString=dayOfNextMonth(year,month,day,currentYear,currentMonth,currentDay);
				}else if (month-currentMonth==-1) {
					//上个月
					resultString=dayOfLastMonth(year,month,day,currentYear,currentMonth,currentDay);
				}else{
					//不在同一月
					resultString=month+"月"+day+"日";
				}
			}else {
				//不同年
				resultString=year+"年"+month+"月"+day+"日";
			}
		}
		return resultString;
	}
	/**
	 * 把日期字符串分割成数组
	 * @param dateString 日期字符串
	 * @return 返回合法日期数组
	 */ 
	private static String[] splitDate(String dateString) {
		// TODO Auto-generated method stub
		if (dateString.length()<8||dateString.length()>10) {
			return null;
		}else if (dateString.contains(".")) {
			return dateString.split("\\.");
		}else if (dateString.contains("-")) {
			return dateString.split("-");
		}else if (dateString.contains("/")) {
			return dateString.split("/");
		}else {
			return  null;
		}
	}
	/**
	 * 把上个月的日转化成昨天和星期
	 * @param year
	 * @param month
	 * @param day
	 * @param currentYear
	 * @param currentMonth
	 * @param currentDay
	 * @return 
	 */ 
	private static String dayOfLastMonth(int year, int month, int day, int currentYear, int currentMonth,
			int currentDay) {
		// TODO Auto-generated method stub
		String resultString=null;
		if (currentDay>=7) {
			resultString=month+"月"+day+"日";
		}else if (Arrays.binarySearch(BIG_MONTH, month)>=0&&31-day+currentDay<7) {
			//把年月日转化成星期,大月
			resultString=dayToWeek(year,month,day);
		}else if (Arrays.binarySearch(SMALL_MONTH, month)>=0&&30-day+currentDay<7) {
			//把年月日转化成星期,小月
			resultString=dayToWeek(year,month,day);
		}else if (month==2) {
			//二月
			
			if (currentYear%400==0||currentYear%4==0) {
				//闰年
				if (29-day+currentDay<7) {
					//把年月日转化成星期,二月
					resultString=dayToWeek(year,month,day);
				}else {
					resultString=month+"月"+day+"日";
				}
			}else {
				//平年
				if (28-day+currentDay<7) {
					//把年月日转化成星期,二月
					resultString=dayToWeek(year,month,day);
				}else {
					resultString=month+"月"+day+"日";
				}
			}
		}else {
				resultString=month+"月"+day+"日";
			}
		return resultString;
	}
	/**
	 * 下个月的日转化成明天
	 * @param year
	 * @param month
	 * @param day
	 * @param currentDay
	 * @return 
	 */ 
	private static String dayOfNextMonth(int year, int month, int day,int currentYear,int currentMonth, int currentDay) {
		// TODO Auto-generated method stub
		String resultString=null;
		if (day==1) {
			
			if (Arrays.binarySearch(BIG_MONTH, currentMonth)>=0&&currentDay==31) {
				//明天
				resultString=TOMORROW;
			}else if (Arrays.binarySearch(SMALL_MONTH, currentMonth)>=0&&currentDay==30) {
				//明天
				resultString=TOMORROW;
			}else if (currentMonth==2) {
				if (currentYear%400==0||currentYear%4==0) {
					if (currentDay==29) {
						//明天
						resultString=TOMORROW;
					}else {
						resultString=month+"月"+day+"日";
					}
				}else {
					if (currentDay==28) {
						//明天
						resultString=TOMORROW;
					}else {
						resultString=month+"月"+day+"日";
					}
				}
			}else {
					resultString=month+"月"+day+"日";
				}
		}else {
			resultString=month+"月"+day+"日";
		}
		return resultString;
	}
	/**
	 * 把日转化成今天,明天,昨天
	 * @param year
	 * @param month
	 * @param day
	 * @param currentDay
	 * @return 
	 */ 
	private static String dayToNear(int year, int month, int day,int currentDay) {
		// TODO Auto-generated method stub
		String resultString=null;
		if (day==currentDay) {
			//同一天
			resultString=TODAY;
		}else if (day-currentDay==1) {
			//明天
			resultString=TOMORROW;
		}else if (day-currentDay==-1) {
			//昨天
			resultString=YESTERDAY;
		}else if (-7<=day-currentDay&&day-currentDay<=-2) {
			//上一周
			resultString=dayToWeek(year,month,day);
		}else {
			resultString=month+"月"+day+"日";
		}
		return resultString;
	}
	/**
	 * 把上一周的年月日转化成星期
	 * @param year
	 * @param month
	 * @param day 
	 */ 
	private static String dayToWeek(int year, int month, int day) {
		// TODO Auto-generated method stub
		String resultString=null;
		if (DayOfWeek.MONDAY==LocalDate.of(year, month, day).getDayOfWeek()) {
			resultString="星期一";
		}else if (DayOfWeek.TUESDAY==LocalDate.of(year, month, day).getDayOfWeek()) {
			resultString="星期二";
		}else if (DayOfWeek.WEDNESDAY==LocalDate.of(year, month, day).getDayOfWeek()) {
			resultString="星期三";
		}else if (DayOfWeek.THURSDAY==LocalDate.of(year, month, day).getDayOfWeek()) {
			resultString="星期四";
		}else if (DayOfWeek.FRIDAY==LocalDate.of(year, month, day).getDayOfWeek()) {
			resultString="星期五";
		}else if (DayOfWeek.SATURDAY==LocalDate.of(year, month, day).getDayOfWeek()) {
			resultString="星期六";
		}else if (DayOfWeek.SUNDAY==LocalDate.of(year, month, day).getDayOfWeek()) {
			resultString="星期日";
		}
		return resultString;	
	}
}
