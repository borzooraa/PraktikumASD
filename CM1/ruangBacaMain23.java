import java.util.Scanner;

public class ruangBacaMain23 {
    public static void main(String[] args) {
        Scanner kiyah = new Scanner(System.in);

        cmMahasiswa23[] mhs = {
                new cmMahasiswa23("22001", "Andi", "Teknik Informatika"),
                new cmMahasiswa23("22002", "Budi", "Teknik Informatika"),
                new cmMahasiswa23("22003", "Citra", "Sistem Informasi Bisnis"),
        };

        cmBuku23[] buku = {
                new cmBuku23("B001", "Algoritma", 2020),
                new cmBuku23("B002", "Basis Data", 2019),
                new cmBuku23("B003", "Pemrograman", 2021),
                new cmBuku23("B004", "Fisika", 2024)
        };

        cmPeminjaman23[] pinjam = {
                new cmPeminjaman23(mhs[0], buku[0], 7),
                new cmPeminjaman23(mhs[1], buku[1], 3),
                new cmPeminjaman23(mhs[2], buku[2], 10),
                new cmPeminjaman23(mhs[2], buku[2], 6),
                new cmPeminjaman23(mhs[0], buku[0], 4),
        };
        int pilih;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tampilkan Data Mahasiswa & Buku");
            System.out.println("2. Tampilkan Data Peminjaman");
            System.out.println("3. Hitung Denda");
            System.out.println("4. Urutkan Denda (Insertion Sort)");
            System.out.println("5. Cari Berdasarkan NIM (Binary Search)");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = kiyah.nextInt();

            if (pilih == 1) {
                System.out.println("\nDaftar Mahasiswa");
                for (int i = 0; i < mhs.length; i++) {
                    mhs[i].tampilMahasiswa();
                }
            } else if (pilih == 2) {
                System.out.println("\nDaftar Buku:");
                for (int i = 0; i < buku.length; i++) {
                    buku[i].tampilBuku();
                }
            } else if (pilih == 3) {
                System.out.println("\nData Peminjaman");
                for (int i = 0; i < pinjam.length; i++) {
                    pinjam[i].tampil();
                }
            } else if (pilih == 4) {
                for (int i = 1; i < pinjam.length; i++) {
                    cmPeminjaman23 temp = pinjam[i];
                    int j = i - 1;

                    while (j >= 0 && pinjam[j].denda < temp.denda) {
                        pinjam[j + 1] = pinjam[j];
                        j--;
                    }
                    pinjam[j + 1] = temp;
                }
                System.out.println("\nSetelah di urutkan");
                for (int i = 0; i < pinjam.length; i++) {
                    pinjam[i].tampil();
                }
            } else if (pilih == 5) {
                kiyah.nextLine();
                System.out.print("Masukkan NIM:");
                String input = kiyah.nextLine();

                for (int i = 0; i < pinjam.length; i++) {
                    if (pinjam[i].mhs.nim.equalsIgnoreCase(input)) {
                        pinjam[i].tampil();
                    }
                }
            }
        } while (pilih != 0);
    }
}
