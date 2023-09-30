// Membuat kelas Shape
class Shape {
    private double panjang;
    private double lebar;
    private double tinggi;

    // Konstruktor untuk inisialisasi panjang, lebar, dan tinggi
    public Shape(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    // Metode untuk menghitung volume
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    // Metode untuk mencetak informasi shape
    public void cetak() {
        System.out.println("PanjangxLebarxTinggi = " + panjang + "x" + lebar + "x" + tinggi);
        System.out.println("Volume = " + hitungVolume());
    }

    // Metode untuk membandingkan volume dengan shape lain
    public double compareTo(Shape shape) {
        return Math.abs(this.hitungVolume() - shape.hitungVolume());
    }
}

// Kelas tester
public class ShapeTester {
    public static void main(String[] args) {
        Shape kubus = new Shape(5, 5, 5);
        Shape balok = new Shape(10, 5, 5);

        kubus.cetak();
        balok.cetak();

        double selisihVolume = kubus.compareTo(balok);
        System.out.println("Selisih Volume = " + selisihVolume);
    }
}
