package level1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하세요 : ");
        int a = scanner.nextInt();
        while (a < 0) {
            System.out.println("0을 포함한 양의 정수로 입력하십시오.");
            System.out.print("첫번째 숫자를 입력하세요 : ");
            a = scanner.nextInt();
        }

        System.out.print("두번째 숫자를 입력하세요 : ");
        int b = scanner.nextInt();
        while (b < 0) {
            System.out.println("0을 포함한 양의 정수로 입력하십시오.");
            System.out.print("두번째 숫자를 입력하세요 : ");
            b = scanner.nextInt();
        }

        System.out.print("사칙연산 기호를 입력하세요(+, -, *, /) : ");
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
        }
    }
}
