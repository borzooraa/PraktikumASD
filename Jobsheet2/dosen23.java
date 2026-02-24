public class dosen23 {
    String idDosen, nama, bidangKeahlian;
    boolean statusAktif;
    int tahunBergabung;

    dosen23() {

    }

    dosen23(String idDsn, String nm, String bdKeahlian, boolean status, int thnGabung) {
        idDosen = idDsn;
        nama = nm;
        bidangKeahlian = bdKeahlian;
        statusAktif = status;
        tahunBergabung = thnGabung;
    }

    public void setStatusAktif(boolean statusAktif) {
        this.statusAktif = statusAktif;
    }
    void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
    }
    
    int hitungMasaKerja(int thnSkrng) {
        return thnSkrng - tahunBergabung;
    }
    
    void tampilkanInformasi() {
        System.out.println("id dosen: " + idDosen);
        System.out.println("nama: " + nama);
        System.out.println("bidang keahlian: " + bidangKeahlian);
        System.out.println("Status aktif: " + statusAktif);
        System.out.println("Tahun bergabung: " + tahunBergabung);
    }
}
