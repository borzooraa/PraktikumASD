public class nodeRekap {
    Pesanan data;
    nodeRekap next;
    nodeRekap prev;
    
    nodeRekap(Pesanan namaMenu) {
        this.data = namaMenu;
        this.next = null;
        this.prev = null;
}
}