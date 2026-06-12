public class cmPeminjaman23 {
    cmMahasiswa23 mhs;
    cmBuku23 buku;
    int lamaPinjam, terlambat, denda;

    cmPeminjaman23(cmMahasiswa23 mhs, cmBuku23 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    public void hitungDenda() { // jawaban sesi 4 no 1
        if (lamaPinjam > 5) {
            terlambat = lamaPinjam - 5;
            denda = terlambat * 2000;
            if (denda >= 20000) {
                denda = 20000;
            }
        } else {
            terlambat = 0;
            denda = 0;
        }
    }

    public void tampil() {
        System.out.println(mhs.nim + " | " + mhs.nama + " | " + buku.judul +
                " | " + lamaPinjam + " | terlambat: " + terlambat +
                " | denda: " + denda);
    }
}