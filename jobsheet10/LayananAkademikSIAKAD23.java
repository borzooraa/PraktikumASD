import java.util.Scanner;

public class LayananAkademikSIAKAD23 {
    public static void main(String[] args) {
        Scanner kiyah = new Scanner(System.in);

        AntrianLayanan23 antrian = new AntrianLayanan23(5);

        int pilihan;

        do {
            System.out.println("\n=== MENU ANTRIAN AKADEMIK ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Cek Antrian Depan");
            System.out.println("4. Tampilkan Semua");
            System.out.println("5. Jumlah Antrian");
            System.out.println("6. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = kiyah.nextInt();
            kiyah.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM   : ");
                    String nim = kiyah.nextLine();

                    System.out.print("Masukkan Nama  : ");
                    String nama = kiyah.nextLine();

                    System.out.print("Masukkan Prodi : ");
                    String prodi = kiyah.nextLine();

                    System.out.print("Masukkan Kelas : ");
                    String kelas = kiyah.nextLine();

                    Mahasiswa23 mhs = new Mahasiswa23(nim, nama, prodi, kelas);
                    antrian.enqueue(mhs);
                    break;

                case 2:
                    Mahasiswa23 keluar = antrian.dequeue();

                    if (keluar != null) {
                        System.out.println("Mahasiswa dipanggil:");
                        keluar.tampilkanData();
                    }
                    break;

                case 3:
                    antrian.peek();
                    break;

                case 4:
                    antrian.print();
                    break;

                case 5:
                    antrian.getJumlahAntrian();
                    break;

                case 6:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }

        } while (pilihan != 0);
    }
}