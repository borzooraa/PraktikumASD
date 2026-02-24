public class mataKuliah23 {
    String kodeMK, nama;
    int sks, jlhJam;

    public mataKuliah23() {

    }

    public mataKuliah23(String kodeMatkul, String nm, int sks, int jlhJam) {
        kodeMK = kodeMatkul;
        nama = nm;
        this.sks = sks;
        this.jlhJam = jlhJam;
    }

    void tampilInformasi() {
        System.out.println("Nama matkul: "+nama);
        System.out.println("Kode matkul: "+kodeMK);
        System.out.println("SKS : "+sks);
        System.out.println("Jumlah jam: "+jlhJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
         System.out.println("SKS telah diubah");
    }

    void tambahJam(int jam) {
        jlhJam += jam;
        System.out.println("Jumlah jam sekarang: " + jlhJam);
    }

    void kurangiJam(int jam) {
        if (jlhJam >= jam) {
            jlhJam = jlhJam - jam;
            System.out.println("Jumlah jam sekarang: " + jlhJam);
        } else {
            System.out.println("Pengurangan gagal, jam tidak mencukupi");
        }
    }
}
