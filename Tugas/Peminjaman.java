import java.util.ArrayList;
public class Peminjaman {
    Anggota anggota;
    ArrayList<Buku> daftarBuku;
    String tanggalPinjam;
    String tanggalKembali;

    public Peminjaman(Anggota anggota, String tanggalPinjam, String tanggalKembali) {
        this.anggota = anggota;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
        this.daftarBuku = new ArrayList<>();
    }
    // Menambahkan buku ke daftar peminjaman
    public void tambahBuku(Buku b) {
        daftarBuku.add(b);
        b.setDipinjam();
    }
    // Menghapus buku dari daftar peminjaman
    public void hapusBuku(Buku b) {
        daftarBuku.remove(b);
        b.setTersedia();
    }
    public void lihatDetail(){
        System.out.println("Peminjaman oleh: " + anggota.nama);
        System.out.println("Tanggal Pinjam : " + tanggalPinjam);
        System.out.println("Tanggal Kembali: " + tanggalKembali);
        System.out.println("Daftar Buku: ");
        for (Buku b : daftarBuku) {
            System.out.println("- " + b.judul);
        }
    }
}