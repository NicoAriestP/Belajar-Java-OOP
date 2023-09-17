public class Truk {
    // Atribut muatanMaks dan muatan
    double muatanMaks;
    double muatan;

    // Konstruktor untuk menginisialisasi muatan maksimal
    public Truk(double muatanMaks) {
        this.muatanMaks = muatanMaks;
        this.muatan = 0; // Awalnya muatan kosong
    }

    // Metode akses (getter) untuk muatan maksimal
    public double getMuatanMaks() {
        return muatanMaks;
    }

    // Metode akses (getter) untuk muatan
    public double getMuatan() {
        return muatan;
    }

    // Metode untuk menambah muatan
    public void tambahMuatan(double tambahanMuatan) {
        if (muatan + tambahanMuatan <= muatanMaks) {
            muatan += tambahanMuatan;
        } else {
            System.out.println("Muatan melebihi kapasitas maksimal!");
        }
    }
    public static void main(String[] args) {
        // Membuat objek Truk dengan kapasitas muatan maksimal 1000
        Truk truk = new Truk(1000);

        // Menampilkan muatan maksimal
        System.out.println("Muatan maksimal = " + truk.getMuatanMaks());

        // Menambah muatan ke truk
        truk.tambahMuatan(500.0);
        System.out.println("Tambah muatan : 500 ");

        truk.tambahMuatan(350.0);
        System.out.println("Tambah muatan : 350 ");

        truk.tambahMuatan(100.0);
        System.out.println("Tambah muatan : 100 ");

        truk.tambahMuatan(150.0);
        System.out.println("Tambah muatan : 150 ");

        // Menampilkan muatan saat ini
        System.out.println("Muatan sekarang = " + truk.getMuatan());
    }
}
