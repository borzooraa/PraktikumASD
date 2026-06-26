import java.util.Scanner;

public class MainKRS23 {
    public static void main(String[] args) {
        Scanner kiyah = new Scanner(System.in);

        AntrianKRS23 antrian = new AntrianKRS23(10);

        int pilih;

        do {
            System.out.println("\n=== MENU KRS ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Proses KRS (2 mahasiswa)");
            System.out.println("3. Tampilkan Semua");
            System.out.println("4. Lihat 2 Terdepan");
            System.out.println("5. Lihat Antrian Akhir");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Jumlah Sudah Proses");
            System.out.println("8. Jumlah Belum Proses");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = kiyah.nextInt();
            kiyah.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = kiyah.nextLine();

                    System.out.print("Nama  : ");
                    String nama = kiyah.nextLine();

                    System.out.print("Prodi : ");
                    String prodi = kiyah.nextLine();

                    System.out.print("Kelas : ");
                    String kelas = kiyah.nextLine();

                    Mahasiswa23 mhs = new Mahasiswa23(nim, nama, prodi, kelas);
                    antrian.enqueue(mhs);
                    break;

                case 2:
                    antrian.prosesKRS();
                    break;

                case 3:
                    antrian.tampilSemua();
                    break;

                case 4:
                    antrian.lihatDuaDepan();
                    break;

                case 5:
                    antrian.lihatAkhir();
                    break;

                case 6:
                    antrian.jumlahAntrian();
                    break;

                case 7:
                    antrian.jumlahSudahProses();
                    break;

                case 8:
                    antrian.belumProses();
                    break;

                case 9:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Pilihan salah");
            }

        } while (pilih != 0);
    }
}