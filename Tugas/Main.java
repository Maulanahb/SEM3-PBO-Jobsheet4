public class Main {
    public static void main(String[] args) {
        // Buat Buku
        Buku b1 = new Buku("Pemrograman Java", "Pak Andi", "12345");
        Buku b2 = new Buku("Database SQL", "Bu Sari", "67890");

        // Buat Anggota
        Anggota a1 = new Anggota("Budi", "2141720001");

        // Anggota pinjam buku
        a1.pinjamBuku(b1, "17-09-2025", "24-09-2025");
        a1.pinjamBuku(b2, "17-09-2025", "24-09-2025");

        // Lihat daftar peminjaman anggota
        a1.lihatDaftar();
    }
}

