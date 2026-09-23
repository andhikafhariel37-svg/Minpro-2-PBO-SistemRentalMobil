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
