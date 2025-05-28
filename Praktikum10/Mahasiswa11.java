package Praktikum10;

public class Mahasiswa11 {
     String nama;
     String nim;
     String prodi;
     int semester;

    public Mahasiswa11(String nama, String nim, String prodi, int semester) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.semester = semester;
    }

     @Override
    public String toString() {
        return nama + " (" + nim + ") - " + prodi + ", Semester " + semester;
    }
} 
