package lv10_1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// 타이머 만들기
		// ㄴ 입력값을 받고(제한시간)
		// ㄴ Thread.sleep() 메소드활용
		// ㄴ 초 또는 ms 단위로 콘솔에 흘러가는 현재시간(남은시간) 출력
		// ㄴ 제한시간 이 끝나면 프로그램 종료

		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();

		long time = cal.getTimeInMillis();
		SimpleDateFormat sdf = new SimpleDateFormat("hh시 mm분 ss초", Locale.ENGLISH);

		System.out.println("[타이머]");
		System.out.print("분 : ");
		int min = sc.nextInt();
		System.out.print("초 : ");
		int sec = sc.nextInt();

		if (min >= 0 && min < 60 && sec >= 0 && sec < 60) {
			while (true) {
				System.out.println("현재시간 : " + sdf.format(time));
				System.out.printf("남은시간 : %d : %d\n", min, sec);
				time += 1000;
				if (sec == 0) {
					min--;
					sec = 60;
				}
				sec--;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (min == 0 && sec == 0) {
					System.out.println("끝");
					break;
				}
			}
		}

	}
}
