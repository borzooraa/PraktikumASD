import java.util.Scanner;

public class mainSurat23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stackSurat23 st = new stackSurat23(10);
        int pilih;

        do {
            System.out.println("\n--- MENU SURAT IZIN ---");
            System.out.println("1. Terima Surat Izin\n2. Proses Surat Izin\n3. Lihat Surat Terakhir\n4. Cari Surat\n5. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: "); String id = sc.nextLine();
                    System.out.print("Nama: "); String nama = sc.nextLine();
                    System.out.print("Kelas: "); String kls = sc.nextLine();
                    System.out.print("Jenis (S/I): "); char jns = sc.next().charAt(0);
                    System.out.print("Durasi: "); int dur = sc.nextInt();
                    st.push(new surat23(id, nama, kls, jns, dur));
                    break;
                case 2:
                    surat23 p = st.pop();
                    if (p != null) System.out.println("Surat " + p.namaMahasiswa + " diproses.");
                    else System.out.println("Stack kosong.");
                    break;
                case 3:
                    surat23 t = st.peek();
                    if (t != null) System.out.println("Surat teratas: " + t.namaMahasiswa);
                    break;
                case 4:
                    System.out.print("Cari Nama: ");
                    st.cariSurat(sc.nextLine());
                    break;
            }
        } while (pilih != 5);
    }
}