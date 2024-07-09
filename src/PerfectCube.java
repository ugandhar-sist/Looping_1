import java.util.Scanner;

public class PerfectCube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int factor = 3;
        while (num % factor == 0) {
            num = num / factor;

        }

        if (num == 1 )
            System.out.println("Perfect Cube");
        else
            System.out.println("Not a Perfect Cube");
    }
}
