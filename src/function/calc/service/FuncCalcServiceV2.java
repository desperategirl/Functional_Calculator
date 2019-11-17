package function.calc.service;

import java.util.Scanner;
import function.calc.exec.ProductVO;

// 가성비 계산기를 위한 Service Class code를 만드는 클래스

// 상품의 가격 대비 용량의 비율을 알아보기 위해 
// 가성비 계산기를 만들어보고자 한다.

// 상품의 가격을 입력한 뒤 
// 10g 당 가격을 비교할 수 있는 코드를 짠다

// 과자 10g당 가격 비교

public class FuncCalcServiceV2 {

	Scanner scan = new Scanner(System.in);
	ProductVO fcVO = new ProductVO();

	// 상품 10g당의 가격을 계산하는 method
	public void calc10g() {

		// 상품 이름 입력
		System.out.println("원하는 상품 이름을 입력하세요. >> ");

		// 상품 이름을 변수에 대입
		fcVO.name = scan.nextLine();

		// 상품의 가격을 입력
		System.out.println("상품의 가격을 숫자로만 입력하세요. >> ");
		fcVO.price = Integer.valueOf(scan.nextLine());

		// 상품의 그램수를 입력

		System.out.println("상품의 그램수를 숫자로만 입력하세요. >> ");
		fcVO.quantity = Integer.valueOf(scan.nextLine());

		// 상품 이름과 그램수를 같이 출력
		System.out.println("입력하신 상품은 " + "\"" + fcVO.name + "\"" + "입니다.");
		System.out.println();

		// 10g 당 무게 계산하는 code가 출력된다.
		// 여기서 메서드를 따로 만든다.

		System.out.println("10g당 가격을 보시겠습니까?");
		System.out.println("Y와 N 둘 중 하나만 입력하여 선택하세요.");

		String yOrN = scan.nextLine();

		// equalsIgnoreCase()
		// 입력받은 문자열이 대소문자 관계없이
		// 괄호 안의 문자열과 같은지 확인하는 자바에 내장된 method.
		if (yOrN.equalsIgnoreCase("Y")) {

			// 상품 10g당의 가격을 계산
			// (총 가격 / 무게) * 10 = 10g 당 가격

			// (Math.round(가격));
			// 이렇게 하면 소수점 첫번째 자리에서 반올림되어 정수값을 리턴하게 된다.
			
			// 소수점 n번째 자리에서 반올림하여 나타내고 싶으면
			// 1 뒤에 n-1 수만큼 0을 붙여서 먼저 곱하고
			// round를 적용시킨다
			// 그 다음 다시 1*(n-1만큼의 0)으로 나눠주면
			// 소수점 n번째 자리에서 반올림하여 나타내고 싶었던 값이 나오게 된다
			
			// 예를 들어 3.141592를 소수점로 세번째 자리에서 반올림하여 나타내고 싶으면
			// 3.141592에 100(1에 0을 2개붙임)을 곱한 다음 Math.round() 함수로 처리하고
			// 그다음 다시 100으로 나눠주면
			// 3.14가 나오게 된다.
			
			// 만약 반올림이 아니라 올림을 하고 싶으면 Math.ceil()을 쓰면 되고
			// 버림을 하고 싶으면 Math.floor()을 하면 된다.
			
			// 여기에선 정수값을 소수점 첫번째 자리에서 반올림하여
			// 리턴하기 위해 (Math.round(가격)) 메서드를 쓸 것이다.
			
			fcVO.priceOfTheQuantity = (Math.round(fcVO.price / fcVO.quantity * 10));
			System.out.println(fcVO.name + "의 10g당 가격은 " + fcVO.priceOfTheQuantity + "원 입니다.");
			System.out.println();
			// continueOrQuit();

		} else if (yOrN.equalsIgnoreCase("N")) {
			System.out.println("서비스를 종료합니다.");

		}

	}

