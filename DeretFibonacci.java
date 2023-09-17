import java.util.Scanner;

public class DeretFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berapa deret Fibonacci? ");
        int n = input.nextInt();

        int[] fibonacci = new int[n];
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.print(n + " deret Fibonacci = ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }

        input.close();
    }
}
