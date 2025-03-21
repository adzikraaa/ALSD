package Praktikum02;

public class Dosen11 {
    public String kode;
    public String nama;
    public boolean jenisKelamin;
    public int usia;

    public Dosen11(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    
    public void tampilkanInfo() {
        System.out.println("Kode Dosen     : " + kode);
        System.out.println("Nama           : " + nama);
        System.out.println("Jenis Kelamin  : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("======================");
    }
}
