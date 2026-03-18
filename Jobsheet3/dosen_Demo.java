import java.util.Scanner;

public class dosen_Demo {
    public static void main(String[] args) {
        Scanner kiyah = new Scanner(System.in);

        dosen_23[] arrayOfDosen = new dosen_23[3];
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Masukkan data dosen-ke" + (1 + i));
            System.out.print("Kode                : ");
            String kode = kiyah.nextLine();
            System.out.print("Nama                : ");
            String nama = kiyah.nextLine();
            System.out.print("Jenis Kelamin(P/L)  : ");
            String Gender = kiyah.next();
            boolean jenisKelamin = true;
            if (Gender.equalsIgnoreCase("L")) {
                jenisKelamin = false;
            }
            System.out.print("Usia                : ");
            int usia = kiyah.nextInt();
            kiyah.nextLine();
            System.out.println("--------------------------------------");
            arrayOfDosen[i] = new dosen_23(kode, nama, jenisKelamin, usia);
        }
        int counter = 1;
        for (dosen_23 dosen_23 : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + counter);
            System.out.println("Kode                  : " + dosen_23.kode);
            System.out.println("Nama                  : " + dosen_23.nama);
            String gender = dosen_23.jenisKelamin == true ? "Wanita" : "Pria";
            System.out.println("Jenis Kelamin(P/L)    : " + gender);
            System.out.println("Usia                  : " + dosen_23.usia);
            System.out.println("--------------------------------------");
            counter++;

        }
    }
}
