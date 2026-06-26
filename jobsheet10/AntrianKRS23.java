public class AntrianKRS23 {
    Mahasiswa23[] data;
    int front, rear, size, max;
    int sudahProses = 0;
    int totalMaksimal = 30;

    public AntrianKRS23(int n) {
        max = n;
        data = new Mahasiswa23[max];
        front = rear = -1;
        size = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == max;
    }

    void enqueue(Mahasiswa23 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }

            data[rear] = mhs;
            size++;
        }
    }

    void prosesKRS() {
        if (size < 2) {
            System.out.println("Minimal harus ada 2 mahasiswa");
        } else {
            System.out.println("Mahasiswa diproses:");

            for (int i = 0; i < 2; i++) {
                data[front].tampilkanData();
                System.out.println("----------------");

                size--;
                sudahProses++;

                if (size == 0) {
                    front = rear = -1;
                } else {
                    front = (front + 1) % max;
                }
            }
        }
    }

    void tampilSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            int i = front;

            while (true) {
                data[i].tampilkanData();
                System.out.println("----------------");

                if (i == rear) break;
                i = (i + 1) % max;
            }
        }
    }

    void lihatDuaDepan() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2");
        } else {
            System.out.println("2 Antrian Terdepan:");

            data[front].tampilkanData();
            System.out.println("----------------");

            int next = (front + 1) % max;
            data[next].tampilkanData();
        }
    }

    void lihatAkhir() {
        if (!isEmpty()) {
            System.out.println("Antrian terakhir:");
            data[rear].tampilkanData();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    void jumlahAntrian() {
        System.out.println("Jumlah antrian: " + size);
    }

    void jumlahSudahProses() {
        System.out.println("Sudah proses KRS: " + sudahProses);
    }

    void belumProses() {
        System.out.println("Belum proses KRS: " + (totalMaksimal - sudahProses));
    }

    void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }
}