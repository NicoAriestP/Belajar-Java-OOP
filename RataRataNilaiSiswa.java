public class RataRataNilaiSiswa {
    public static void main(String[] args) {
        // Membuat array untuk menyimpan nilai-nilai siswa
        int[][] nilai = {
            {1, 81, 90, 62},
            {2, 50, 83, 87},
            {3, 89, 55, 65},
            {4, 77, 70, 92}
        };

        // Menampilkan header laporan
        System.out.println("NRP Rata-rata");
        System.out.println("--------------------------");

        // Menghitung rata-rata nilai dan menampilkannya
        for (int i = 0; i < nilai.length; i++) {
            int nrp = nilai[i][0];
            int total = 0;
            for (int j = 1; j < nilai[i].length; j++) {
                total += nilai[i][j];
            }
            double rataRata = (double) total / (nilai[i].length - 1);
            System.out.printf("%d %.2f%n", nrp, rataRata);
        }

        // Menampilkan garis pemisah
        System.out.println("--------------------------");
    }
}
