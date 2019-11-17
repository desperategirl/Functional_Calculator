package function.calc.service;

import java.util.Scanner;

import function.calc.exec.ProductVO;

// 가성비 계산기를 위한 Service Class code를 만드는 클래스

// 상품의 가격 대비 용량의 비율을 알아보기 위해 
// 가성비 계산기를 만들어보고자 한다.

// 상품의 가격을 입력한 뒤 
// 10g 당 가격을 비교할 수 있는 코드를 짠다

// 과자 10g당 가격 비교

public class FuncCalcServiceV1 {

	Scanner scan = new Scanner(System.in);

	ProductVO fcVO = new ProductVO();
	FuncCalcServiceV2 fc2 = new FuncCalcServiceV2();

	// 상품 이름, 가격, 무게를 입력받고 출력하는 메서드
	// 10g당 가격을 볼지 말지 선택하는 부분이 있다
	public void view() {

		// 상품을 어떤 단위로 계산할 것인지 입력하기.
		// 1. 10g당 가격 보여주기(과자, 과일, 채소, 냉동식품 등)
		// 2. 100ml당 가격 보여주기()
		// 3. 개수(piece)당 가격 보여주기

		// 상품의 단위를 선택하는 method

		while (true) {
			System.out.println("번호를 입력하여 원하는 계산 단위를선택하세요.");
			System.out.println("=======================================");
			System.out.println("1. 10g단위     2. 100ml단위    3. 개당 단위    4. 종료");
			System.out.println("=======================================");
			int selectNum = Integer.valueOf(scan.nextLine());

			if (selectNum == 1) {
				System.out.println(" 10g 단위를 선택하셨습니다.");
				fc2.calc10g();
			} else if (selectNum == 2) {
				System.out.println(" 100ml 단위를 선택하셨습니다. ");
				fc2.calc100ml();
			} else if (selectNum == 3) {
				System.out.println(" 개당 단위를 선택하셨습니다.");
				fc2.calcPiece();
			} else if (selectNum == 4) {
				System.out.println(" 종료를 선택하셨습니다.");
				break;
			}

		}
	}

}
