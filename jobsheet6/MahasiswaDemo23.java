import java.util.Scanner;

public class MahasiswaDemo23 {
        public static void main(String[] args) {
            Scanner kiyah= new Scanner(System.in);
            System.out.print("Masukkan jumlah mahasiswa: ");
            int jumMhs=kiyah.nextInt();
            kiyah.nextLine();
            MahasiswaBerprestasi23 list= new MahasiswaBerprestasi23(jumMhs);
        
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
        System.out.println("-------------------------------");
        System.out.println("Menggunakan binary search");
        int posisi= list.findBinarySearch(cari, 0, jumMhs-1);
        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);}
}
