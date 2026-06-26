public class Mahasiswa23 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa23() {
    }

    public Mahasiswa23(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println(nama);
        System.out.println(nim);
        System.out.println(kelas);
        System.out.println(ipk);
        System.out.println();
    }
}