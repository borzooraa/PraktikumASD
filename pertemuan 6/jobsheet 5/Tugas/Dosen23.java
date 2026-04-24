public class Dosen23 {
    String kode, nama;
    boolean jenisKelamin;
    int usia;

    Dosen23(String kd, String name, boolean jk, int age){
        kode=kd;
        nama=name;
        jenisKelamin=jk;
        usia=age;
    }

    void tampil(){

        System.out.println(
        "| Kode: "+kode+" | Nama: "+nama+" | jenisKelamin: "+(jenisKelamin?"Perempuan":"Laki-laki")+" | Usia: "+usia+" |"
        );
    }
}