import java.util.Scanner;

public class pemilihan23 {
    public static void main(String[] args) {
        Scanner Kiyah = new Scanner(System.in);
        double tugas, kuis, uts, uas, nilaiAkhir = 0;
        System.out.println("===============================================");
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("===============================================");
        System.out.print("Masukkan Nilai Tugas: ");
        tugas = Kiyah.nextDouble();
        System.out.print("Masukkan Nilai Kuis : ");
        kuis = Kiyah.nextDouble();
        System.out.print("Masukkan Nilai UTS  : ");
        uts = Kiyah.nextDouble();
        System.out.print("Masukkan Nilai UAS  : ");
        uas = Kiyah.nextDouble();
        String nilaiHuruf = "";

        if (tugas >= 0 && tugas <= 100 && kuis >= 0 && kuis <= 100 && uts >= 0 && uts <= 100 && uas >= 0
                && uas <= 100) {

            nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.4 * uas);

            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }
            System.out.println("===============================================");
            System.out.println("===============================================");
            System.out.println("Nilai Akhir  : " + nilaiAkhir);
            System.out.println("Nilai Huruf  : " + nilaiHuruf);
            System.out.println("===============================================");
            System.out.println("===============================================");
            if (nilaiHuruf == "D" || nilaiHuruf == "E") {
                System.out.println("ANDA TIDAK LULUS SEMESTER");
            } else {
                System.out.println("SELAMAT ANDA LULUS");
            }
        } else {
            System.out.println("nilai tidak valid");
        }

        Kiyah.close();
    }

}