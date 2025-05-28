package Praktikum03;

public class Faktorial11 {
    public int nilai;

    public Faktorial11(int nilai) {
        this.nilai = nilai;
    }

    // Metode faktorial brute force
    public int faktorialBF() {
        int hasil = 1;
        for (int i = 1; i <= nilai; i++) {
            hasil *= i;
        }
        return hasil;
    }
}
