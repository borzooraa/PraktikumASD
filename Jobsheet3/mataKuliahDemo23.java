import java.util.Scanner;

public class mataKuliahDemo23 {
    public static void main(String[] args) {
        Scanner kiyah = new Scanner(System.in);
        mata_Kuliah23[] arrayOfMataKuliah23 = new mata_Kuliah23[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < arrayOfMataKuliah23.length; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode        : ");
            kode = kiyah.nextLine();
            System.out.print("Nama        : ");
            nama = kiyah.nextLine();
            System.out.print("Sks         : ");
            dummy = kiyah.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah jam  : ");
            dummy = kiyah.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("---------------------------------------");

            
            arrayOfMataKuliah23[i] = new mata_Kuliah23(kode, nama, sks, jumlahJam);
        }
        for (int i = 0; i < arrayOfMataKuliah23.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode          : " + arrayOfMataKuliah23[i].kode);
            System.out.println("Nama          : " + arrayOfMataKuliah23[i].nama);
            System.out.println("Sks           : " + arrayOfMataKuliah23[i].sks);
            System.out.println("Jumlah jam    : " + arrayOfMataKuliah23[i].jumlahJam);
            System.out.println("---------------------------------------");
        }
    }
}
