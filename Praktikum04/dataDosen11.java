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
        public void pencarianDataSequential(String nama) {
            boolean ditemukan = false;
            int count = 0; 
        
            for (int i = 0; i < idx; i++) {
                if (dataDosen[i].nama.equalsIgnoreCase(nama)) { 
                    dataDosen[i].tampil();
                    ditemukan = true;
                    count++;
                }
            }
        
            if (!ditemukan) {
                System.out.println("Dosen dengan nama '" + nama + "' tidak ditemukan.");
            } else if (count > 1) {
                System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan nama yang sama!");
            }
        }
        
        public void pencarianDataBinary(int usia) {
            sortingASC(); 
            int left = 0, right = idx - 1;
            boolean ditemukan = false;
            int count = 0; // Hitung jumlah hasil pencarian
        
            while (left <= right) {
                int mid = left + (right - left) / 2;
        
                if (dataDosen[mid].usia == usia) {
                    System.out.println("Dosen ditemukan:");
                    int tempMid = mid;
        
                    // Cari ke kiri
                    while (tempMid >= 0 && dataDosen[tempMid].usia == usia) {
                        dataDosen[tempMid].tampil();
                        count++;
                        tempMid--;
                    }
        
                    // Cari ke kanan
                    tempMid = mid + 1;
                    while (tempMid < idx && dataDosen[tempMid].usia == usia) {
                        dataDosen[tempMid].tampil();
                        count++;
                        tempMid++;
                    }
        
                    ditemukan = true;
                    break;
                } else if (dataDosen[mid].usia < usia) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        
            if (!ditemukan) {
                System.out.println("Dosen dengan usia " + usia + " tidak ditemukan.");
            } else if (count > 1) {
                System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan usia yang sama!");
            }
        }
        
    }
