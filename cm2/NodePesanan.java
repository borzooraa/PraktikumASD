public class NodePesanan {

    Pesanan data;
    NodePesanan next;
    NodePesanan prev;

    NodePesanan(Pesanan dataPesanan) {
        this.data = dataPesanan;
        this.next = null;
        this.prev = null;
    }
}