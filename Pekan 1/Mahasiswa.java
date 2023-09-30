public class Mahasiswa {
    // Atribut
    String nama;
    int umur;

    // Method untuk mengatur nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method untuk mengatur umur
    public void setUmur(int umur) {
        this.umur = umur;
    }

    // Method untuk menampilkan informasi mahasiswa
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
    }
}