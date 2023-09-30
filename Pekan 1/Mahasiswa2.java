public class Mahasiswa2 {
    // Atribut nrp dan nama
    int nrp;
    String nama;

    // Konstruktor untuk menginisialisasi nrp dan nama
    public Mahasiswa2(int nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
    }

    // Metode akses (getter) untuk nrp
    public int getNrp() {
        return nrp;
    }

    // Metode akses (getter) untuk nama
    public String getnama() {
        return nama;
    }

    public static void main(String[] args) {
        // Membuat objek Mahasiswa dengan nrp 12345 dan nama "Jono"
        Mahasiswa2 mhs = new Mahasiswa2(12345, "Jono");

        // Menampilkan nrp dan nama mahasiswa
        System.out.println("NRP : " + mhs.getNrp());
        System.out.println("Nama : " + mhs.getnama());
    }
}
