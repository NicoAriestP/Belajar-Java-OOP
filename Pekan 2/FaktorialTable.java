import java.util.Scanner;

public class FaktorialTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan faktorial: ");
        int n = input.nextInt();

        System.out.println("n  n!");
        System.out.println("--------------");

        long faktorial = 1;

        for (int i = 1; i <= n; i++) {
            faktorial *= i;
            System.out.println(i + "  " + faktorial);
        }

        input.close();
    }
}
