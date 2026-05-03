|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020229|
| Nama | Nurfakiyah Rahmadhani |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/borzooraa/PraktikumASD/tree/main/jobsheet9) |

# Labs #9 STACK
## 9.1 Percobaan 1: Mahasiswa Mengumpulkan Tugas
### 9.1.1 Hasil verifikasi
Hasil verivikasi percobaan satu dapat dilihat di gambar di bawah ini.

![Screensht](img/P1_ver1.png)

![Screensht](img/P1_ver2.png)

![Screensht](img/P1_ver3.png)

![Screensht](img/P1_ver4.png)

![Screensht](img/P1_ver5.png)

![Screensht](img/P1_ver6.png)

![Screensht](img/P1_ver7.png)

### 9.2.2 Pertanyaan
1. Bagian program yang perlu diganti terletak pada class stackTugasMahasiswa23 pada method print(), dimana yang awalnya

![Screensht](img/P1P1_bfr.png)

menjadi

![Screensht](img/P1P1_aft.png)

2. Banyaknya data yang ditampung yaitu ada lima, dapat dilihat di potongan program berikut:

![Screensht](img/P1P2.png)

dimana 5 merupakan ukuran/size dari program yang telah dibuat

3. Perlunya pengecekan kondisi !isFull yaitu agar isi dari array stackTugasMahasiswa tidak overflow. Dan yang akan terjadi jika kondisi if-else tersebut dihapus, maka program akan mengakses indeks array yang tidak ada, yang mengakibatkan program akan error outOfBound.

4. Agar pengguna dapat melihat mahasiwa yang pertama kali mengumpulkan tugas yaitu dapat dengan menambahkan program pada class mahasiswa demo, yaitu:

![Screensht](img/P1P4_1.png) 

lalu pada class yang sama menambahkan menu 5:

![Screensht](img/P1P4_12.png) 

dan juga pada class yang sama, mengganti batas seperti pada gambar di bawah ini

![Screensht](img/P1P4_13.png)

dimana penggantian batas itu dikarenakan menu sudah bertambah menjadi 5 yang awalnya cuma 4.
5. penambahan method dilakukan di class stackTugasMahasiswa23() dapat dilihat seperti pada gambar di bawah ini:

![Screensht](img/P1P5_stack.png)

## 9.2 Percobaan 2: Konversi Nilai ke Biner
### 9.2.1 Hasil verifikasi
Hasil verifikasi percobaan 2 dapat dilihat pada gambar di bawah ini:

![Screensht](img/P2_ver.png)

### 9.2.2 Pertanyaan
1. Alur kerja dari method konversiDesimal ke biner yaitu
- Pertama, membuat object stack biner dari class yang sudah ada.
- Kemudian melakukan perulangan dengan mengambil modulus parameter nilai ketika dibagi dua dan memasukkan ke dalam stack hingga nilai mecapai nol.
- Lalu mendeklarasikan variable string biner dan memebuat perulangan kedua. Pada perulangan kedua, mengeluarkan bilangan biner dari stack biner urut dari yang terakhir masuk, dan dimasukkan ke String biner.
- return String biner agar diterima oleh program yang memanggilnya.
2. perubahan itu tidak memberikan dampak signifikan, karena baik program yang sekaranga tau yang sebelumnya smaa-sama menghentikan perulangan ketika nilai sama dengan 0.

## Tugas
Hasil Run tugas dapat dilihat pada gambar dibawah ini

![Screensht](tugas1.png)

![Screensht](tugas2.png)

![Screensht](tugas 3.png)

![Screensht](tugas4.png)

![Screensht](tugas5.png)

![Screensht](tugas6.png)

![Screensht](tugas7.png)

![Screensht](tugas8.png)

![Screensht](tugas9.png)





