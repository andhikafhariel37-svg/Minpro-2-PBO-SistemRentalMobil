# Judul : Pencatatan Rental Mobil

---

## 1. Deskripsi Singkat Program

Sistem Rental Mobil ini merupakan aplikasi berbasis Java dan Object-Oriented Programming (OOP) yang dirancang untuk mengelola data penyewaan kendaraan secara efisien melalui antarmuka konsol (command-line).

Sistem ini mendukung operasi CRUD (Create, Read, Update, Delete) untuk manajemen armada mobil, disertai fitur pencatatan nama penyewa dan pembuatan ID otomatis untuk setiap kendaraan baru.

---

## 2. Penjelasan Class & Atribut
Pada project ini, strukturnya dibagi ke beberapa class, yaitu:

Pada Package RentalMobil disini ada:

* **Mobil (Superclass)**
  * counter
  * id
  * merk
  * platNomor
  * namaPenyewa

* **MobilPenumpang (Subclass)**
  * kapasitasPenumpang

* **MobilAngkutan (Subclass)**
  * kapasitasMuatanTon

* **RentalManager**
  * daftarMobil

* **Main**
  * scanner

 ---

 ## 3. Penjelasan tiap class

 * **Mobil**
   * Bertindak sebagai superclass atau kelas induk. Class ini digunakan untuk memuat data dan informasi dasar yang dimiliki oleh semua jenis kendaraan, seperti nomor ID, merk, plat nomor, serta status/catatan nama penyewanya.

 * **MobilPenumpang**
   * Merupakan subclass atau kelas turunan dari Mobil. Class ini spesifik digunakan untuk mengelola data mobil kategori penumpang dengan tambahan informasi mengenai jumlah kapasitas kursi/penumpang.
  
 * **MobilAngkutan**
   * Merupakan subclass atau kelas turunan dari Mobil. Class ini spesifik digunakan untuk mengelola data mobil kategori angkutan barang/logistik dengan tambahan informasi mengenai kapasitas daya angkut beban (dalam satuan Ton).
  
 * **RentalManager**
   * Class ini berfungsi sebagai pengelola utama (backend logic). Tugasnya mencakup penyimpanan daftar mobil ke dalam ArrayList (termasuk dummy data awal) serta menyediakan fungsi-fungsi operasi CRUD (Tambah, Tampilkan, Edit, Hapus) dan transaksi penyewaan mobil.
  
 * **Main**
   * Class utama (driver class) yang menjalankan program. Class ini bertanggung jawab menyediakan tampilan antarmuka menu berbasis konsol, membaca input dari pengguna melalui Scanner, serta melakukan validasi input agar program tidak crash jika terjadi kesalahan input data.

---

## 4. Penjelasan Penerapan Encapsulation & Inheritance
* **Encapsulation**
  * Konsep ini diterapkan dengan memasang access modifier private pada seluruh variabel di kelas Mobil, MobilPenumpang, MobilAngkutan, dan RentalManager guna mencegah manipulasi langsung dari luar kelas.
  * Pembacaan maupun pembaruan nilai variabel diatur melalui mekanisme method getter dan setter.
  * Sistem juga dilengkapi prosedur validasi input, seperti:
    * bacaAngkaInt: Memastikan masukan pengguna murni berupa angka integer agar tidak terjadi crash saat navigasi menu atau pencarian ID.
    * bacaAngkaDouble: Menjamin input kapasitas muatan pada kelas MobilAngkutan bertipe desimal/angka yang valid.
    * bacaTeksTidakKosong: Mencegah data teks seperti nama penyewa, merk, atau nomor plat diisi dengan nilai kosong.

* **Inheritance**
  * Kelas Mobil diposisikan sebagai superclass yang mendefinisikan atribut umum seluruh unit kendaraan (seperti id, merk, platNomor, dan namaPenyewa).
  * Kelas MobilPenumpang dan MobilAngkutan bertindak sebagai subclass yang mengekstensi kelas induk untuk membawa spesifikasi unik masing-masing (jumlah kursi dan kapasitas tonase).
  * Pemanggilan super(merk, platNomor) dimanfaatkan di dalam constructor anak kelas untuk mendistribusikan inisialisasi data dasar secara langsung ke superclass.

---

## 5. Penjelasan Alur Program dan Dokumentasi
Pemanggilan super(merk, platNomor) dimanfaatkan di dalam constructor anak kelas untuk mendistribusikan inisialisasi data dasar secara langsung ke superclass.

Saat program dijalankan, akan menampilkan 6 menu utama

<img width="238" height="94" alt="image" src="https://github.com/user-attachments/assets/b07373b5-8b78-4d48-a32f-b23300634a3c" />

