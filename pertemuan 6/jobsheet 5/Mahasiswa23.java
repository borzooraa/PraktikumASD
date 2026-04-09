public class Mahasiswa23 {
    String nim, nama, kelas;
    double ipk;

    Mahasiswa23(String NIM, String name, String kls, double ip){
        nim = NIM;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilkanInformasi(){
        System.out.println("Nama: "+nama);
        System.out.println("NIM: "+nim);
        System.out.println("Kelas: "+kelas);
        System.out.println("IPK"+ipk);
    }
}
