|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020229|
| Nama | Nurfakiyah Rahmadhani |
| Kelas | TI - 1F |
| Repository | [link] () |

# Labs #5 SORTING (BUBBLE, SELECTION, DAN INSERTION SORT)

## 5.1 Praktikum 1 (Mengimplementasi Sorting menggunakan object)
### a. Sorting - Bubble sort
untuk hasil percobaan "sorting - bubble sort" terdapat pada gambar di bawah ini

![Screenshot](img/P1a_Run.png)

dimana hasil running sama dengan hasil verifikasi pada jobsheet  5

### b. Sorting - Selection Sort
untuk hasil percobaan "sorting - selection sort" terdapat pada gambar di bawah ini

![Screenshot](img/P1b_Run.png)

dimana hasil running sama dengan hasil verifikasi pada jobsheet  5

### c. Sorting - insertion Sort
untuk hasil percobaan "sorting - insertion sort" terdapat pada gambar di bawah ini:

![Screenshot](img/P1c_Run.png)

dimana hasil running sama dengan hasil verifikasi pada jobsheet  5

### Pertanyaan 
1. Fungsi barisan program di atas yaitu untuk menukar (swap) jika posisinya salah. dimana kondisi pada percabangan tersebut dimaksudkan untuk mengecek apakah angka kiri lebih besar dari kanan. Jika iya maka akah dilakukan pertukaran posisi antara kedua angka yang akan disimpan di temp. Dimanapertukaran ini terjadi karena artinya posisi angka tidak ascending. 
2. Kode program yang merupakan algoritma pencarian nilai minimum pada selection sort yaitu terdapa pada:

![Screenshot](img/P1P2.png)

dimana mkita menetapkan dulu bahwa indeks ke-i adalah nilai terkecil dengan min=i. Kemudian loop j mencari yang lebih kecil dibandingkan dengan i atau data sebelumnya. jika ditemukan data yang lebih kecil, maka min diganti dengan indeks nilai yang lebih kecil.
3. Maksud dari kondisi perulangan tersebut yaitu sebagai batas agar nilai  nilai yang disisipkan tidak keluaar dari batas array dan juga untuk mengecek apakah data lebih besar dari nilai yang akan disisippkan. Jika kedua kondisi benar maka data akan digeser ke kanan
4. Tujuan dari perintah tersebut yaitu, untuk menggeser elemen ke kanan dan memberikan ruang untuk memasukkan temp ke tempat yang benar

## 5.2 Praktikum 2 (Sorting Menggunakan Array of Object)
### 5.2.1 Verifikasi hasil percobaan
Untuk hasil percobaan dapat dilihat pada gambar di bawah ini:

![Screenshot](img/P2_Run11.png)

![Screenshot](img/P2_Run12.png)

Merupakah hasil yang sama seperti hasil verivikasi pada pada jobsheets

### 5.2.2 Pertanyaan 
1. Soal
a. Karena pada bubble sort, setiap perulangan akan menempatkan 1 data terbesar ke posisi akhir.
Jumlah maksimal perulangan yang dibutuhkan adalah n-1 kali (n = jumlah data), karena jika sudah n-1 kali, data pasti sudah terurut semua.
Jadi, tidak perlu sampai length, cukup dengan length -1
b. Karena setiap perulangan ke-i, bagian akhir array sudah terurut.Jadi, tidak perlu dibandingkan lagi.
c. Baik perulangan i maupun tahapan bubble sort berjumlah 49 kali
2. Hasil dari modifikasi program agar data mahasiswa bersifat dinamin ada pada gambar di bawah ini:

![Screenshot](img/P21_P2S1.png)

![Screenshot](img/P21_P2S2.png)

![Screenshot](img/P21_P2S3.png)

### 5.2.3 Verifikasi percobaan
Untuk hasil percobaan praktikum dapat di lihat di bawah ini:

![Screenshot](img/P22_R1.png)

![Screenshot](img/P22_R2.png)

![Screenshot](img/P22_R3.png)

![Screenshot](img/P22_R4.png)

pada percobaan kali ini menggunakan metode ascending yaitu dimulai dari yang terkecil (Selection sort). Dimana dari hasil verifikasi, untuk hasilnya sama dengan yang ada di jobsheet meskipun isi atau  nilainya berbeda.

### 5.2.4 Pertanyaan
1.  Baris program tersebut berfungsi untuk mencari indeks mahasiswa dengan IPK terkecil pada bagian array yang belum terurut dalam algoritma selection sort, di mana idxMin awalnya di-set sebagai posisi i lalu dilakukan perulangan dari j = i+1 hingga akhir array untuk membandingkan setiap IPK; jika ditemukan IPK yang lebih kecil dari IPK pada idxMin, maka indeks tersebut diperbarui, sehingga setelah perulangan selesai idxMin akan menyimpan posisi nilai minimum yang kemudian ditukar dengan elemen pada posisi i agar data tersusun secara ascending.

### 5.2.5 Verifikasi percobaan
Untuk hasil percobaan praktikum dapat di lihat di bawah ini:

![Screenshot](img/P23_R1.png)

![Screenshot](img/P23_R2.png)

![Screenshot](img/P23_R3.png)

![Screenshot](img/P23_R4.png)

![Screenshot](img/P23_R5.png)

pada percobaan kali ini menggunakan metode ascending yaitu dimulai dari yang terkecil (Insertion sort). Dimana dari hasil verifikasi, untuk hasilnya sama dengan yang ada di jobsheet meskipun isi atau  nilainya berbeda.

### 5.2.6 Pertanyaan
1. Hasil mengubah InsertionSort ascending yang mulanya seperti:

![Screenshot](img/P23_R5.png)

menjadi insertionSort descending yang seperti:

![Screenshot](img/P23_Q.png)

dimana yang membedakan hanyalah kode lebih dari yang di ubah menjadi kurang dari pada MahasiswaBerprestasi.

## Latihan Praktikum
