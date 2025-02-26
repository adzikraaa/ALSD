package Praktikum02;

public class DataDosen11 {

    public static void dataSemuaDosen(Dosen11[] arrayOfDosen) {
        System.out.println("\n=== Data Semua Dosen ===");
        for (Dosen11 dosen : arrayOfDosen) {
            dosen.tampilkanInfo();
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen11[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen11 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) pria++;
            else wanita++;
        }
        System.out.println("\nJumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen11[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int countPria = 0, countWanita = 0;

        for (Dosen11 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) { // Pria
                totalUsiaPria += dosen.usia;
                countPria++;
            } else { // Wanita
                totalUsiaWanita += dosen.usia;
                countWanita++;
            }
        }

        double rataPria = countPria > 0 ? (double) totalUsiaPria / countPria : 0;
        double rataWanita = countWanita > 0 ? (double) totalUsiaWanita / countWanita : 0;

        System.out.println("\nRata-rata usia Dosen Pria   : " + rataPria);
        System.out.println("Rata-rata usia Dosen Wanita : " + rataWanita);
    }

    public static void infoDosenPalingTua(Dosen11[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;

        Dosen11 dosenTertua = arrayOfDosen[0];
        for (Dosen11 dosen : arrayOfDosen) {
            if (dosen.usia > dosenTertua.usia) {
                dosenTertua = dosen;
            }
        }

        System.out.println("\n=== Dosen Paling Tua ===");
        dosenTertua.tampilkanInfo();
    }

    public static void infoDosenPalingMuda(Dosen11[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;

        Dosen11 dosenTermuda = arrayOfDosen[0];
        for (Dosen11 dosen : arrayOfDosen) {
            if (dosen.usia < dosenTermuda.usia) {
                dosenTermuda = dosen;
            }
        }

        System.out.println("\n=== Dosen Paling Muda ===");
        dosenTermuda.tampilkanInfo();
    }
}
