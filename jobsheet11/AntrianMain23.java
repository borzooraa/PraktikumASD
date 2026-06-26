import java.util.Scanner;

public class AntrianMain23 {
    public static void main(String[] args) {
        Scanner kiyah = new Scanner(System.in);
        Queue23 antrian = new Queue23();
        int pilihan;

        do {
            System.out.println("\n=================================");
            System.out.println("LAYANAN UNIT KEMAHASISWAAN");
            System.out.println("=================================");
            System.out.println("1. Tambah Antrian Mahasiswa (Enqueue)");
            System.out.println("2. Panggil Antrian (Dequeue)");
            System.out.println("3. Tampilkan Antrian Terdepan & Akhir");
            System.out.println("4. Tampilkan Jumlah Pengantre");
            System.out.println("5. Tampilkan Semua Daftar Antrian");
            System.out.println("6. Kosongkan Antrian");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu (1-7): ");
            pilihan = kiyah.nextInt();
            kiyah.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM       : ");
                    String nim = kiyah.nextLine();
                    System.out.print("Masukkan Nama      : ");
                    String nama = kiyah.nextLine();
                    System.out.print("Masukkan Keperluan : ");
                    String keperluan = kiyah.nextLine();
                    MahasiswaNew23 mhs = new MahasiswaNew23(nim, nama, keperluan);
                    antrian.enqueue(mhs);
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.peek();
                    break;
                case 4:
                    antrian.displayJumlah();
                    break;
                case 5:
                    antrian.printQueue();
                    break;
                case 6:
                    antrian.clear();
                    break;
                case 7:
                    System.out.println("Terima kasih, program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 7);

        kiyah.close();
    }
}