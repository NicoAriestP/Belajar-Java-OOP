public class Siswa {
    int nrp;
    String nama;

    public Siswa(int i) {
        nrp=i;
    }

    public void setNrp(int i) {
        nrp=i;
    }

    public int getNrp() {
        return nrp;
    }
    public void setNama(String i) {
        nama=i;
    }
    public static void main(String args[]) {
        Siswa anak = new Siswa(5);
        anak.setNrp(5);
        anak.setNama("Nico");
        int NrpAnak = anak.getNrp();
        System.out.println(NrpAnak);
        System.out.println(anak.nama);
    }
}

