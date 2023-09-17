import java.util.Scanner;

public class ArrayFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah deretan Fibonacci? ");
        int jumlahDeret = input.nextInt();
        
        int angkaSebelumnya = 0;
        int angkaSekarang = 1;
        
        System.out.print("0 1"); // Cetak angka awal (0 dan 1) secara manual
        
        for (int i = 2; i < jumlahDeret; i++) {
            int angkaSelanjutnya = angkaSebelumnya + angkaSekarang;
            System.out.print(" " + angkaSelanjutnya);
            
            // Update angka sebelumnya dan angka sekarang
            angkaSebelumnya = angkaSekarang;
            angkaSekarang = angkaSelanjutnya;
        }
        
        System.out.println(); // Pindah ke baris baru setelah mencetak deret Fibonacci
    }
}
