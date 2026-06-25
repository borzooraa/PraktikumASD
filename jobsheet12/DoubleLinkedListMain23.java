import java.util.Scanner;

public class DoubleLinkedListMain23 {
    public static Mahasiswa23 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM   : ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama  : ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK   : ");
        double ipk = scan.nextDouble();
        scan.nextLine();
        return new Mahasiswa23(nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DoubleLinkedList23 list = new DoubleLinkedList23();
        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST (TUGAS) =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data setelah NIM tertentu");
            System.out.println("4. Tambah data pada Indeks tertentu");
            System.out.println("5. Hapus data di awal");
            System.out.println("6. Hapus data di akhir");
            System.out.println("7. Hapus data setelah NIM tertentu");
            System.out.println("8. Hapus data pada Indeks tertentu");
            System.out.println("9. Ambil data pertama (getFirst)");
            System.out.println("10. Ambil data terakhir (getLast)");
            System.out.println("11. Ambil data berdasarkan Indeks (getIndex)");
            System.out.println("12. Tampilkan jumlah data saat ini (Size)");
            System.out.println("13. Cetak semua data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1:
                    list.addFirst(inputMahasiswa(scan));
                    break;
                case 2:
                    list.addLast(inputMahasiswa(scan));
                    break;
                case 3:
                    System.out.print("Masukkan NIM acuan: ");
                    String keyNimAdd = scan.nextLine();
                    System.out.println("Masukkan data baru:");
                    list.insertAfter(keyNimAdd, inputMahasiswa(scan));
                    break;
                case 4:
                    System.out.print("Masukkan indeks posisi: ");
                    int idxAdd = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Masukkan data baru:");
                    list.add(idxAdd, inputMahasiswa(scan));
                    break;
                case 5:
                    list.removeFirst();
                    break;
                case 6:
                    list.removeLast();
                    break;
                case 7:
                    System.out.print("Masukkan NIM acuan: ");
                    String keyNimDel = scan.nextLine();
                    list.removeAfter(keyNimDel);
                    break;
                case 8:
                    System.out.print("Masukkan indeks yang dihapus: ");
                    int idxDel = scan.nextInt();
                    scan.nextLine();
                    list.remove(idxDel);
                    break;
                case 9:
                    list.getFirst();
                    break;
                case 10:
                    list.getLast();
                    break;
                case 11:
                    System.out.print("Masukkan indeks yang dicari: ");
                    int idxGet = scan.nextInt();
                    scan.nextLine();
                    list.getIndex(idxGet);
                    break;
                case 12:
                    System.out.println("Jumlah data saat ini (Size): " + list.size());
                    break;
                case 13:
                    list.print();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 0);
        scan.close();
    }
}