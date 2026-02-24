public class mataKuliahMain {
    public static void main(String[] args) {
         mataKuliah23 mk1= new mataKuliah23();
        mk1.jlhJam=4;
        mk1.kodeMK="PJ6";
        mk1.nama="Praktikum Algoritma dan Basis Data";
        mk1.sks=3;

        mk1.tampilInformasi();
        mk1.kurangiJam(3);
        mk1.tambahJam(2);
        mk1.ubahSKS(4);
        mk1.tampilInformasi();

        System.out.println();
        
        mataKuliah23 mk2= new mataKuliah23("PK3", "Agama", 2, 4);
        mk2.tampilInformasi();
        mk2.kurangiJam(5);
        mk2.tambahJam(1);
        mk2.ubahSKS(4);
        mk2.tampilInformasi();
    }
}
