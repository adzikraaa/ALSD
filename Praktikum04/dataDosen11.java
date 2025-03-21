package Praktikum04;

public class dataDosen11 {
        dosen11 [] dataDosen = new dosen11[10];
        int idx = 0;
    
        public void tambah(dosen11 dsn) {
            if (idx < dataDosen.length) {
                dataDosen[idx] = dsn;
                idx++;
            } else {
                System.out.println("Data penuh!");
            }
        }
    
        public void tampil() {
            for (int i = 0; i < idx; i++) {
                dataDosen[i].tampil();
            }
        }
    
        public void sortingASC() { // Bubble Sort ASC berdasarkan usia
            for (int i = 0; i < idx - 1; i++) {
                for (int j = 0; j < idx - i - 1; j++) {
                    if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                        dosen11 temp = dataDosen[j];
                        dataDosen[j] = dataDosen[j + 1];
                        dataDosen[j + 1] = temp;
                    }
                }
            }
        }
    
        public void sortingDSC() { // Selection Sort DSC berdasarkan usia
            for (int i = 0; i < idx - 1; i++) {
                int maxIdx = i;
                for (int j = i + 1; j < idx; j++) {
                    if (dataDosen[j].usia > dataDosen[maxIdx].usia) {
                        maxIdx = j;
                    }
                }
                dosen11 temp = dataDosen[maxIdx];
                dataDosen[maxIdx] = dataDosen[i];
                dataDosen[i] = temp;
            }
        }
    
        public void insertionSort() { // Insertion Sort ASC berdasarkan usia
            for (int i = 1; i < idx; i++) {
                dosen11 key = dataDosen[i];
                int j = i - 1;
                while (j >= 0 && dataDosen[j].usia > key.usia) {
                    dataDosen[j + 1] = dataDosen[j];
                    j--;
                }
                dataDosen[j + 1] = key;
            }
        }
    }
