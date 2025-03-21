package Praktikum04;

public class dosen11 {
        String kode;
        String nama;
        boolean jenisKelamin;
        int usia;
    
        public dosen11 (String kd, String name, boolean jk, int age) {
            this.kode = kd;
            this.nama = name;
            this.jenisKelamin = jk;
            this.usia = age;
        }
    
        public void tampil() {
            System.out.println("Kode: " + kode + ", Nama: " + nama + ", Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan") + ", Usia: " + usia);
        }
    }
    
