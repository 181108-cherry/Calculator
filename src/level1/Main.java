package level1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력하세요 : ");
        int a = scanner.nextInt();

        System.out.println("두번째 숫자를 입력하세요 : ");
        int b = scanner.nextInt();

        System.out.println("사칙연산 기호를 입력하세요(+, -, *, /) : ");
        char operation = scanner.next().charAt(0);

        int result = 0;

        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;

            default:
                System.out.println("값이 일치하지 않습니다.");
        }


    }
}
