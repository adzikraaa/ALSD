package Praktikum01;

public class MataKuliah11 {
    String kodeMK;
    String name;
    int sks;
    int jumlahJam;

    
    public MataKuliah11(String kodeMK, String name, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.name = name;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    
    public void tampilInformasi() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama: " + name);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    
    public void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS telah diperbarui menjadi: " + sks);
    }

    
   public void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("Jumlah jam telah ditambahkan. Jumlah jam sekarang: " + jumlahJam);
    }

    
    public void kurangiJam(int jam) {
        if (jumlahJam - jam < sks * 2) { 
            System.out.println("Pengurangan tidak dapat dilakukan. Jumlah jam minimum tidak mencukupi.");
        } else {
            this.jumlahJam -= jam;
            System.out.println("Jumlah jam telah dikurangi. Jumlah jam sekarang: " + jumlahJam);
        }
    }
}
