public class PrintAtoZ {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        long inp = scanner.nextLong();

        for (long val = 1; val <= inp; val++) {
            for (char alpha = 'a'; alpha <= 'z'; alpha++) {
                System.out.print(alpha+" ");
            }
            System.out.println();
        }
    }
}
