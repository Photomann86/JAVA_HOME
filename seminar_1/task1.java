package seminar_1;

public class task1 {
    public static int triangleNumber(int num) {
        int sum = 0;
        for (int i = 1; i < num + 1; i++) {
            sum += i;
            }
        return sum;
        }
    public static int Factorial(int num) {
        int fact = 1;
        for (int i = 1; i < num + 1; i++) {
            fact *= i;
        }
        return fact;
    }
    }