import java.util.Scanner;

public class mata_Kuliah23 {
    Scanner kiyah = new Scanner (System.in);
    public String kode, nama, dummy;
    public int sks, jumlahJam;

    void tambahData(){
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
    }
    void cetakInfo(){
        System.out.println("Kode          : " + kode);
            System.out.println("Nama          : " +nama);
            System.out.println("Sks           : " +sks);
            System.out.println("Jumlah jam    : " + jumlahJam);
    }
}
