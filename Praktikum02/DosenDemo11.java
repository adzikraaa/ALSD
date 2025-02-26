package Praktikum02;
import java.util.Scanner;

public class DosenDemo11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = input.nextInt();
        input.nextLine();

 
        Dosen11[] daftarDosen = new Dosen11[jumlahDosen];

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("\nMasukkan data dosen ke-" + (i + 1) + ":");
            System.out.print("Kode Dosen: ");
            String kode = input.nextLine();
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("Jenis Kelamin (L/P): ");
            char jk = input.next().charAt(0);
            boolean jenisKelamin = (jk == 'L' || jk == 'l'); 
            System.out.print("Usia: ");
            int usia = input.nextInt();
            input.nextLine();

    
            daftarDosen[i] = new Dosen11(kode, nama, jenisKelamin, usia);
        }

        DataDosen11.dataSemuaDosen(daftarDosen);
        DataDosen11.jumlahDosenPerJenisKelamin(daftarDosen);
        DataDosen11.rerataUsiaDosenPerJenisKelamin(daftarDosen);
        DataDosen11.infoDosenPalingTua(daftarDosen);
        DataDosen11.infoDosenPalingMuda(daftarDosen);

        input.close();
    }
}
