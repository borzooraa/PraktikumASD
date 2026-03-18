package jobsheet5;

import java.util.Scanner;

public class mainSum23 {
    public static void main(String[] args) {
        Scanner kiyah = new Scanner (System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int elemen = kiyah.nextInt();

        sum23 sm = new sum23(elemen);
            for (int i = 0; i < elemen; i++) {
                System.out.print("Masukkan keuntungan ke-"+(i+1)+": ");
                sm.keuntungan[i]=kiyah.nextDouble();
            }
            System.out.println("Total keuntungan menggunakan Bruteforce: "+sm.totalBF());
            System.out.println("Total keuntungan menggunakan devide and Conquer: "+sm.totalDC(sm.keuntungan, 0,elemen-1));
    }
}
