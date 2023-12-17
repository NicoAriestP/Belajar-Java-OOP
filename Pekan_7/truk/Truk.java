package Pekan_7.truk;

public class Truk {
    private double muatanMaksKg; // Muatan maksimal dalam kilogram
    private double muatanNewton; // Muatan sekarang dalam Newton

    public Truk(double muatanMaksKg) {
        this.muatanMaksKg = muatanMaksKg;
        this.muatanNewton = 0.0;
    }

    public double getMuatanMaks() {
        return muatanMaksKg;
    }

    public double getMuatan() {
        return muatanNewton / 9.8; // Mengkonversi kembali ke kilogram
    }

    public boolean tambahMuatan(double beratMuatanKg) {
        double muatanKg = muatanNewton / 9.8; // Mengkonversi kembali ke kilogram
        if (muatanKg + beratMuatanKg <= muatanMaksKg) {
            muatanNewton += beratMuatanKg * 9.8; // Mengkonversi ke Newton
            return true;
        } else {
            return false;
        }
    }
}


