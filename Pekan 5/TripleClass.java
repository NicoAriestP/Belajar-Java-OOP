import java.util.ArrayList;

// Class Person
class Person {
    private String nama;
    private int umur;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getUmur() {
        return umur;
    }
}

// Class Book
class Book {
    private String judul;
    private String penulis;
    private int tahunTerbit;

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getJudul() {
        return judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }
}

// Class Library
class Library {
    private String namaPerpustakaan;
    private ArrayList<Book> daftarBuku = new ArrayList<>();

    public void setNamaPerpustakaan(String namaPerpustakaan) {
        this.namaPerpustakaan = namaPerpustakaan;
    }

    public String getNamaPerpustakaan() {
        return namaPerpustakaan;
    }

    public void tambahBuku(Book buku) {
        daftarBuku.add(buku);
    }

    public Book cariBuku(String judul) {
        for (Book buku : daftarBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                return buku;
            }
        }
        return null;
    }

    public ArrayList<Book> daftarBukuTertentu(String penulis) {
        ArrayList<Book> bukuPenulis = new ArrayList<>();
        for (Book buku : daftarBuku) {
            if (buku.getPenulis().equalsIgnoreCase(penulis)) {
                bukuPenulis.add(buku);
            }
        }
        return bukuPenulis;
    }

    public ArrayList<Book> daftarSemuaBuku() {
        return daftarBuku;
    }
}

public class TripleClass {
    public static void main(String[] args) {
        // Membuat objek Person
        Person person = new Person();
        person.setNama("John");
        person.setUmur(30);

        // Membuat objek Book
        Book book1 = new Book();
        book1.setJudul("Pride and Prejudice");
        book1.setPenulis("Jane Austen");
        book1.setTahunTerbit(1813);

        Book book2 = new Book();
        book2.setJudul("To Kill a Mockingbird");
        book2.setPenulis("Harper Lee");
        book2.setTahunTerbit(1960);

        // Membuat objek Library
        Library library = new Library();
        library.setNamaPerpustakaan("Perpustakaan Utama");
        library.tambahBuku(book1);
        library.tambahBuku(book2);

        // Menggunakan objek dan mencetak informasi
        System.out.println("Nama Person: " + person.getNama());
        System.out.println("Umur Person: " + person.getUmur());

        System.out.println("Judul Buku 1: " + book1.getJudul());
        System.out.println("Penulis Buku 1: " + book1.getPenulis());
        System.out.println("Tahun Terbit Buku 1: " + book1.getTahunTerbit());

        System.out.println("Nama Perpustakaan: " + library.getNamaPerpustakaan());

        Book cariBuku = library.cariBuku("To Kill a Mockingbird");
        if (cariBuku != null) {
            System.out.println("Buku ditemukan: " + cariBuku.getJudul());
        } else {
            System.out.println("Buku tidak ditemukan.");
        }

        ArrayList<Book> bukuPenulis = library.daftarBukuTertentu("Jane Austen");
        System.out.println("Daftar buku oleh penulis Jane Austen:");
        for (Book buku : bukuPenulis) {
            System.out.println(buku.getJudul());
        }

        ArrayList<Book> semuaBuku = library.daftarSemuaBuku();
        System.out.println("Daftar semua buku di perpustakaan:");
        for (Book buku : semuaBuku) {
            System.out.println(buku.getJudul());
        }
    }
}
