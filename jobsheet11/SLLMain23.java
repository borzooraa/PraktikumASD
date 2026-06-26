public class SLLMain23 {
    public static void main(String[] args) {
        SingleLinkedList23 sll = new SingleLinkedList23();

        Mahasiswa23 mhs1 = new Mahasiswa23("21212203", "Dirga", "40", 3.6);
        Mahasiswa23 mhs2 = new Mahasiswa23("22212202", "Cintia", "3C", 3.5);
        Mahasiswa23 mhs3 = new Mahasiswa23("23212201", "Bimon", "2B", 3.8);
        Mahasiswa23 mhs4 = new Mahasiswa23("24212200", "Alvaro", "1A", 4.0);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        System.out.println("data index 1: ");
        sll.getData(1);
        System.out.println("data mahasiswa an Bimon berada pada index: " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}

// import java.util.Scanner;

// public class SLLMain23 {
// public static void main(String[] args) {
// Scanner kiyah = new Scanner(System.in);
// SingleLinkedList23 sll = new SingleLinkedList23();

// System.out.println("--- Input Data Mahasiswa ---");
// System.out.print("NIM : ");
// String nim = kiyah.nextLine();
// System.out.print("Nama : ");
// String nama = kiyah.nextLine();
// System.out.print("Kelas : ");
// String kelas = kiyah.nextLine();
// System.out.print("IPK : ");
// double ipk = kiyah.nextDouble();

// Mahasiswa23 mhsBaru = new Mahasiswa23(nim, nama, kelas, ipk);
// sll.addFirst(mhsBaru);

// System.out.println("\n--- Hasil Setelah Input ---");
// sll.print();

// kiyah.close();
// }
// }