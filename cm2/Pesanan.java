public class Pesanan {

    int kodePesanan;
    int harga;
    Pembeli dataPembeli;
    String namaPesanan;

    Pesanan(int a, String b, int c, Pembeli d) {
        this.kodePesanan = a;
        this.namaPesanan = b;
        this.harga = c;
        this.dataPembeli = d;
    }

    void tampilData() {
        String format = "%-20d %-20s %-20d%n";

        System.out.printf(
                format,
                kodePesanan,
                namaPesanan,
                harga
        );
    }
}