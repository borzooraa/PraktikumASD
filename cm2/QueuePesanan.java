public class QueuePesanan {

    NodePesanan head;
    NodePesanan tail;

    QueuePesanan() {
        head = null;
        tail = null;
    }

    boolean queueIsEmpty() {
        if (head == null) {
            return true;
        }

        return false;
    }

    void order(Pesanan dataPesanan) {
        NodePesanan newPesanan = new NodePesanan(dataPesanan);

        if (!queueIsEmpty()) {
            tail.next = newPesanan;
            newPesanan.prev = tail;
            tail = newPesanan;
        } else {
            head = newPesanan;
            tail = newPesanan;
        }

        System.out.println(
                tail.data.dataPembeli.namaPembeli
                        + " telah memesan "
                        + tail.data.namaPesanan
        );
    }

    void reportOrder() {
        if (queueIsEmpty()) {
            System.out.println("Pesanan masih kosong");
            return;
        }

        NodePesanan barier = tail;

        while (barier != head) {
            NodePesanan temp = head;

            while (temp != barier.next) {
                if (temp != barier) {
                    if (temp.data.namaPesanan.compareTo(
                            temp.next.data.namaPesanan) > 0) {

                        Pesanan switchData = temp.data;
                        temp.data = temp.next.data;
                        temp.next.data = switchData;
                    }
                }

                temp = temp.next;
            }

            barier = barier.prev;
        }

        NodePesanan temp = head;

        System.out.printf(
                "%-20s %-20s %-20s%n",
                "No Antrian",
                "Nama",
                "No HP"
        );

        while (temp != null) {
            temp.data.tampilData();
            temp = temp.next;
        }
    }
}