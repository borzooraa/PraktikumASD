import java.util.Scanner;

public class mahasiwaDemo23 {
    public static void main(String[] args) {
        Scanner kiyah = new Scanner(System.in);
        stackTugasMahasiwa23 stack = new stackTugasMahasiwa23(5);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Mahasiswa pertama mengumpulkan");
            System.out.println("6. Banyak tugas yang dikumpulkan");
            System.out.print("Pilih: ");
            pilih = kiyah.nextInt();
            kiyah.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = kiyah.nextLine();
                    System.out.print("NIM: ");
                    String nim = kiyah.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = kiyah.nextLine();
                    mahasiswa23 mhs = new mahasiswa23(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    mahasiswa23 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100: ");
                        int nilai = kiyah.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalkeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: "+biner);
                    }
                    break;
                case 3:
                    mahasiswa23 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas akhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNim\tKelas");
                    stack.print();
                    break;
                case 5: // menambahkan case baru, untuk melihat mahasiswa yang pertama kali mengumpulkan
                    mahasiswa23 bawah = stack.peekBottom();
                    if (bawah != null) {
                        System.out.println("Mahasiswa yang perta mengumpulkan tugas yaitu: " + bawah.nama);
                    }
                    break;
                case 6: // menambahkan case 6 untuk menapilkan jumlah tugas
                stack.count();
                break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 6); // Mengubah batas yang awalnya dari 1 sampai 5 menjadi 1 sampai 6
    }
}
