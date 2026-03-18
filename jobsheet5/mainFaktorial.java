package jobsheet5;

import java.util.Scanner;

public class mainFaktorial {
    public static void main(String[] args) {
        Scanner kiyah = new Scanner (System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = kiyah.nextInt();

        faktorial23 fk = new faktorial23();
        System.out.println("Nilai faktorial "+nilai+" menggunakan BF: "+fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial "+nilai+" menggunakan IDC: "+fk.faktorialDC(nilai));
    }
}
