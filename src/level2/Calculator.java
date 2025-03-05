package level2;

import java.util.ArrayList;

public class Calculator {

    private ArrayList<Integer> list;

    public Calculator(){
        this.list = new ArrayList<>();
    }

    public int calc(int a, int b, char operation) {

        int result = 0;

        if (operation == '/' && b == 0) {
            System.out.println("0으로 나눌 수 없습니다. 올바른 값을 입력하세요.");
            return 0;
        }

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
                System.out.println("잘못된 연산자입니다. (+, -, *, /)만 입력하세요.");
                return 0;
        }
        list.add(result);
        return result;
    }
}
