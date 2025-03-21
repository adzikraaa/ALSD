package Praktikum03;

public class mainMahasiswa {
    public static void main(String[] args) {
      
        mahasiswa[] data = {
            new mahasiswa("Ahmad", 220101001, 2022, 78, 82),
            new mahasiswa("Budi", 220101002, 2022, 85, 88),
            new mahasiswa("Cindy", 220101003, 2021, 90, 87),
            new mahasiswa("Dian", 220101004, 2021, 76, 79),
            new mahasiswa("Eko", 220101005, 2023, 92, 95),
            new mahasiswa("Fajar", 220101006, 2020, 88, 85),
            new mahasiswa("Gina", 220101007, 2023, 80, 83),
            new mahasiswa("Hadi", 220101008, 2020, 82, 84)
        };

        int[] uts = new int[data.length];
        int[] uas = new int[data.length];

        for (int i = 0; i < data.length; i++) {
            uts[i] = data[i].nilaiUTS;
            uas[i] = data[i].nilaiUAS;
        }

        int maxUTS = DivideAndConquer.findMaxUTS(uts, 0, uts.length - 1);
        int minUTS = DivideAndConquer.findMinUTS(uts, 0, uts.length - 1);

        
        double avgUAS = BruteForce.findAverageUAS(uas);

        System.out.println("Nilai UTS Tertinggi (DC): " + maxUTS);
        System.out.println("Nilai UTS Terendah (DC): " + minUTS);
        System.out.println("Rata-rata Nilai UAS (BF): " + avgUAS);
    }
}