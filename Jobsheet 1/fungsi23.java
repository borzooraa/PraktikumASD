public class fungsi23 {
    static int stok[][] = { { 10, 5, 15, 7 },
            { 6, 11, 9, 12 },
            { 2, 10, 10, 5 },
            { 5, 7, 12, 9 } };

    public static void main(String[] args) {
        pendapatanPerCabang();
    }

    public static void pendapatanPerCabang() {
        int harga[] = { 75000, 50000, 60000, 10000 };
        System.out.println("===================================================");
        System.out.println("               PENDAPATAN PER CABANG               ");
        System.out.println("===================================================");
        for (int i = 0; i < stok.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stok[i].length; j++) {
                pendapatan += stok[i][j] * harga[j];
            }
            String status = pendapatan > 1500000 ? "Sangat Baik" : "Perlu Evaluasi";
            System.out.println("RoyalGarden" + (i + 1) + ": " + pendapatan + "  (" + status + ")");
        }
    }
}
