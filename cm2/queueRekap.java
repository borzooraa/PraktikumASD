public class queueRekap {
      nodeRekap head;
    nodeRekap tail;


 queueRekap() {
        head = null;
        tail = null;
    }

      boolean queueIsEmpty() {
        if (head == null) {
            return true;
        }

        return false;
    }

void rekapPerOrang(){ //untuk mengecek apakah kosong atau tidak
     if (queueIsEmpty()) {
            System.out.println("Belum ada pembeli");
            return;
        }
 nodeRekap barier = tail;

        while (barier != head) {
            nodeRekap temp = head;

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

    nodeRekap temp = head;

    }
}



