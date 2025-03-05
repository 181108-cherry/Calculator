package level2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true){
            while (true) {
                System.out.println("첫번째 숫자를 입력하세요 : ");
                int a = scanner.nextInt();
                while (a < 0) {
                    System.out.println("0을 포함한 양의 정수로 입력하십시오.");
                    System.out.print("첫번째 숫자를 입력하세요 : ");
                    a = scanner.nextInt();
                }

                System.out.println("두번째 숫자를 입력하세요 : ");
                int b = scanner.nextInt();
                while (b < 0) {
                    System.out.println("0을 포함한 양의 정수로 입력하십시오.");
                    System.out.print("두번째 숫자를 입력하세요 : ");
                    b = scanner.nextInt();
                }

                System.out.println("사칙연산 기호를 입력하세요(+, -, *, /) : ");
                char operation = scanner.next().charAt(0);

                if (b == 0 && operation == '/') {
                    System.out.println("0으로 나눌 수 없습니다. 올바른 값을 입력하세요.");
                    break;
                }

                int result = calculator.calc(a, b, operation);
                System.out.println("값은 : " + result);
            }
        }
    }
}