	// 상품 100ml의 가격을 계산하는 method
	public void calc100ml() {

		// 상품 이름 입력
		System.out.println("원하는 상품 이름을 입력하세요. >> ");

		// 상품 이름을 변수에 대입
		fcVO.name = scan.nextLine();

		// 상품의 가격을 입력
		System.out.println("상품의 가격을 숫자로만 입력하세요. >> ");
		fcVO.price = Integer.valueOf(scan.nextLine());

		// 상품의 총 ml를 입력

		System.out.println("상품의 총 용량(ml)을 숫자로만 입력하세요. >> ");
		fcVO.quantity = Integer.valueOf(scan.nextLine());

		// 상품 이름과 그램수를 같이 출력
		System.out.println("입력하신 상품은 " + "\"" + fcVO.name + "\"" + "입니다.");
		System.out.println();

		// 10g 당 무게 계산하는 code가 출력된다.
		// 여기서 메서드를 따로 만든다.

		System.out.println("100ml당 가격을 보시겠습니까?");
		System.out.println("Y와 N 둘 중 하나만 입력하여 선택하세요.");

		String yOrN = scan.nextLine();

		// equalsIgnoreCase()
		// 입력받은 문자열이 대소문자 관계없이
		// 괄호 안의 문자열과 같은지 확인하는 자바에 내장된 method.
		if (yOrN.equalsIgnoreCase("Y")) {

			// 상품 10g당의 가격을 계산
			// (총 가격 / 무게) * 10 = 10g 당 가격

			fcVO.priceOfTheQuantity = (Math.round(fcVO.price / fcVO.quantity * 100));
			System.out.println(fcVO.name + "의 100ml당 가격은 " + fcVO.priceOfTheQuantity + "원 입니다.");
			System.out.println();
			// continueOrQuit();

		} else if (yOrN.equalsIgnoreCase("N")) {
			System.out.println("서비스를 종료합니다.");

		}
	}

	public void calcPiece() {

		// 상품 이름 입력
		System.out.println("원하는 상품 이름을 입력하세요. >> ");

		// 상품 이름을 변수에 대입
		fcVO.name = scan.nextLine();

		// 상품의 가격을 입력
		System.out.println("상품의 가격을 숫자로만 입력하세요. >> ");
		fcVO.price = Integer.valueOf(scan.nextLine());

		// 상품의 총 개수를 입력

		System.out.println("상품의 총 개수를 숫자로만 입력하세요. >> ");
		fcVO.quantity = Integer.valueOf(scan.nextLine());

		// 상품 이름과 그램수를 같이 출력
		System.out.println("입력하신 상품은 " + "\"" + fcVO.name + "\"" + "입니다.");
		System.out.println();

		// 10g 당 무게 계산하는 code가 출력된다.
		// 여기서 메서드를 따로 만든다.

		System.out.println("1개 당 가격을 보시겠습니까?");
		System.out.println("Y와 N 둘 중 하나만 입력하여 선택하세요.");

		String yOrN = scan.nextLine();

		// equalsIgnoreCase()
		// 입력받은 문자열이 대소문자 관계없이
		// 괄호 안의 문자열과 같은지 확인하는 자바에 내장된 method.
		if (yOrN.equalsIgnoreCase("Y")) {

			// 상품 10g당의 가격을 계산
			// (총 가격 / 무게) * 10 = 10g 당 가격

			fcVO.priceOfTheQuantity = Math.round(fcVO.price / fcVO.quantity);
			System.out.println(fcVO.name + "의 1개 당 가격은 " + fcVO.priceOfTheQuantity + "원 입니다.");
			System.out.println();
			// continueOrQuit();

		} else if (yOrN.equalsIgnoreCase("N")) {
			System.out.println("서비스를 종료합니다.");

		}

	}

	/*
	 * public void continueOrQuit() {
	 * 
	 * System.out.println("다른 상품을 입력하시려면  Y를, 서비스를 종료하시려면 N을 입력하세요.");
	 * 
	 * // 상품의 정한 단위당 가격 정보를 보여주는 모든 과정이 끝나고 나서 // 다른 상품의 단위당 가격정보를 보기 위해 // 다시 메서드를
	 * 실행할 것인지 종료할 것인지 선택하는 메서드 String yOrN = scan.nextLine();
	 * 
	 * // 다른 상품을 입력하려면 Y, 서비스 종료하려면 N if (yOrN.equalsIgnoreCase("Y")) { fc1.view();
	 * } else if (yOrN.equalsIgnoreCase("N")) { System.out.println("서비스를 종료합니다.");
	 * 
	 * } else { System.out.println("Y 또는 N 중에서만 선택하여 입력해 주세요.");
	 * System.out.println(); continueOrQuit(); }
	 * 
	 * }
	 */

}
