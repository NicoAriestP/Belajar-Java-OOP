package Pekan_10;

public class Truk extends Kendaraan {
    private int muatanMaks;
    private String bahanBakar;
    private int kapasitasMesin;

    public void setMuatanMaks(int muatanMaks) {
        this.muatanMaks = muatanMaks;
    }

    public int getMuatanMaks() {
        return this.muatanMaks;
    }

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
}
