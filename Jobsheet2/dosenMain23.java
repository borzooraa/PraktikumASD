public class dosenMain23 {
    public static void main(String[] args) {
        dosen23 dsn1 = new dosen23();
        dsn1.bidangKeahlian = "Praktikum Algoritma dan Basis Data";
        dsn1.idDosen = "PJ7";
        dsn1.nama = "Pak Imam";
        dsn1.statusAktif = false;
        dsn1.tahunBergabung = 2006;
        dsn1.tampilkanInformasi();
        dsn1.setStatusAktif(true);
        System.out.println("Lama Masa kerja: " + dsn1.hitungMasaKerja(2026));
        dsn1.ubahKeahlian("Daspro");
        dsn1.tampilkanInformasi();

        System.out.println();
        dosen23 dsn2 = new dosen23("PK3", "Bu Astri", "Pancasila", true, 2019);
        dsn2.tampilkanInformasi();
        dsn2.setStatusAktif(false);
        System.out.println("Lama Masa kerja: " + dsn2.hitungMasaKerja(2026));
        dsn2.ubahKeahlian("Agama");
        dsn2.tampilkanInformasi();
    }
}
