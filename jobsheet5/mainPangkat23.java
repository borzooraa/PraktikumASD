package jobsheet5;

import java.util.Scanner;

public class mainPangkat23 {
    public static void main(String[] args) {
        Scanner kiyah = new Scanner (System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = kiyah.nextInt();

        pangkat23[] png = new pangkat23[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai basis elemen ke-"+(i+1)+": ");
            int basis = kiyah.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-"+(i+1)+": ");
            int pangkat = kiyah .nextInt();
            png[i]=new pangkat23(basis, pangkat);
        }
        System.out.println("HASIL PANGKAT BRUTEFORCE: ");
        for (pangkat23 p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatBF());
        }
        System.out.println("HASIL PANGKAT DEVIDE AND CONQUER: ");
        for (pangkat23 p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}
