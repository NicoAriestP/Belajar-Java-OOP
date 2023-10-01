package perbankan;

public class Bank {
    private Nasabah[] nasabah;
    private int jumlahNasabah;

    public Bank() {
        nasabah = new Nasabah[10];
        jumlahNasabah = 0;
    }

    public void tambahNasabah(String namaAwal, String namaAkhir) {
        Nasabah n = new Nasabah(namaAwal, namaAkhir);
        nasabah[jumlahNasabah] = n;
        jumlahNasabah++;
    }

    public int getJumlahNasabah() {
        return jumlahNasabah;
    }

    public Nasabah getNasabah(int indeks) {
        if (indeks >= 0 && indeks < jumlahNasabah) {
            return nasabah[indeks];
        } else {
            return null;
        }
    }

}
