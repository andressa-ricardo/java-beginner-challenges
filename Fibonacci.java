import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f1 = 0;
        int f2 = 1;
        System.out.print("Digite um número: ");
        int limit = scanner.nextInt();
        while (f2 < limit) {
            int fn = f1 + f2;
            if (fn > limit)
                break;
            System.out.println(fn);
            f1 = f2;
            f2 = fn;
        }
        scanner.close();
    }

}
