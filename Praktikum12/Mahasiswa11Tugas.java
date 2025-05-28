package Praktikum12;
public class Mahasiswa11Tugas {
    String nim;
    String nama;

    public Mahasiswa11Tugas(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "[" + nim + " - " + nama + "]";
    }
}
