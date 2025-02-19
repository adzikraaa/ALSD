package Praktikum01;


public class MahasiswaMain11 {
    public static void main(String[] args) {
        
        Mahasiswa11 mhs1 = new Mahasiswa11();

        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        System.out.println("Informasi Awal:");
        mhs1.tampilkanInformasi();

        mhs1.ubahKelas("SI 2K");
        mhs1.updateIPK(3.60);

        System.out.println("\nInformasi Setelah Diubah:");
        mhs1.tampilkanInformasi();
    }
}
