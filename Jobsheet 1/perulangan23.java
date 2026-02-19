import java.util.Scanner;

public class perulangan23 {
    public static void main(String[] args) {
         Scanner Kiyah = new Scanner(System.in);

        System.out.print("Input NIM: ");
        long nim = Kiyah.nextLong();

        int n = (int)(nim % 100); 

        if (n < 10) {
            n+=10;
        }

        for (int i = 1; i <= n; i++) {

            if (i == 10 || i == 15) {
                continue;
            }

            if (i % 3 == 0) {
                System.out.print("# ");
            } else if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
          Kiyah.close();
    }
}
