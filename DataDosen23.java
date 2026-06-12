public class DataDosen23 {
    Dosen23[] DataDosen23 = new Dosen23[10];
    int idx;

    void tambah(Dosen23 dsn) {
        if (idx < DataDosen23.length) {
            DataDosen23[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data penuh");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            DataDosen23[i].tampil();
        }
    }

    void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (DataDosen23[j].usia < DataDosen23[j - 1].usia) {
                    Dosen23 tmp = DataDosen23[j];
                    DataDosen23[j] = DataDosen23[j - 1];
                    DataDosen23[j - 1] = tmp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < idx; j++) {
                if (DataDosen23[j].usia > DataDosen23[idxMax].usia) {
                    idxMax = j;
                }
            }
            Dosen23 tmp = DataDosen23[idxMax];
            DataDosen23[idxMax] = DataDosen23[i];
            DataDosen23[i] = tmp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen23 temp = DataDosen23[i];
            int j = i;
            while (j > 0 && DataDosen23[j - 1].usia > temp.usia) {
                DataDosen23[j] = DataDosen23[j - 1];
                j--;
            }
            DataDosen23[j] = temp;
        }
    }
}
