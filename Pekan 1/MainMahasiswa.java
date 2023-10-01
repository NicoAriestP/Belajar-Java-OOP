class Mahasiswa {
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

public class MainMahasiswa {
    public static void main(String[] args) {
        // Membuat objek mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa();

        // Mengatur atribut nama dan umur
        mahasiswa1.setNama("John");
        mahasiswa1.setUmur(20);

        // Menampilkan informasi mahasiswa
        System.out.println("Informasi Mahasiswa 1:");
        mahasiswa1.displayInfo();

        // Membuat objek mahasiswa lain
        Mahasiswa mahasiswa2 = new Mahasiswa();

        // Mengatur atribut nama dan umur mahasiswa lain
        mahasiswa2.setNama("Alice");
        mahasiswa2.setUmur(22);

        // Menampilkan informasi mahasiswa lain
        System.out.println("\nInformasi Mahasiswa 2:");
        mahasiswa2.displayInfo();
    }
}
