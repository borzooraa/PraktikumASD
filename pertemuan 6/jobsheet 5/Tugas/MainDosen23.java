import java.util.Scanner;

public class MainDosen23 {
    static DataDosen23 arrayDosen = new DataDosen23();
    static Scanner kiyah = new Scanner(System.in);

    static void tambahDosen() {
        kiyah.nextLine();
        System.out.println("\n====TAMBAHKAN DOSEN====");
        System.out.print("Kode: ");
        String kode = kiyah.nextLine();
        System.out.print("Nama: ");
        String nama = kiyah.nextLine();
        System.out.print("Perempuan? (true/false): ");
        boolean jk = kiyah.nextBoolean();
        System.out.print("Usia: ");
        int usia = kiyah.nextInt();
        Dosen23 dosenBaru = new Dosen23(kode, nama, jk, usia);
        arrayDosen.tambah(dosenBaru);
    }

    public static void main(String[] args) {
        int menu;
        while (true) {
            System.out.println("====MENU DOSEN====");
            System.out.println("1. Tambah data dosen");
            System.out.println("2. Tampilkan data dosen");
            System.out.println("3. Urutkan ASC");
            System.out.println("4. Urutkan DESC (selection)");
            System.out.println("5. Urutkan DESC (insertion)");
            System.out.print("Pilih: ");
            menu=kiyah.nextInt();
            if (menu==1) {
                tambahDosen();
            }else if (menu==2) {
                arrayDosen.tampil();
            }else if (menu==3) {
                arrayDosen.SortingASC();
                arrayDosen.tampil();
            }else if (menu==4) {
                arrayDosen.sortingDSC();
                arrayDosen.tampil();
            }else if (menu==5) {
                arrayDosen.insertionSortDESC();
                arrayDosen.tampil();
            }
            else{
                break;
            }
        }
    }
}