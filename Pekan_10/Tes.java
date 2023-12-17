package Pekan_10;

public class Tes {
    public static void main(String[] args) {
        Truk truk1 = new Truk();
        truk1.setRoda(4);
        truk1.setWarna("kuning");
        truk1.setBahanBakar("solar");
        truk1.setKapasitasMesin(1500);
        truk1.setMuatanMaks(1000);

        Truk truk2 = new Truk();
        truk2.setRoda(6);
        truk2.setWarna("merah");
        truk2.setBahanBakar("solar");
        truk2.setKapasitasMesin(2000);
        truk2.setMuatanMaks(5000);

        Mobil taksi1 = new Mobil();
        taksi1.setRoda(4);
        taksi1.setWarna("oranye");
        taksi1.setBahanBakar("bensin");
        taksi1.setKapasitasMesin(1500);
        taksi1.setTarifAwal(10000);
        taksi1.setTarifPerKm(5000);

        Mobil taksi2 = new Mobil();
        taksi2.setRoda(4);
        taksi2.setWarna("biru");
        taksi2.setBahanBakar("bensin");
        taksi2.setKapasitasMesin(1300);
        taksi2.setTarifAwal(7000);
        taksi2.setTarifPerKm(3500);

        Sepeda sepeda1 = new Sepeda();
        sepeda1.setRoda(3);
        sepeda1.setWarna("hitam");
        sepeda1.setJmlSadel(1);
        sepeda1.setJmlGir(2);

        Sepeda sepeda2 = new Sepeda();
        sepeda2.setRoda(2);
        sepeda2.setWarna("putih");
        sepeda2.setJmlSadel(2);
        sepeda2.setJmlGir(5);

        // Tampilkan data per objek
        System.out.println("Data Truk 1: " + truk1.getWarna() + ", " + truk1.getBahanBakar() + ", " + truk1.getKapasitasMesin() + ", " + truk1.getMuatanMaks());
        System.out.println("Data Truk 2: " + truk2.getWarna() + ", " + truk2.getBahanBakar() + ", " + truk2.getKapasitasMesin() + ", " + truk2.getMuatanMaks());
        System.out.println("Data Taksi 1: " + taksi1.getWarna() + ", " + taksi1.getBahanBakar() + ", " + taksi1.getKapasitasMesin() + ", " + taksi1.getTarifAwal() + ", " + taksi1.getTarifPerKm());
        System.out.println("Data Taksi 2: " + taksi2.getWarna() + ", " + taksi2.getBahanBakar() + ", " + taksi2.getKapasitasMesin() + ", " + taksi2.getTarifAwal() + ", " + taksi2.getTarifPerKm());
        System.out.println("Data Sepeda 1: " + sepeda1.getWarna() + ", " + sepeda1.getJmlSadel() + ", " + sepeda1.getJmlGir());
        System.out.println("Data Sepeda 2: " + sepeda2.getWarna() + ", " + sepeda2.getJmlSadel() + ", " + sepeda2.getJmlGir());
    }
}

