/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rentalmobil;

/**
 *
 * @author User
 */
// --- SUPERCLASS ---
public abstract class Mobil {
    private static int counter = 1;
    private int id;
    private String merk;
    private String platNomor;
    private String namaPenyewa;

    public Mobil(String merk, String platNomor) {
        this.id = counter++;
        this.merk = merk;
        this.platNomor = platNomor;
        this.namaPenyewa = "-"; // Default belum disewa
    }

    // --- ENCAPSULATION (Getter & Setter) ---
    public int getId() { return id; }

    public String getMerk() { return merk; }
    public void setMerk(String merk) { this.merk = merk; }

    public String getPlatNomor() { return platNomor; }
    public void setPlatNomor(String platNomor) { this.platNomor = platNomor; }

    public String getNamaPenyewa() { return namaPenyewa; }
    public void setNamaPenyewa(String namaPenyewa) { this.namaPenyewa = namaPenyewa; }

    @Override
    public String toString() {
        return String.format("ID: %d | Merk: %-10s | Plat: %-10s | Penyewa: %-12s", 
                id, merk, platNomor, namaPenyewa);
    }
}

// --- SUBCLASS 1 ---
class MobilPenumpang extends Mobil {
    private int kapasitasPenumpang;

    public MobilPenumpang(String merk, String platNomor, int kapasitasPenumpang) {
        super(merk, platNomor); // Memanggil constructor superclass
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    public int getKapasitasPenumpang() { return kapasitasPenumpang; }
    public void setKapasitasPenumpang(int kapasitas) { this.kapasitasPenumpang = kapasitas; }

    @Override
    public String toString() {
        return super.toString() + " | Tipe: Penumpang (" + kapasitasPenumpang + " kursi)";
    }
}

// --- SUBCLASS 2 ---
class MobilAngkutan extends Mobil {
    private double kapasitasMuatanTon;

    public MobilAngkutan(String merk, String platNomor, double kapasitasMuatanTon) {
        super(merk, platNomor); // Memanggil constructor superclass
        this.kapasitasMuatanTon = kapasitasMuatanTon;
    }

    public double getKapasitasMuatanTon() { return kapasitasMuatanTon; }
    public void setKapasitasMuatanTon(double muatan) { this.kapasitasMuatanTon = muatan; }

    @Override
    public String toString() {
        return super.toString() + " | Tipe: Angkutan (" + kapasitasMuatanTon + " Ton)";
    }
}