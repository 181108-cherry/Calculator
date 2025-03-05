package level2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        do {
            System.out.println("첫번째 숫자를 입력하세요 : ");
            int a = scanner.nextInt();

            System.out.println("두번째 숫자를 입력하세요 : ");
            int b = scanner.nextInt();

            System.out.println("사칙연산 기호를 입력하세요(+, -, *, /) : ");
            char operation = scanner.next().charAt(0);

            calculator.calc(a,b,operation);
        }while(true);
    }
}
