package Praktikum03;

public class mahasiswa {
    String nama;
    int nim;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;

    public mahasiswa(String nama, int nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
}

 class DivideAndConquer {
    
    public static int findMaxUTS(int[] uts, int left, int right) {
        if (left == right) {
            return uts[left];
        }
        int mid = (left + right) / 2;
        int maxLeft = findMaxUTS(uts, left, mid);
        int maxRight = findMaxUTS(uts, mid + 1, right);
        return Math.max(maxLeft, maxRight);
    }

    public static int findMinUTS(int[] uts, int left, int right) {
        if (left == right) {
            return uts[left];
        }
        int mid = (left + right) / 2;
        int minLeft = findMinUTS(uts, left, mid);
        int minRight = findMinUTS(uts, mid + 1, right);
        return Math.min(minLeft, minRight);
    }
}

class BruteForce {
        public static double findAverageUAS(int[] uas) {
        int sum = 0;
        for (int nilai : uas) {
            sum += nilai;
        }
        return (double) sum / uas.length;
    }
}