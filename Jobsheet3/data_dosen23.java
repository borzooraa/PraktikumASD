public class data_dosen23 {
    void dataSemuaDosen(dosen_23[] arrayOfDosen) {
        int counter = 1;
        System.out.println("=====================================");
        System.out.println("             DAFTAR DOSEN            ");
        System.out.println("=====================================");

        for (dosen_23 dosen_23 : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + counter);
            System.out.println("Kode                  : " + dosen_23.kode);
            System.out.println("Nama                  : " + dosen_23.nama);
            String gender = dosen_23.jenisKelamin == true ? "Wanita" : "Pria";
            System.out.println("Jenis Kelamin(P/L)    : " + gender);
            System.out.println("Usia                  : " + dosen_23.usia);
            System.out.println("--------------------------------------");
            counter++;
        }
    }

    void jumlahDosenPerJenisKelamin(dosen_23[] arrayOfDosen) {
        int countPa = 0, countPi = 0;
        for (dosen_23 dosen_23 : arrayOfDosen) {
            if (dosen_23.jenisKelamin == false) {
                countPa++;
            } else {
                countPi++;
            }
        }
        System.out.println("Jumlah Dosen Wanita : " + countPi);
        System.out.println("Jumlah Dosen Pria   : " + countPa);
        System.out.println("--------------------------------------");
    }

    void rataUsiaDosenPerJenisKelamin(dosen_23[] arrayOfDosen) {
        int countPa = 0, countPi = 0, totUsiaPa = 0, totUsiaPi = 0;
        for (dosen_23 dosen_23 : arrayOfDosen) {
            if (dosen_23.jenisKelamin == false) {
                countPa++;
                totUsiaPa += dosen_23.usia;
            } else {
                countPi++;
                totUsiaPi += dosen_23.usia;
            }
        }
        System.out.println("Rata-rata Usia Dosen Wanita  : " + (totUsiaPi / countPi));
        System.out.println("Rata-rata Usia Dosen Pria    : " + (totUsiaPa / countPa));
        System.out.println("--------------------------------------");
    }

    void infoDosenPalingMuda(dosen_23[] arrayOfDosen) {
        int usiaTermuda = 1000, termuda = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia < usiaTermuda) {
                usiaTermuda = arrayOfDosen[i].usia;
                termuda = i;
            }
        }
        System.out.println("          INFO DOSEN TERMUDA         ");
        System.out.println("--------------------------------------");
        System.out.println("Kode                  : " + arrayOfDosen[termuda].kode);
        System.out.println("Nama                  : " + arrayOfDosen[termuda].nama);
        String gender = arrayOfDosen[termuda].jenisKelamin == true ? "Wanita" : "Pria";
        System.out.println("Jenis Kelamin(P/L)    : " + gender);
        System.out.println("Usia                  : " + arrayOfDosen[termuda].usia);
        System.out.println("--------------------------------------");
    }

    void infoDosenPalingTua(dosen_23[] arrayOfDosen) {
        int usiaTertua = 0, tertua = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia > usiaTertua) {
                usiaTertua = arrayOfDosen[i].usia;
                tertua = i;
            }
        }
            System.out.println("          INFO DOSEN TERTUA       ");
            System.out.println("--------------------------------------");
            System.out.println("Kode                  : " + arrayOfDosen[tertua].kode);
            System.out.println("Nama                  : " + arrayOfDosen[tertua].nama);
            String gender = arrayOfDosen[tertua].jenisKelamin == true ? "Wanita" : "Pria";
            System.out.println("Jenis Kelamin(P/L)    : " + gender);
            System.out.println("Usia                  : " + arrayOfDosen[tertua].usia);
            System.out.println("--------------------------------------");
    }
}
