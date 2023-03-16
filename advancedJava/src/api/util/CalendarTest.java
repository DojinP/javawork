package api.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar();
		Calendar cal2 = Calendar.getInstance();
		
		System.out.println(cal);
		System.out.println(cal2);
		
		Date d = new Date();
		System.out.println(d);
		
		System.out.println("=================Calendar객체의 사용방법=================");
		
		//System.out.println(cal.getWeekYear()); // ?
		
		System.out.print(cal.get(Calendar.YEAR) + "년 ");
		System.out.print((cal.get(Calendar.MONTH)+1) + "월 ");	// month는 1월이 0에 대입 (+1 연산 필요)
		System.out.print(cal.get(Calendar.DATE) + "일 ");
		System.out.print(cal.get(Calendar.HOUR) + "시 ");
		System.out.print(cal.get(Calendar.MINUTE) + "분 ");
		System.out.print(cal.get(Calendar.SECOND) + "초");
		
		cal2.set(2013, 8, 1);
		System.out.println(cal2);
		System.out.println(cal2.getTimeInMillis()); // 세팅된 날짜시간 객체의 값을 millisecond 반환
		
		// 오늘부터 6/18일까지 d-day 계산
		
		Calendar today = new GregorianCalendar();
		Calendar dday = new GregorianCalendar();
		
		dday.set(2023, 5, 18);	// 2023/06/18
		
		long time = dday.getTimeInMillis() - today.getTimeInMillis();	// 1/1000 초
		
		System.out.println(time/1000/60/60/24);
		
	}

}

