public class Buku {
    String judul;
    String penulis;
    String isbn;
    boolean statusDipinjam;
    // Konstruktor
    public Buku(String judul, String penulis, String isbn) {
        this.judul = judul;
        this.penulis = penulis;
        this.isbn = isbn;
        this.statusDipinjam = false; // Buku awalnya tidak dipinjam
    }
    public void tampilkanInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("ISBN: " + isbn);
        System.out.println("Status Dipinjam: " + (statusDipinjam ? "Ya" : "Tidak"));
    }
    public void setDipinjam() {
        statusDipinjam=true;
    }
    public void setTersedia() {
        statusDipinjam=false;
    }
}

