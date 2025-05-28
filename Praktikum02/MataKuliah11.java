package Praktikum02;


import java.util.Scanner;

public class MataKuliah11 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah11(){
        
    }

    public MataKuliah11 (String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    
}
    public void tambahData(Scanner input11) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kode matakuliah: ");
        this.kode = input.nextLine();
        System.out.print("Masukkan nama matakuliah: ");
        this.nama = input.nextLine();
        System.out.print("Masukkan jumlah SKS: ");
        this.sks = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan jumlah Jam: ");
        this.jumlahJam = input.nextInt();
        input.nextLine();
    }
    public void cetakInfo(){
        System.out.println("Kode    :"+ kode);
        System.out.println("Nama    :" + nama);
        System.out.println("SKS     :" + sks);
        System.out.println("Jumlah jam  :" + jumlahJam);
        System.out.println("==================");


    
      
    }

    
}

