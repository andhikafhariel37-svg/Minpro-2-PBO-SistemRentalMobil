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
