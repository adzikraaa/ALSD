package Praktikum12;

public class Mahasiswa11 {
   
     String nim;
     String nama;
     String kelas;
     double ipk;

    public Mahasiswa11() {
        this.nim = "";
        this.nama = "";
        this.kelas = "";
        this.ipk = 0.0;
    }


    public Mahasiswa11(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

   
    public void tampilInformasi() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
    }
}

