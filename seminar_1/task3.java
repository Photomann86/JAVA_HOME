package seminar_1;
import java.util.Objects;
import java.util.Scanner;

public class task3 {
    public static String Result() {
        String[] Calculator = userInput();

        String oper = Calculator[0];
        int a = Integer.parseInt(Calculator[1]);
        int b = Integer.parseInt(Calculator[2]);
        int rezult = 0;
        if (Objects.equals(oper, "+")){rezult = a + b;}
        else if (Objects.equals(oper, "-")){ rezult = a - b;}
        else if (Objects.equals(oper, "/")){ rezult = a / b;}
        else if (Objects.equals(oper, "*")){ rezult = a * b;}
        else {
            System.out.println("Повторите ввод данных");
        }
        return System.out.printf("%d %s %d = %d \n", a, oper, b, rezult).toString();
    }
    public static String[] userInput(){
        String[] InputArr = new String[3];
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите символ операции +, -, /, * ");
        String UserOperation = scan.nextLine();
        System.out.println("Введите первое число");
        String UserNum1 = scan.nextLine();
        System.out.println("Введите второе число");
        String UserNum2 = scan.nextLine();
        scan.close();
        InputArr[0] = UserOperation;
        InputArr[1] = UserNum1;
        InputArr[2] = UserNum2;
        return InputArr;
    }
}