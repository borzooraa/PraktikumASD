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
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            System.out.println("Kode                  : " + arrayOfDosen[i].kode);
            System.out.println("Nama                  : " + arrayOfDosen[i].nama);
            String gender =  arrayOfDosen[i].jenisKelamin==true?"P":"L";
            System.out.println("Jenis Kelamin(P/L)    : " + gender);
            System.out.println("Usia                  : " + arrayOfDosen[i].usia);
            System.out.println("--------------------------------------");
        }
    }
}
