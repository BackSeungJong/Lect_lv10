package lv10_1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

//디자인 패턴 중 Singleton
// 프로그램 안에서 단 하나의(유일한) instance 를 허용하게끔 처리하는 것

class UserManager {

	// 1. 생성한 객체를 instance 변수에 담아 pricate 처리
	private static UserManager instance = new UserManager();

	// 2. 기본 생성자 제한(private) -> 타 클래스에서 1개를 초과하는 생성을 방지
	private UserManager() {
	}

	// 3. 유일한 instance를 getter를 통해 참조
	public static UserManager getInstance() {
		return instance;
	}
}

class MainControl {
	UserManager um = UserManager.getInstance();
}

public class Ex {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calendar cal = new Calendar();// 생성 불가
		Calendar cal = Calendar.getInstance();
		long time = cal.getTimeInMillis();// 현재 시간을 반환 : 1970년 1월 1일 00시 00분 00초를 기준으로 ~ 흘러간 ms초를 반환
		System.out.println(time);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E hh시 mm분 ss초 SS", Locale.ENGLISH);
		System.out.println(sdf.format(time));

		System.out.println(cal.get(cal.YEAR));// 연도
		System.out.println(cal.get(cal.MONTH) + 1);// 월
		System.out.println(cal.get(cal.DAY_OF_MONTH));// 일
		System.out.println(cal.get(cal.DAY_OF_WEEK));// 요일
		System.out.println("시간");
		System.out.println(cal.get(cal.HOUR));// 시
		System.out.println(cal.get(cal.MINUTE));// 시
		System.out.println(cal.get(cal.SECOND));// 시
		System.out.println(cal.get(cal.MILLISECOND));// 시

	}
}
