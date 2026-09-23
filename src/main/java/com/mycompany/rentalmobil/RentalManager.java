/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rentalmobil;

/**
 *
 * @author User
 */
import java.util.ArrayList;

public class RentalManager {
    // Encapsulation: ArrayList bersifat private
    private ArrayList<Mobil> daftarMobil = new ArrayList<>();

    // Constructor: Otomatis mengisi dummy data awal
    public RentalManager() {
        isiDummyData();
    }

    // --- DUMMY DATA AWAL ---
    private void isiDummyData() {
        daftarMobil.add(new MobilPenumpang("Toyota Avanza", "B 1234 ABC", 7));
        daftarMobil.add(new MobilAngkutan("Isuzu Elf", "B 9876 XYZ", 2.5));
    }

    public void tambahMobil(Mobil mobil) {
        daftarMobil.add(mobil);
        System.out.println("Mobil berhasil ditambahkan dengan ID: " + mobil.getId());
    }

    public void tampilkanSemuaMobil() {
        if (daftarMobil.isEmpty()) {
            System.out.println("Belum ada data mobil.");
            return;
        }
        System.out.println("\n--- DAFTAR MOBIL RENTAL ---");
        for (Mobil m : daftarMobil) {
            System.out.println(m);
        }
    }

    public Mobil cariMobilById(int id) {
        for (Mobil m : daftarMobil) {
            if (m.getId() == id) return m;
        }
        return null;
    }

    public void updateMobil(int id, String merkBaru, String platBaru) {
        Mobil m = cariMobilById(id);
        if (m != null) {
            m.setMerk(merkBaru);
            m.setPlatNomor(platBaru);
            System.out.println("Data mobil ID " + id + " berhasil diperbarui.");
        } else {
            System.out.println("Mobil dengan ID tersebut tidak ditemukan.");
        }
    }

    public void hapusMobil(int id) {
        Mobil m = cariMobilById(id);
        if (m != null) {
            daftarMobil.remove(m);
            System.out.println("Mobil ID " + id + " berhasil dihapus.");
        } else {
            System.out.println("Mobil dengan ID tersebut tidak ditemukan.");
        }
    }

    public void sewaMobil(int id, String namaPenyewa) {
        Mobil m = cariMobilById(id);
        if (m != null) {
            if (m.getNamaPenyewa().equals("-")) {
                m.setNamaPenyewa(namaPenyewa);
                System.out.println("Mobil ID " + id + " berhasil disewa oleh " + namaPenyewa);
            } else {
                System.out.println("Mobil sedang disewa oleh " + m.getNamaPenyewa() + "!");
            }
        } else {
            System.out.println("Mobil tidak ditemukan.");
        }
    }
}