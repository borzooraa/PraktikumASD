import java.util.Scanner;

public class mataKuliahDemo23 {
    public static void main(String[] args) {
        Scanner kiyah = new Scanner(System.in);
        int indeks;
        
        System.out.print("Masukkan Jumlah Mata Kuliah: ");
        indeks = kiyah.nextInt();
        mata_Kuliah23[] arrayOfMataKuliah23 = new mata_Kuliah23[indeks];

        for (int i = 0; i < arrayOfMataKuliah23.length; i++) {
            arrayOfMataKuliah23[i] = new mata_Kuliah23();
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMataKuliah23[i].tambahData();
            System.out.println("---------------------------------------");
            
        }
        for (int i = 0; i < arrayOfMataKuliah23.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMataKuliah23[i].cetakInfo();
            System.out.println("---------------------------------------");
        }
    }
}
