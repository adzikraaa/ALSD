package Praktikum01;

public class MataKuliahMain11 {
    public static void main(String[] args) {
        
        MataKuliah11 mk1 = new MataKuliah11("IF101", "Pemrograman Java", 3, 6);
        MataKuliah11 mk2 = new MataKuliah11("IF102", "Struktur Data", 4, 8);

        
        System.out.println("=== Informasi Mata Kuliah 1 ===");
        mk1.tampilInformasi();

        System.out.println("\n=== Informasi Mata Kuliah 2 ===");
        mk2.tampilInformasi();

        mk1.ubahSKS(4);

        mk2.tambahJam(2);

        mk1.kurangiJam(2);
    }
}
