import java.util.Scanner;

public class DividetoSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int factor = 2;
        int count;
        int divide = 1;

        while (num != 1) {
            count = 0;
            while (num % factor == 0) {
                num = num / factor;
                count++;
            }
            if (count % 2 == 1) {
                divide *= factor;
            }
            factor++;
        }

        System.out.println(divide);
    }
}
