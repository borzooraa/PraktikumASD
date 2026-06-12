public class QueueAntrian {

    NodeAntrian head;
    NodeAntrian tail;
    int number;

    QueueAntrian() {
        head = null;
        tail = null;
        number = 0;
    }

    boolean queueIsEmpty() {
        if (head == null) {
            return true;
        }

        return false;
    }

    void add(Pembeli dataPembeli) {
        NodeAntrian newAntrian = new NodeAntrian(dataPembeli, ++number);

        if (!queueIsEmpty()) {
            tail.next = newAntrian;
            newAntrian.prev = tail;
            tail = newAntrian;
        } else {
            head = newAntrian;
            tail = newAntrian;
        }

        System.out.println(
                "Antrian berhasil ditambahkan dengan nomor "
                        + number
        );
    }

    Pembeli pop() {
        if (queueIsEmpty()) {
            System.out.println("Antrian masih kosong");
            return null;
        }

        NodeAntrian temp = head;

        if (head.next == null) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        return temp.data;
    }

    void printQueue() {
        if (queueIsEmpty()) {
            System.out.println("Antrian masih kosong");
            return;
        }

        System.out.println("===============================");
        System.out.println("Daftar Antrian pembeli");
        System.out.println("===============================");
        System.out.printf(
                "%-20s %-20s %-20s%n",
                "No Antrian",
                "Nama",
                "No HP"
        );

        NodeAntrian tmp = head;

        while (tmp != null) {
            System.out.printf("%-21d", tmp.queueNumber);
            tmp.data.tampilData();
            tmp = tmp.next;
        }
    }
}