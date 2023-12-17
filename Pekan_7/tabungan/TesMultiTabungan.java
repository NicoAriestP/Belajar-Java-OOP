package Pekan_7.tabungan;

public class TesMultiTabungan {
    public static void main(String[] args) {
        MultiTabungan tabungan = new MultiTabungan();

        tabungan.setSaldo(100, "USD");
        System.out.println("Saldo dalam USD: " + tabungan.getSaldo("USD") + " USD");
        System.out.println("Saldo dalam IDR: " + tabungan.getSaldo("IDR") + " IDR");

        tabungan.simpanUang(50, "AUD");
        System.out.println("Saldo dalam AUD: " + tabungan.getSaldo("AUD") + " AUD");
        System.out.println("Saldo dalam IDR: " + tabungan.getSaldo("IDR") + " IDR");

        boolean statusUSD = tabungan.ambilUang(100, "USD");
        boolean statusAUD = tabungan.ambilUang(500, "AUD");
        boolean statusIDR = tabungan.ambilUang(2000, "IDR");

        System.out.println("Status pengambilan USD: " + (statusUSD ? "Ok" : "Gagal"));
        System.out.println("Status pengambilan AUD: " + (statusAUD ? "Ok" : "Gagal"));
        System.out.println("Status pengambilan IDR: " + (statusIDR ? "Ok" : "Gagal"));

        System.out.println("Saldo dalam IDR setelah pengambilan: " + tabungan.getSaldo("IDR") + " IDR");
    }
}

