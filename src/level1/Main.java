package level1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str;

        do {
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
                   while (b == 0) {
                       System.out.println("분모에 0이 올 수 없습니다. ");
                       System.out.print("0을 제외한 양의 정수를 입력하세요 : ");
                       b = scanner.nextInt();
                       result = a / b;
                   }
                   break;
           }
           System.out.println("값은 = " + result);
           System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
           str = scanner.next();
        } while (!str.equals("exit"));
        System.out.println("프로그램이 종료됩니다.");
    }
}