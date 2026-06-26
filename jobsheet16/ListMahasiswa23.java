import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMahasiswa23 {
    List<Mahasiswa23> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa23... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa23 mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    int linearSearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    int binarySearch(String nim) {
        mahasiswas.sort((m1, m2) -> m1.nim.compareTo(m2.nim));
        Mahasiswa23 key = new Mahasiswa23(nim, "", "");
        return Collections.binarySearch(mahasiswas, key, (m1, m2) -> m1.nim.compareTo(m2.nim));
    }

    public void sortAscending() {
        mahasiswas.sort((m1, m2) -> m1.nim.compareTo(m2.nim));
    }

    public void sortDescending() {
        mahasiswas.sort((m1, m2) -> m2.nim.compareTo(m1.nim));
    }

    public static void main(String[] args) {
        ListMahasiswa23 lm = new ListMahasiswa23();
        Mahasiswa23 m = new Mahasiswa23("223234", "Noureen", "021xx1");
        Mahasiswa23 m1 = new Mahasiswa23("223235", "Akhleema", "021xx2");
        Mahasiswa23 m2 = new Mahasiswa23("223236", "Shannum", "021xx3");

        lm.tambah(m, m1, m2);
        lm.tampil();
        
        System.out.println("");
        lm.update(lm.linearSearch("223235"), new Mahasiswa23("223235", "Akhleema Lela", "021xx2"));
        lm.tampil();
    }
}