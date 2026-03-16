import java.util.Scanner;

public class mataKuliahDemo23 {
    public static void main(String[] args) {
        Scanner kiyah = new Scanner(System.in);
        mata_Kuliah23[] arrayOfMataKuliah23 = new mata_Kuliah23[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < arrayOfMataKuliah23.length; i++) {
            arrayOfMataKuliah23[i] = new mata_Kuliah23();
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMataKuliah23[i].tambahData();
            System.out.println("---------------------------------------");
            
        }
        for (int i = 0; i < arrayOfMataKuliah23.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("---------------------------------------");
        }
    }
}
