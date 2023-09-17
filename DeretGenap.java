public class DeretGenap {
    public static void main(String[] args) {
        System.out.println("Deret bilangan genap (kecuali kelipatan 6):");

        for (int i = 2; i <= 20; i += 2) {
            if (i % 6 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
