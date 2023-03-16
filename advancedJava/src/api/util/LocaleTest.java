package api.util;

import java.util.Calendar;
import java.util.Locale;

// Locale은 각 지역의 국가 언어 정보를 갖고 있는 객체
public class LocaleTest {
	public static void main(String[] args) {
		Locale[] locale = Locale.getAvailableLocales();
		for (Locale data : locale) {
			System.out.println(data);
		}
		
//		Locale.Builder builder = new Locale.Builder();
//		builder = builder.setLanguage("en");
//		builder = builder.setRegion("US");
//		Locale locale2 = builder.build();
		
		Locale locale2 = new Locale.Builder()
								.setLanguage("en")
								.setRegion("US")
								.build();
		
		Calendar cal = Calendar.getInstance(locale2);
		TimeZoneTest.getInfo(cal);
		
		// Locale 관련 정보를 추출
		// ISO => 국제표준화기구
		// 국제표준화기구에서 정한 국가에 대한 정보를 추출
		String[] countries = Locale.getISOCountries();
		for (String country : countries) {
			Locale locale3 = new Locale("en", country);
			System.out.printf("2자 국가코드 : %s | 3자 국가코드 : %s | 영문국가명 : %s | 한글국가명 : %s %n"
						,locale3.getCountry()
						,locale3.getISO3Country()
						,locale3.getDisplayCountry(new Locale("en"))
						,locale3.getDisplayCountry());
		}
	}
}
