public class sortingMain23 {
    public static void main(String[] args) {
        int a[] = { 20, 10, 2, 7, 12 };
        sorting23 dataUrut1 = new sorting23(a, a.length);

        System.out.println("Data Awal 1");
        dataUrut1.tampil();
        dataUrut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataUrut1.tampil();

        int b[] = { 30, 20, 2, 8, 14 };
        sorting23 dataUrut2 = new sorting23(b, b.length);

        System.out.println("\nData Awal 2");
        dataUrut2.tampil();
        dataUrut2.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataUrut2.tampil();
    }
}
