public class Mobil {
    private String merek;
    private String warna;
    private String tipe;
    private int kapasitasMesin;
    private int jumlahPintu;

    public Mobil(String merek, String warna, String tipe, int kapasitasMesin, int jumlahPintu) {
        this.merek = merek;
        this.warna = warna;
        this.tipe = tipe;
        this.kapasitasMesin = kapasitasMesin;
        this.jumlahPintu = jumlahPintu;
    }

    public void infoMobil() {
        System.out.println("Karakteristik Mobil:");
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Tipe: " + tipe);
        System.out.println("Kapasitas Mesin: " + kapasitasMesin + " cc");
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }

    public String getMerek() {
        return merek;
    }

    public String getWarna() {
        return warna;
    }

    public String getTipe() {
        return tipe;
    }

    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Biru", "minibus", 2000, 7);
        Mobil mobil2 = new Mobil("Daihatsu", "Hitam", "pick up", 1500, 2);
        Mobil mobil3 = new Mobil("Suzuki", "Silver", "suv", 1800, 5);
        Mobil mobil4 = new Mobil("Honda", "Merah", "sedan", 1300, 5);

        // Menampilkan info karakteristik mobil
        mobil1.infoMobil();
        System.out.println();
        mobil2.infoMobil();
        System.out.println();
        mobil3.infoMobil();
        System.out.println();
        mobil4.infoMobil();
    }
}
