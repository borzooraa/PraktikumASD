import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner Kiyah = new Scanner(System.in);

        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int sumJadwal = Kiyah.nextInt();
        Kiyah.nextLine();

        String[][] jadwal = new String[sumJadwal][4];

        for (int i = 0; i < sumJadwal; i++) {
            System.out.println("\nData jadwal ke-" + (i + 1));

            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = Kiyah.nextLine();

            System.out.print("Ruang            : ");
            jadwal[i][1] = Kiyah.nextLine();

            System.out.print("Hari             : ");
            jadwal[i][2] = Kiyah.nextLine();

            System.out.print("Jam              : ");
            jadwal[i][3] = Kiyah.nextLine();
        }

        while (true) {
            System.out.println("1. Lihat Jadwal");
            System.out.println("2. Filter berdasarkan hari");
            System.out.println("3. Cari nama matkul");
            System.out.println("4. Exit");
            System.out.print("Pilih menu diatas: ");
            
            int input = Kiyah.nextInt();
            if (input == 1) {
                tampilkanSemua(jadwal);
            } else if (input == 2) {
                System.out.print("\nMasukkan hari yang dicari: "); 
                Kiyah.nextLine();
                String cariHari = Kiyah.nextLine();
                tampilkanHari(jadwal, cariHari);
            } else if (input == 3) {
                System.out.print("\nMasukkan nama mata kuliah yang dicari: ");
                Kiyah.nextLine();
                String cariMK = Kiyah.nextLine();
                tampilkanMK(jadwal, cariMK);
            }
            else{
                break;
            }

        }

        Kiyah.close();

    }

    static void tampilkanSemua(String[][] jadwal) {
        System.out.printf("%-25s %-20s %-10s %-12s\n",
                "Nama Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("----------------------------------------------------------------");

        for (int i = 0; i < jadwal.length; i++) {
            System.out.printf("%-25s %-20s %-10s %-12s\n",
                    jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
        System.out.println();
    }

    static void tampilkanHari(String[][] jadwal, String hari) {
        System.out.println("\n=== JADWAL HARI " + hari.toUpperCase() + " ===");

        boolean ada = false;
        System.out.printf("%-25s %-20s %-10s %-12s\n",
                "Nama Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("----------------------------------------------------------------");
        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.printf("%-25s %-20s %-10s %-12s\n",
                        jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
                ada = true;
            }
        }

        if (!ada) {
            System.out.println("Tidak ada jadwal pada hari tersebut.");
        }
        System.out.println();
    }

    static void tampilkanMK(String[][] jadwal, String mk) {
        System.out.println("\n=== JADWAL MATA KULIAH " + mk.toUpperCase() + " ===");

        boolean ada = false;

        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mk)) {
                System.out.printf("%-25s %-20s %-10s %-12s\n",
                        jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
                ada = true;
            }
        }

        if (!ada) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
        System.out.println();
    }
}
