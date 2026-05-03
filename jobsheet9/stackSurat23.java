public class stackSurat23 {
    surat23[] stack;
    int size, top;

    public stackSurat23(int size) {
        this.size = size;
        stack = new surat23[size];
        top = -1;
    }

    public void push(surat23 s) {
        if (top < size - 1) {
            stack[++top] = s;
        } else {
            System.out.println("Stack Penuh!");
        }
    }

    public surat23 pop() {
        if (top != -1) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong.");
            return null;
        }
    }

    public surat23 peek() {
        if (top != -1) {
            return stack[top];
        }
        return null;
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan! Milik: " + stack[i].namaMahasiswa);
                System.out.println("ID: " + stack[i].idSurat + " | Jenis: " + stack[i].jenisIzin + " | Durasi: " + stack[i].durasi + " hari");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
    }
}