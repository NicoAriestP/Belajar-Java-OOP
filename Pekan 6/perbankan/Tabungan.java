package perbankan;

// File: Tabungan.java
public class Tabungan {
    private int saldo;

    public Tabungan(int saldoAwal) {
        this.saldo = saldoAwal;
    }

    public int getSaldo() {
        return saldo;
    }

    public void simpanUang(int jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Jumlah uang yang disimpan " + jumlah);
        }
    }

    public boolean ambilUang(int jumlah) {
        if (jumlah > 0 && saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Jumlah uang yang diambil " + jumlah);
            return true;
        } else {
            System.out.println("Gagal");
            return false;
        }
    }
}

