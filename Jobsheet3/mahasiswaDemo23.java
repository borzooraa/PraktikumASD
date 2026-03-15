import java.util.Scanner;

public class mahasiswaDemo23 {
    public static void main(String[] args) {
        Scanner kiyah = new Scanner(System.in);
        mahasiswa_23[] arrayOfMahasiswa23 = new mahasiswa_23[3];
        String dummy;

        for (int i = 0; i < arrayOfMahasiswa23.length; i++) {
            arrayOfMahasiswa23[i] = new mahasiswa_23();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            arrayOfMahasiswa23[i].nim = kiyah.nextLine();
            System.out.print("Nama  : ");
            arrayOfMahasiswa23[i].nama = kiyah.nextLine();
            System.out.print("Kelas : ");
            arrayOfMahasiswa23[i].kelas = kiyah.nextLine();
            System.out.print("IPK   : ");
            dummy = kiyah.nextLine();
            arrayOfMahasiswa23[i].ipk = Float.parseFloat(dummy);
            System.out.println("---------------------------------------");
        }

        for (int i = 0; i < arrayOfMahasiswa23.length; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("NIM     : " + arrayOfMahasiswa23[i].nim);
            System.out.println("Nama    : " + arrayOfMahasiswa23[i].nama);
            System.out.println("Kelas   : " + arrayOfMahasiswa23[i].kelas);
            System.out.println("IPK     : " + arrayOfMahasiswa23[i].ipk);
            System.out.println("---------------------------------------");
        }
    }
}
