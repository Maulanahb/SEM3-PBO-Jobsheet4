import java.util.ArrayList;
public class Anggota {
    String nama;
    String nim;
    ArrayList<Peminjaman> daftarPeminjaman;

    public Anggota(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
        this.daftarPeminjaman = new ArrayList<>();
    }

    public void pinjamBuku(Buku b, String tglPinjam, String tglKembali) {
        Peminjaman peminjaman = new Peminjaman(this, tglPinjam, tglKembali);
        peminjaman.tambahBuku(b);
        daftarPeminjaman.add(peminjaman);
    }

    public void kembalikanBuku(Buku b) {
        for (Peminjaman p : daftarPeminjaman) {
            if (p.daftarBuku.contains(b)) {
                p.hapusBuku(b);
                break;
            }
        }
    }

    public void lihatDaftar() {
        System.out.println("Daftar peminjaman " + nama + ":");
        for (Peminjaman p : daftarPeminjaman) {
            p.lihatDetail();
        }
    }
}


