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

 ## Penjelasan tiap class

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
