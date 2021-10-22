package lv10_4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 자료구조 : 데이터를 어떤 규치(조직)으로 저장하고, 가져올 것인가
//Collection 
// ㄴ ArrayList, Vector
// ㄴ HashMap (key-value)
public class Ex {
	public static void main(String[] args) {

		// 제네릭 <?> 은 : 객체의 자료형을 지정
		// ㄴ 선언부에서 자료형(Type)을 정해주지 전까지는
		// ㄴ 결정되어지지 않은 열린 상태

		// HashMap 선언 및 초기화
		Map<String, Integer> users = new HashMap<>();

		// 추가
		// put() 메소드 사용
		// . 1쌍의 키-밸류 가 들어가야함
		// . 중복키를 허용하지 X

		users.put("홍길동", 31);
		users.put("도우너", 10);
		users.put("홍희동", 2);
		users.put("홍둘리", 9);
		users.put("홍길동", 33); // 중복키 존재하는 경우 -> 값을 갱신해준다.
		users.put("백승종", 2);

		System.out.println(users.size());

		// KeySet() 맵의 키값만 배열로 반환(Type : Object)
		for (Object key : users.keySet()) {
			System.out.print(key + ": ");
			System.out.println(users.get(key));
		}
		System.out.println();

		// 삭제
		users.remove("홍길동");

		// 정렬
		Object keys[] = users.keySet().toArray();
		Arrays.sort(keys);
		for (int i = 0; i < keys.length; i++) {
			System.out.print(keys[i] + " : ");
			System.out.println(users.get(keys[i]));
		}
		System.out.println();

		//
		//
		//
		//
		//
		// value로 정렬

		for (int i = 0; i < keys.length; i++) {
			for (int j = i; j < keys.length; j++) {
				if (users.get(keys[i]) > users.get(keys[j])) {
					Object tmp = keys[i];
					keys[i] = keys[j];
					keys[j] = tmp;
				}
			}
		}
		for (int i = 0; i < keys.length; i++) {
			System.out.println(keys[i]);
		}
		//
		//
		//
		//
		//
		//

	}
}
