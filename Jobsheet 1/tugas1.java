import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner Kiyah = new Scanner(System.in);

        System.out.print("Masukkan kode plat mobil: ");
        char input = Kiyah.next().charAt(0);
        char kode[] = {
                'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'
        };
        char kota[][] = {
                { 'B', 'A', 'N', 'T', 'E', 'N' },
                { 'J', 'A', 'K', 'A', 'R', 'T', 'A' },
                { 'B', 'A', 'N', 'D', 'U', 'N', 'G' },
                { 'C', 'I', 'R', 'E', 'B', 'O', 'N' },
                { 'B', 'O', 'G', 'O', 'R' },
                { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
                { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' },
                { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' },
                { 'M', 'A', 'L', 'A', 'N', 'G' },
                { 'T', 'E', 'G', 'A', 'L' }
        };
        String namaKota = "";
        for (int i = 0; i < kode.length; i++) {
            if (input == kode[i]) {
                for (int j = 0; j < kota[i].length; j++) {
                    namaKota += kota[i][j];
                }
                System.out.println("Kota dengan kode plat " + kode[i] + ": " + namaKota);
                break;
            }
        }
        if (namaKota == "") {
            System.out.println("Plat tidak ditemukan");

        }
        Kiyah.close();
    }
}
