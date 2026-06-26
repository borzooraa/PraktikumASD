public class AntrianLayanan23 {
    Mahasiswa23[] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianLayanan23(int n) {
        max = n;
        data = new Mahasiswa23[max];
        size = 0;
        front = rear = -1;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == max;
    }

    void enqueue(Mahasiswa23 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }

            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil ditambahkan ke antrian");
        }
    }

    Mahasiswa23 dequeue() {
        Mahasiswa23 dt = null;

        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            dt = data[front];
            size--;

            if (size == 0) {
                front = rear = -1;
            } else {
                front = (front + 1) % max;
            }
        }

        return dt;
    }

    void peek() {
        if (!isEmpty()) {
            System.out.println("Antrian terdepan:");
            data[front].tampilkanData();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Daftar antrian:");

            int i = front;
            while (true) {
                data[i].tampilkanData();
                System.out.println("----------------");

                if (i == rear) {
                    break;
                }

                i = (i + 1) % max;
            }
        }
    }

    void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    void getJumlahAntrian() {
        System.out.println("Jumlah antrian saat ini: " + size);
    }

    // tambahan untuk soal pertanyaan

    void lihatAkhir() {
        if (!isEmpty()) {
            System.out.println("Antrian paling belakang:");
            data[rear].tampilkanData();
        } else {
            System.out.println("Antrian kosong");
        }
    }
}