public class MahasiswaNew23 {
    String nim;
    String nama;
    String keperluan;

    public MahasiswaNew23(String nim, String nama, String keperluan) {
        this.nim = nim;
        this.nama = nama;
        this.keperluan = keperluan;
    }

    public void tampilInformasi() {
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Keperluan: " + keperluan);
    }
}