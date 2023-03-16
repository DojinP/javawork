package api.util;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

// TimeZone과 Locale에 대한 내용
public class TimeZoneTest {
	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar();
		getInfo(cal);
		
		// TimeZone의 id값 추출하기
		String[] idInfo = TimeZone.getAvailableIDs();
		for (String data : idInfo) {
			System.out.println(data);
		}
		
		// TimeZone 은 전세계별로 각 지역의 시간을 구해야하는 경우 사용(현지 시간을 알아낼 수 있다.)
		TimeZone timezone = TimeZone.getTimeZone("America/Los_Angeles");
		// Calendar cal2 = new GregorianCalendar(timezone);
		Calendar cal2 = Calendar.getInstance(timezone);
		getInfo(cal2);
				
		Calendar cal3 = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));
		getInfo(cal3);
		
	}
	
	public static void getInfo(Calendar cal) {
		System.out.print(cal.get(Calendar.YEAR) + "년 ");
		System.out.print((cal.get(Calendar.MONTH)+1) + "월 ");
		System.out.print(cal.get(Calendar.DATE) + "일 ");
		System.out.print(cal.get(Calendar.HOUR) + "시 ");
		System.out.print(cal.get(Calendar.MINUTE) + "분 ");
		System.out.println(cal.get(Calendar.SECOND) + "초");
	}
}
