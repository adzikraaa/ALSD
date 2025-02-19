package praPraktikum;

import java.util.Scanner;

public class NilaiMhs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("================================");
        System.out.print("Masukkan nilai tugas (0-100): ");
        double tugas = input.nextDouble();
        System.out.print("Masukkan nilai kuis (0-100): ");
        double kuis = input.nextDouble();
        System.out.print("Masukkan nilai UTS (0-100): ");
        double uts = input.nextDouble();
        System.out.print("Masukkan nilai UAS (0-100): ");
        double uas = input.nextDouble();
        System.out.println("================================");


      
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("Nilai tidak valid");
        } else {
            
            double nilaiAkhir = (tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.4);

            
            String nilaiHuruf;
            boolean lulus;

            if (nilaiAkhir >= 80) {
                nilaiHuruf = "A";
                lulus = true;
            } else if (nilaiAkhir >= 73) {
                nilaiHuruf = "B+";
                lulus = true;
            } else if (nilaiAkhir >= 65) {
                nilaiHuruf = "B";
                lulus = true;
            } else if (nilaiAkhir >= 60) {
                nilaiHuruf = "C+";
                lulus = true;
            } else if (nilaiAkhir >= 50) {
                nilaiHuruf = "C";
                lulus = true;
            } else if (nilaiAkhir >= 39) {
                nilaiHuruf = "D";
                lulus = false;
            } else {
                nilaiHuruf = "E";
                lulus = false;
            }

          
            System.out.println("================================");
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("===================================");
            System.out.println("Keterangan: " + (lulus ? "LULUS" : "TIDAK LULUS"));
            System.out.println("=====================================");
        }

        input.close();
    }
}
