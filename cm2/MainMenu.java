import java.util.Scanner;

public class MainMenu {

    static void menu() {
        System.out.println("===============================");
        System.out.println("SISTEM ANTRIAN ROYAL DELISH");
        System.out.println("===============================");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antrian dan Pesan");
        System.out.println("4. Laporan Pesanan");
        System.out.println("5. Rekap");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu : ");
    }

    public static void main(String[] args) {
        Scanner kiyah = new Scanner(System.in);

        QueueAntrian antrian = new QueueAntrian();
        QueuePesanan pesanan = new QueuePesanan();

        int pilihan = -1;

        while (pilihan != 0) {
            menu();

            pilihan = kiyah.nextInt();
            kiyah.nextLine();

            switch (pilihan) {
                case 1 -> {
                    System.out.print("Nama Pembeli  : ");
                    String nama = kiyah.nextLine();

                    System.out.print("No HP         : ");
                    String noHP = kiyah.nextLine();

                    Pembeli dataPembeli = new Pembeli(nama, noHP);
                    antrian.add(dataPembeli);
                }

                case 2 -> antrian.printQueue();

                case 3 -> {
                    if (antrian.queueIsEmpty()) {
                        System.out.println("Antrian masih kosong, tidak bisa membuat pesanan");
                        break;
                    }

                    System.out.print("Kode Pesanan  : ");
                    int kodePesanan = kiyah.nextInt();
                    kiyah.nextLine();

                    System.out.print("Nama Pesanan  : ");
                    String namaPesanan = kiyah.nextLine();

                    System.out.print("Harga         : ");
                    int harga = kiyah.nextInt();
                    kiyah.nextLine();

                    Pesanan dataPesanan = new Pesanan(
                            kodePesanan,
                            namaPesanan,
                            harga,
                            antrian.pop());

                    pesanan.order(dataPesanan);
                }

                case 4 -> pesanan.reportOrder();

                case 5 -> pesanan.rekapPerOrang(); //memanggil class untuk printout rekap ordernper orang

                case 0 -> {
                    kiyah.close();
                    return;
                }

                default -> System.out.println("Pilihan tidak valid");
            }
        }
        kiyah.close();
    }
}