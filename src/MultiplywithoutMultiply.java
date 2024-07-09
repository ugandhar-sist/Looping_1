import java.util.Scanner;

public class MultiplywithoutMultiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        long multiple = scanner.nextLong();
        long value;
        long sum = 0;

        for (value = 1; value <= multiple; value++) {
            sum = number + sum;
        }

        System.out.println(sum);
    }
}
