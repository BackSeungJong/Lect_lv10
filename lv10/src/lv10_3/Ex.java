package lv10_3;

import java.util.Scanner;

// 상속 -> 다형성
// 상속한 부모를 통해 다양한 class를 정의할 수 있는 것

// Man
// ㄴ 자식
// ㄴ 아빠
// ㄴ 직원
// ㄴ 사장

// 사장
// >> 커피숍사장
// >> 치킨집사장
// >> 편의점사장

// 그림판 예제
// : 그리기 (모양)
//    ㄴ점
//	  ㄴ선
//	  ㄴ사각형
//	  ㄴ원형
//	  ㄴ세모

abstract class shape {
	String myshape;
	int x, y;

	public void move() {
	}

	public abstract void draw();

}

//shape을 활용해서 그리기 툴 만들기
class Dot extends shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		x = 0;
		y = 0;
		System.out.printf("점이 (%d,%d)좌표에 찍혔습니다.\n");
	}
}

class Square extends shape {

	Square() {
		myshape = "□";
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.print("x : ");
		x = Ex.sc.nextInt();
		System.out.print("y : ");
		y = Ex.sc.nextInt();
	}
}

public class Ex {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Square squar = new Square();

		String board[][] = new String[3][3];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = "";
			}
		}

		while (true) {
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[i].length; j++) {
					if (board[i][j] == null) {
						System.out.print("  ");
					} else {
						System.out.print(board[i][j] + " ");
					}
				}
				System.out.println();
			}
			System.out.println("1. 사각형");
			int sel = sc.nextInt();

			if (sel == 1) {
				System.out.println(squar.myshape);
				squar.draw();
				board[squar.x][squar.y] = squar.myshape;
			}
		}
	}
}
