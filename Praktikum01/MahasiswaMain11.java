package Praktikum01;

public class MahasiswaMain11 {
    public static void main(String[] args) {
        
        Mahasiswa11 mhs1 = new Mahasiswa11();

        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIPK(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa11 mhs2 = new Mahasiswa11("Annisa Nabila","21470527", 3.25, "TI 2L");
        mhs2.updateIPK(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa11 mhsBangkris = new Mahasiswa11("Bang Kris","2343234",3.47, "SIB 3B");
        mhsBangkris.tampilkanInformasi();
    }
}

// class Mahasiswa {
//     String nama;
//     String nim;
//     String kelas;
//     double ipk;

//     public void tampilkanInformasi() {
//         System.out.println("Nama: " + nama);
//         System.out.println("NIM: " + nim);
//         System.out.println("Kelas: " + kelas);
//         System.out.println("IPK: " + ipk);
//     }

//     public void ubahKelas(String kelasBaru) {
//         kelas = kelasBaru;
//     }

//     public void updateIpk(double ipkBaru) {
//         ipk = ipkBaru;
//     }
// }
    

    

