import java.util.Scanner;

public class array23 {
    public static void main(String[] args) {
        Scanner Kiyah = new Scanner(System.in);

        String[] namaMatkul = { "Pancasila", "Konsep Teknologi Informasi", "Critical Thingking dan Problem Solving",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja" };
        int[] sks = { 2, 2, 2, 2, 2, 2, 3, 2 };

        double[] nilaiAngka = new double[namaMatkul.length];
        double[] nilaiSetara = new double[namaMatkul.length];
        String[] nilaiHuruf = new String[namaMatkul.length];

        double totalBobot = 0;
        int totalSKS = 0;

        System.out.println("======================================================================================");
        System.out.println("                           Program Menghitung IP Semester                             ");
        System.out.println("======================================================================================");

        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + namaMatkul[i] + ": ");
            nilaiAngka[i] = Kiyah.nextDouble();

            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4;
            } else if (nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3;
            } else if (nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2;
            } else if (nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1;
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0;
            }

            totalBobot += nilaiSetara[i] * sks[i];
            totalSKS += sks[i];
        }

        double IP = totalBobot / totalSKS;
        System.out.println("\n======================================================================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("======================================================================================");
        System.out.printf("%-40s %-12s %-12s %-12s\n",
                "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("======================================================================================");

        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.printf("%-40s %-12.2f %-12s %-12.2f\n",
                    namaMatkul[i],
                    nilaiAngka[i],
                    nilaiHuruf[i],
                    nilaiSetara[i]);
        }

        System.out.println("======================================================================================");
        System.out.printf("IP : %.2f\n", IP);

        Kiyah.close();

    }
}
