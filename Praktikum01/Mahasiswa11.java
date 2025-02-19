package Praktikum01;

public class Mahasiswa11 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    void tampilkanInformasi(){
        System.out.println("Nama: "+ nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: "+ ipk);
    }

    void ubahKelas(String kelasBaru){
        kelas = kelasBaru;
    }
    void updateIPK (double ipkBaru){
        ipk = ipkBaru;
    }

    void nilaiKinerja() { 
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else if (ipk >= 0) {
            return "Kinerja kurang";
        } else {
            return "IPK tidak valid. Harus antara 0.0 dan 4.0.";
        }
    }
    public Mahasiswa11(){

    }

    public Mahasiswa11(String nm, String nim, double ipk, String kls){
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }
    
    }


