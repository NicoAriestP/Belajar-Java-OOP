package Pekan_7.tabungan;

public class MultiTabungan {
    private double saldoIDR;

    public MultiTabungan() {
        this.saldoIDR = 0.0;
    }

    public void setSaldo(double saldo, String mataUang) {
        if (mataUang.equalsIgnoreCase("USD")) {
            saldoIDR = saldo * 9000;
        } else if (mataUang.equalsIgnoreCase("AUD")) {
            saldoIDR = saldo * 10000;
        } else if (mataUang.equalsIgnoreCase("IDR")) {
            saldoIDR = saldo;
        } else {
            System.out.println("Mata uang tidak valid.");
        }
    }

    public double getSaldo(String mataUang) {
        if (mataUang.equalsIgnoreCase("USD")) {
            return saldoIDR / 9000;
        } else if (mataUang.equalsIgnoreCase("AUD")) {
            return saldoIDR / 10000;
        } else if (mataUang.equalsIgnoreCase("IDR")) {
            return saldoIDR;
        } else {
            System.out.println("Mata uang tidak valid.");
            return 0.0;
        }
    }

    public void simpanUang(double jumlah, String mataUang) {
        if (mataUang.equalsIgnoreCase("USD")) {
            saldoIDR += jumlah * 9000;
        } else if (mataUang.equalsIgnoreCase("AUD")) {
            saldoIDR += jumlah * 10000;
        } else if (mataUang.equalsIgnoreCase("IDR")) {
            saldoIDR += jumlah;
        } else {
            System.out.println("Mata uang tidak valid.");
        }
    }

    public boolean ambilUang(double jumlah, String mataUang) {
        if (mataUang.equalsIgnoreCase("USD")) {
            double jumlahIDR = jumlah * 9000;
            if (saldoIDR >= jumlahIDR) {
                saldoIDR -= jumlahIDR;
                return true;
            }
        } else if (mataUang.equalsIgnoreCase("AUD")) {
            double jumlahIDR = jumlah * 10000;
            if (saldoIDR >= jumlahIDR) {
                saldoIDR -= jumlahIDR;
                return true;
            }
        } else if (mataUang.equalsIgnoreCase("IDR")) {
            if (saldoIDR >= jumlah) {
                saldoIDR -= jumlah;
                return true;
            }
        }
        return false;
    }
}
