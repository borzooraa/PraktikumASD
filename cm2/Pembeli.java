public class Pembeli {
    String namaPembeli;
    String NoHp;

    Pembeli(String b, String c) {
        this.namaPembeli = b;
        this.NoHp = c;
    }

    public void tampilData() {
        String format = "%-20s %-20s%n";
        System.out.printf(format, namaPembeli, NoHp);
    }
}