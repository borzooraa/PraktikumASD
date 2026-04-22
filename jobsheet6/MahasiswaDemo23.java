import java.util.Scanner;

public class MahasiswaDemo23 {
        public static void main(String[] args) {
        MahasiswaBerprestasi23 list= new MahasiswaBerprestasi23();
        Scanner kiyah= new Scanner(System.in);
        int jumMhs= 5;
        
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-"+(i+1));
            System.out.print("NIM   : ");
            String nim= kiyah.nextLine();
            System.out.print("Nama  : ");
            String nama= kiyah.nextLine();
            System.out.print("Kelas : ");
            String kelas=kiyah.nextLine();
            System.out.print("IPK   : ");
            double ipk= kiyah.nextDouble();
            kiyah.nextLine();
            System.out.println("---------------------------");
            list.tambah(new Mahasiswa23(nim, nama, kelas, ipk));
        }

        list.tampil();
        //cari data sequential
        System.out.println("--------------------------------");
        System.out.println("Pencarian data");
        System.out.println("--------------------------------");
        System.out.println("Masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari= kiyah.nextDouble();

        System.out.println("Menggunakan sequential searching");
        int posisi= list.sequentialSearching(cari);
        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);}
}
