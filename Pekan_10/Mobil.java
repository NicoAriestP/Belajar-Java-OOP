package Pekan_10;

public class Mobil extends Kendaraan {
    private String bahanBakar;
    private int kapasitasMesin;
    private int tarifAwal;
    private int tarifPerKm;

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    public String getBahanBakar() {
        return this.bahanBakar;
    }

    public void setKapasitasMesin(int kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }

    public int getKapasitasMesin() {
        return this.kapasitasMesin;
    }

    public void setTarifAwal(int tarifAwal){
        this.tarifAwal = tarifAwal;
    }

    public int getTarifAwal(){
        return this.tarifAwal;
    }

    public void setTarifPerKm(int tarifPerKm){
        this.tarifPerKm = tarifPerKm;
    }

    public int getTarifPerKm(){
        return this.tarifPerKm;
    }
}
