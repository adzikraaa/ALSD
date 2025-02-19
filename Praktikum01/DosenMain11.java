package Praktikum01;

public class DosenMain11 {
    public static void main(String[] args) {
        
        Dosen11 dosen1 = new Dosen11("D001", "Dr. Budi Santoso", true, 2010, "Artificial Intelligence");
        dosen1.tampilInformasi();
        System.out.println("Masa Kerja: " + dosen1.hitungMasaKerja(2024) + " tahun");

        Dosen11 dosen2 = new Dosen11("D002", "Prof. Siti Aminah", false, 2005, "Data Science");
        dosen2.tampilInformasi();
        System.out.println("Masa Kerja: " + dosen2.hitungMasaKerja(2024) + " tahun");

        dosen2.setStatusAktif(true);
        dosen2.ubahKeahlian("Machine Learning");
        System.out.println("Setelah perubahan:");
        dosen2.tampilInformasi();
    }
}

