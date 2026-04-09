public class sorting23 {
    int[] data;
    int jlhData;

    sorting23(int Data[], int jumData) {
        jlhData = jumData;
        data = new int[jumData];
        for (int i = 0; i < jlhData; i++) {
            data[i] = Data[i];
        }
    }

    void bubbleSort() {
        int temp = 0;
        for (int i = 0; i < jlhData - 1; i++) {
            for (int j = 1; j < jlhData - i; j++) {
                if (data[j - 1] > data[j]) {
                    temp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = temp;
                }
            }
        }
    }

    void tampil() {
        for (int i = 0; i < jlhData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    void selectionSort() {
        for (int i = 0; i < jlhData - 1; i++) {
            int min = i;
            for (int j = i + 1; j < jlhData; j++) {
                if (data[j] < data[min]) {
                    min = j;
                }
            }
            int temp=data[i];
            data[i]=data[min];
            data[min]=temp;
        }
    }
}