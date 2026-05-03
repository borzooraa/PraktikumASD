public class stackTugasMahasiwa23 {
    mahasiswa23[] stack;
    int top;
    int size, count;

    public stackTugasMahasiwa23(int size) {
        this.size = size;
        stack = new mahasiswa23[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(mahasiswa23 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi");
        }
    }

    public mahasiswa23 pop() {
        if (!isEmpty()) {
            mahasiswa23 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public mahasiswa23 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void print() {
        for (int i = top; i >= 0; i--) { // yang diubah pada Percobaan 1 Pertanyaan 1
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    public mahasiswa23 peekBottom() { // menambahkan method untuk dipanggil di mahasiswaDemo23
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    void count() { // membuat method untuk menghitung jumlah tugas, agar bisa dipanggil di class
                   // demo
        if (count == 0) {
            System.out.println("Belum pernah ada tugas yang dikumpulkan");
        } else {
            System.out.println("Total tugas yang dikumpulkan: " + count);
            if (isEmpty()) {
                System.out.println("Stack kosong! Tidak ada tugas yang belum dinilai");
            } else {
                System.out.println("Jumlah tugas yang belum dinilai: " + (top + 1));
            }
        }
    }

    public String konversiDesimalkeBiner(int nilai) {
        stackKonversi stack = new stackKonversi();
        while (nilai != 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
