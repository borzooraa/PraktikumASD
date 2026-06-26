public class Queue23 {
    NodeAntrian23 front;
    NodeAntrian23 rear;
    int size = 0;

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(MahasiswaNew23 data) {
        NodeAntrian23 newNode = new NodeAntrian23(data, null);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println(data.nama + " berhasil masuk ke dalam antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada yang dapat dipanggil.");
        } else {
            System.out.println("Memanggil antrian: ");
            front.data.tampilInformasi();
            front = front.next;
            size--;
            if (front == null) {
                rear = null;
            }
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("=== Antrian Terdepan ===");
            front.data.tampilInformasi();
            System.out.println("=== Antrian Paling Akhir ===");
            rear.data.tampilInformasi();
        }
    }

    public void clear() {
        front = null;
        rear = null;
        size = 0;
        System.out.println("Antrian telah berhasil dikosongkan.");
    }

    public void displayJumlah() {
        System.out.println("Jumlah mahasiswa yang masih mengantre: " + size + " orang.");
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            NodeAntrian23 temp = front;
            System.out.println("=== Daftar Seluruh Antrian ===");
            int no = 1;
            while (temp != null) {
                System.out.print(no + ". ");
                temp.data.tampilInformasi();
                temp = temp.next;
                no++;
            }
        }
    }
}