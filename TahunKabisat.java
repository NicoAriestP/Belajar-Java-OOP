import java.util.Scanner;

public class TahunKabisat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tahun;
        do {
            System.out.print("Masukkan tahun (1900-2005) : ");
            tahun = input.nextInt();

            if (tahun < 1900) {
                System.out.println("Maaf, tahun input dibawah 1900");
            } else if (tahun > 2005) {
                System.out.println("Maaf, tahun input diatas 2005");
            } else {
                if ((tahun % 4 == 0 && tahun % 100 != 0) || tahun % 400 == 0) {
                    System.out.println(tahun + " adalah tahun kabisat");
                } else {
                    System.out.println(tahun + " bukan tahun kabisat");
                }
            }
        } while (tahun < 1900 || tahun > 2005);

        input.close();
    }
}