**1. Tambah Mobil (Create)**

Menu Create (Tambah Mobil) bekerja dengan meminta pengguna memilih kategori kendaraan (MobilPenumpang atau MobilAngkutan). Pengguna lalu mengisi detail merk, plat nomor, serta atribut spesifik (kapasitas kursi atau muatan ton) yang semuanya melewati validasi input. Setelah data valid, sistem secara otomatis memberikan ID unik baru via variabel counter, membuat objek baru, dan menyimpannya ke dalam ArrayList dengan menampilkan pesan konfirmasi keberhasilan.

<img width="362" height="187" alt="image" src="https://github.com/user-attachments/assets/979e6c4c-8bda-4c4c-aa22-3c636770d633" />

**2. Lihat Semua Mobil (Read)**

Menu Read (Lihat Semua Mobil) bekerja dengan memeriksa isi ArrayList terlebih dahulu. Jika daftar masih kosong, sistem akan menampilkan pesan bahwa data belum tersedia. Jika data terisi, sistem akan menampilkan seluruh daftar kendaraan secara rapi ke layar konsol—termasuk data dummy awal maupun data yang baru ditambahkan. Informasi yang ditampilkan mencakup ID, merk, plat nomor, status/nama penyewa, serta spesifikasi khusus sesuai tipe kendaraannya (kapasitas kursi untuk MobilPenumpang atau muatan ton untuk MobilAngkutan).

<img width="515" height="147" alt="image" src="https://github.com/user-attachments/assets/b44ef47d-96c8-4472-a27b-bf5314e1b84c" />

**3. Edit Data Mobil (Update)**

Menu Update (Edit Data Mobil) bekerja dengan meminta pengguna memasukkan ID kendaraan yang ingin diubah. Sistem lalu mencari objek mobil tersebut di dalam ArrayList berdasarkan ID-nya. Jika ID ditemukan, pengguna diminta memasukkan data merk dan plat nomor baru yang langsung divalidasi agar tidak kosong. Setelah itu, sistem memperbarui nilai atribut kendaraan menggunakan method setter (setMerk dan setPlatNomor) dan menampilkan pesan bahwa data berhasil diperbarui. Jika ID tidak ditemukan, sistem akan memberi tahu bahwa mobil tidak ada.

<img width="317" height="143" alt="image" src="https://github.com/user-attachments/assets/bbe6e764-026e-47d6-b4c7-00e14ca62e0b" />

**4. Hapus Mobil (Delete)**

Menu Delete (Hapus Mobil) bekerja dengan meminta pengguna memasukkan ID kendaraan yang ingin dihapus dari sistem. Selanjutnya, sistem mencari posisi objek mobil tersebut di dalam ArrayList berdasarkan ID yang dimasukkan. Jika kendaraan ditemukan, objek mobil tersebut akan langsung dihapus dari daftar menggunakan metode remove(), lalu sistem menampilkan pesan konfirmasi bahwa data berhasil dihapus. Sebaliknya, jika ID tidak cocok dengan data mana pun, sistem akan memberikan notifikasi bahwa mobil tidak ditemukan.

<img width="592" height="251" alt="image" src="https://github.com/user-attachments/assets/c059a612-f310-4079-b16b-fcdf36ac229b" />

**5. Catat Penyewa Mobil (Update)**

Menu Catat Penyewa Mobil (Update) bekerja dengan meminta pengguna memasukkan ID kendaraan dan nama calon penyewa. Sistem kemudian mencari data mobil di dalam ArrayList berdasarkan ID tersebut. Jika mobil ditemukan, sistem akan memeriksa statusnya terlebih dahulu. Apabila mobil masih belum disewa (berstatus "-"), sistem akan memperbarui nama penyewa menggunakan method setNamaPenyewa dan menampilkan pesan keberhasilan. Namun, jika mobil tersebut sudah disewa oleh orang lain, atau ID kendaraan tidak ditemukan, sistem akan memberi tahu pengguna bahwa transaksi tidak dapat diproses.

<img width="503" height="254" alt="image" src="https://github.com/user-attachments/assets/79f0af36-980c-4659-87f7-d606768ebfcb" />

**6. Keluar**

Menu Keluar (Menu 6) bekerja dengan mengubah variabel kontrol perulangan (running) menjadi false, yang secara otomatis menghentikan siklus while loop pada program. Sebelum aplikasi benar-benar ditutup, sistem akan menampilkan pesan penutup ("Terima kasih telah menggunakan sistem ini") di konsol dan menutup objek Scanner untuk membersihkan alokasi memori.

<img width="392" height="101" alt="image" src="https://github.com/user-attachments/assets/cfba3743-e642-4cf2-86a8-f2cc6f9adfdc" />









