public class NodeAntrian {

    Pembeli data;
    NodeAntrian next;
    NodeAntrian prev;
    int queueNumber;

    NodeAntrian(Pembeli dataPembeli, int number) {
        this.data = dataPembeli;
        this.queueNumber = number;

        next = null;
        prev = null;
    }
}