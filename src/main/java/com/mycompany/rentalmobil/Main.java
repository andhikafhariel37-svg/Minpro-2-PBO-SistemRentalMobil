/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rentalmobil;

/**
 *
 * @author Pompom
 */
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        RentalManager manager = new RentalManager();
        boolean running = true;

        while (running) {
            System.out.println("\n=== SISTEM RENTAL MOBIL ===");
            System.out.println("1. Tambah Mobil");
            System.out.println("2. Lihat Semua Mobil");
            System.out.println("3. Edit Data Mobil");
            System.out.println("4. Hapus Mobil");
            System.out.println("5. Catat Penyewa Mobil");
            System.out.println("6. Keluar");
            
            int pilihan = bacaAngkaInt("Pilih menu (1-6): ");

            switch (pilihan) {
                case 1:
                    tambahMobilMenu(manager);
                    break;
                case 2:
                    manager.tampilkanSemuaMobil();
                    break;
                case 3:
                    int idEdit = bacaAngkaInt("Masukkan ID Mobil yang ingin diedit: ");
                    String merkBaru = bacaTeksTidakKosong("Masukkan Merk Baru: ");
                    String platBaru = bacaTeksTidakKosong("Masukkan Plat Nomor Baru: ");
                    manager.updateMobil(idEdit, merkBaru, platBaru);
                    break;
                case 4:
                    int idHapus = bacaAngkaInt("Masukkan ID Mobil yang ingin dihapus: ");
                    manager.hapusMobil(idHapus);
                    break;
                case 5:
                    int idSewa = bacaAngkaInt("Masukkan ID Mobil: ");
                    String penyewa = bacaTeksTidakKosong("Masukkan Nama Penyewa: ");
                    manager.sewaMobil(idSewa, penyewa);
                    break;
                case 6:
                    running = false;
                    System.out.println("Terima kasih telah menggunakan sistem ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Harap masukkan angka 1-6.");
            }
        }
    }

    private static void tambahMobilMenu(RentalManager manager) {
        System.out.println("\nPilih Tipe Mobil:");
        System.out.println("1. Mobil Penumpang");
        System.out.println("2. Mobil Angkutan");
        int tipe = bacaAngkaInt("Pilihan (1/2): ");

        String merk = bacaTeksTidakKosong("Masukkan Merk Mobil: ");
        String plat = bacaTeksTidakKosong("Masukkan Plat Nomor: ");

        if (tipe == 1) {
            int kursi = bacaAngkaInt("Masukkan Jumlah Kapasitas Kursi: ");
            manager.tambahMobil(new MobilPenumpang(merk, plat, kursi));
        } else if (tipe == 2) {
            double muatan = bacaAngkaDouble("Masukkan Kapasitas Muatan (Ton): ");
            manager.tambahMobil(new MobilAngkutan(merk, plat, muatan));
        } else {
            System.out.println("Tipe tidak valid, pembatalan tambah mobil.");
        }
    }

  
    private static int bacaAngkaInt(String pesan) {
        while (true) {
            System.out.print(pesan);
            try {
                int input = Integer.parseInt(scanner.nextLine());
                return input;
            } catch (NumberFormatException e) {
                System.out.println("Error: Input harus berupa angka bulat! Coba lagi.");
            }
        }
    }

    private static double bacaAngkaDouble(String pesan) {
        while (true) {
            System.out.print(pesan);
            try {
                double input = Double.parseDouble(scanner.nextLine());
                return input;
            } catch (NumberFormatException e) {
                System.out.println("Error: Input harus berupa angka (desimal/bulat)! Coba lagi.");
            }
        }
    }

    private static String bacaTeksTidakKosong(String pesan) {
        while (true) {
            System.out.print(pesan);
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("Error: Teks tidak boleh kosong! Coba lagi.");
        }
    }
}