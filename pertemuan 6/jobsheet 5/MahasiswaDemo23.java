import java.util.Scanner;

public class MahasiswaDemo23 {
    public static void main(String[] args) {
        Scanner Kiyah = new Scanner(System.in);
        MahasiswaBerprestasi23 list = new MahasiswaBerprestasi23();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = Kiyah.nextInt();
        Kiyah.nextLine();

        list.listMhs = new Mahasiswa23[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data mahasiswa ke-" + (i+1));

            System.out.print("NIM   : ");
            String nim = Kiyah.nextLine();

            System.out.print("Nama  : ");
            String nama = Kiyah.nextLine();

            System.out.print("Kelas : ");
            String kelas = Kiyah.nextLine();

            System.out.print("IPK   : ");
            double ipk = Kiyah.nextDouble();
            Kiyah.nextLine();

            Mahasiswa23 m = new Mahasiswa23(nim, nama, kelas, ipk);
            list.tambah(m);
            System.out.println();
        }

        System.out.println("\nData mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("\nData mahasiswa setelah sorting (DESC berdasarkan IPK):");
        list.bubbleSort();
        list.tampil();
    }
}