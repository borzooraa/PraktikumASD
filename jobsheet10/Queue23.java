public class Queue23 {
    int[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue23(int n) {
        max = n;
        data = new int[max];
        size = 0;
        front = -1;
        rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + data[front]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = -1;
            rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void enqueue(int dt) {
        if (isFull()) {
            System.out.println("Queue sudah penuh (Overflow)");
        } else {
            if (isEmpty()) {
                front = 0;
            }
            rear = (rear + 1) % max;
            data[rear] = dt;
            size++;
        }
    }

    public int dequeue() {
        int dt = 0;
        if (isEmpty()) {
            System.out.println("Queue masih kosong (Underflow)");
        } else {
            dt = data[front];
            size--;
            if (isEmpty()) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % max;
            }
        }
        return dt;
    }
}