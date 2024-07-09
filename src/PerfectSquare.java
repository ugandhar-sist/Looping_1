import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long root;

        for (root = 1; root * root < N; root++) ;

        if (root * root == N)
            System.out.println("Perfect Square");
        else
            System.out.println("Not");
    }
}
