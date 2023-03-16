package api.util;

import java.util.Calendar;
import java.util.Locale;
// 사용 언어별로 다른 리소스를 설정하기 위해서 필요한 객체
// => Spring에서 다국어 지원 메시지를 처리하기 위한
public class LocaleTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale locale1 = new Locale.Builder()
				.setLanguage("en")
				.setRegion("US")
				.build();
		
		Locale locale2 = new Locale.Builder()
				.setLanguage("ko")
				.setRegion("KR")
				.build();
		
		System.out.println(locale1.getLanguage());
		System.out.println(locale1.getCountry());
		
		System.out.println(locale2.getLanguage());
		System.out.println(locale2.getCountry());
		
		// 언어와 국가 설정내용을 기본 설정된 로케일에 맞춰 출력한다.
		// => 기본설정된 로케일 정보가 한국
		System.out.println(locale1.getDisplayName());
		System.out.println(locale1.getDisplayName(Locale.CHINA));
		System.out.println(locale2.getDisplayName());
		System.out.println(locale2.getDisplayName(Locale.CHINA));
		
		Locale locale3 = new Locale("fr", "CA");
		System.out.println(locale3.getDisplayName());
		System.out.println(locale3.getDisplayName(Locale.CHINA));
		
		Calendar cal1 = Calendar.getInstance(new Locale("en", "US")); // US
		Calendar cal2 = Calendar.getInstance(new Locale("ko", "KR")); // 한국
		
		System.out.println(cal1.getTimeZone());
		System.out.println(cal2.getTimeZone());
		
		// 로케일 객체는 국자정보와 언어에 대한 정보를 세팅하지만 시간정보(TimeZone) 는 바꾸지 못한다.
		// 언어 및 국가정보 - Locale
		// 지역에 따른 시간정보 - TimeZone
	}

}
