public class Tabungan {
    // Atribut saldo
    double saldo;

    // Konstruktor untuk menginisialisasi saldo awal
    public Tabungan(double saldoAwal) {
        saldo = saldoAwal;
    }

    // Metode akses (getter) untuk saldo
    public double getSaldo() {
        return saldo;
    }

    // Metode untuk menyimpan uang
    public void simpanUang(double jumlah) {
        saldo += jumlah;
    }

    // Metode untuk mengambil uang
    public boolean ambilUang(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            return true; // Pengambilan uang berhasil
        } else {
            return false; // Saldo tidak cukup, pengambilan uang gagal
        }
    }

    public static void main(String[] args) {
        boolean status;
        // Membuat objek Tabungan dengan saldo awal 5000
        Tabungan tabungan = new Tabungan(5000);

        // Menampilkan saldo awal
        System.out.println("Saldo awal :" + tabungan.getSaldo());

        // Menyimpan uang sebesar 3000 ke tabungan
        tabungan.simpanUang(3000);
        System.out.println("Jumlah uang yang disimpan : 3000");

        // Mengambil uang sebesar 6000 dari tabungan
        status = tabungan.ambilUang(6000);
        System.out.println("Jumlah uang yang diambil : 6000");
        if (status)
            System.out.println("Ok");
        else
            System.out.println("Gagal");

        // Menyimpan uang sebesar 3500 ke tabungan
        tabungan.simpanUang(3500);
        System.out.println("Jumlah uang yang disimpan :3500");

        // Mengambil uang sebesar 4000 dari tabungan
        status = tabungan.ambilUang(4000);
        System.out.println("Jumlah uang yang diambil : 4000");
        if (status)
            System.out.println("Ok");
        else
            System.out.println("Gagal");

        // Mengambil uang sebesar 1600 dari tabungan
        status = tabungan.ambilUang(1600);
        System.out.println("Jumlah uang yang diambil : 1600");
        if (status)
            System.out.println("Ok");
        else
            System.out.println("Gagal");

        // Menyimpan uang sebesar 2000 ke tabungan
        tabungan.simpanUang(2000);
        System.out.println("Jumlah uang yang disimpan :2000");
        
        // Menampilkan saldo saat ini
        System.out.println("Saldo sekarang = " + tabungan.getSaldo());
    }
}
