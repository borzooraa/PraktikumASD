import java.util.Scanner;

public class MainDosen23 {
    public static void main(String[] args) {
        Scanner Kiyah = new Scanner(System.in);
        DataDosen23 data = new DataDosen23();
        int pilih;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Sorting ASC (Usia termuda -> tertua)");
            System.out.println("4. Sorting DSC (Usia tertua -> termuda)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = Kiyah.nextInt();
            Kiyah.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Kode        : ");
                    String kd = Kiyah.nextLine();
                    System.out.print("Nama        : ");
                    String nama = Kiyah.nextLine();
                    System.out.print("Jenis Kelamin (true=L / false=P): ");
                    boolean jk = Kiyah.nextBoolean();
                    System.out.print("Usia        : ");
                    int usia = Kiyah.nextInt();
                    Kiyah.nextLine();

                    Dosen23 d = new Dosen23(kd, nama, jk, usia);
                    data.tambah(d);
                    break;

                case 2:
                    data.tampil();
                    break;

                case 3:
                    data.SortingASC();
                    data.tampil();
                    break;

                case 4:
                    data.sortingDSC();
                    data.tampil();
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);
    }
}