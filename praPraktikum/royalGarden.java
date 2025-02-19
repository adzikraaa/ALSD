package praPraktikum;

public class royalGarden {
    
    static int HARGA_AGLONEMA = 75000;
    static int HARGA_KELADI = 50000;
    static int HARGA_ALOCASIA = 60000;
    static int HARGA_MAWAR = 10000;

    
    static int[][] stokBunga = {
        {10, 5, 15, 7},  // RoyalGarden 1
        {6, 11, 9, 12},  // RoyalGarden 2
        {2, 10, 10, 5},  // RoyalGarden 3
        {5, 7, 12, 9}    // RoyalGarden 4
    };

    static String[] namaCabang = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};

    public static void main(String[] args) {
        tampilkanPendapatanCabang();
        tampilkanTotalStokBunga();
        kurangiStokBunga();
        tampilkanTotalStokBunga();
    }

  
    public static void tampilkanPendapatanCabang() {
        System.out.println("Pendapatan Setiap Cabang Jika Semua Bunga Terjual:");
        System.out.println("====================================================");

        for (int i = 0; i < stokBunga.length; i++) {
            int pendapatan = (stokBunga[i][0] * HARGA_AGLONEMA) +
                             (stokBunga[i][1] * HARGA_KELADI) +
                             (stokBunga[i][2] * HARGA_ALOCASIA) +
                             (stokBunga[i][3] * HARGA_MAWAR);
            System.out.println(namaCabang[i] + ": Rp" + pendapatan);
        }
        System.out.println("====================================================\n");
    }

   
    public static void tampilkanTotalStokBunga() {
        int totalAglonema = 0, totalKeladi = 0, totalAlocasia = 0, totalMawar = 0;

        for (int i = 0; i < stokBunga.length; i++) {
            totalAglonema += stokBunga[i][0];
            totalKeladi += stokBunga[i][1];
            totalAlocasia += stokBunga[i][2];
            totalMawar += stokBunga[i][3];
        }

        System.out.println("Total Stok Bunga di Semua Cabang:");
        System.out.println("====================================================");
        System.out.println("Aglonema : " + totalAglonema);
        System.out.println("Keladi   : " + totalKeladi);
        System.out.println("Alocasia : " + totalAlocasia);
        System.out.println("Mawar    : " + totalMawar);
        System.out.println("====================================================\n");
    }

    public static void kurangiStokBunga() {
        int[] bungaMati = {-1, -2, 0, -5}; 

        for (int i = 0; i < stokBunga.length; i++) {
            for (int j = 0; j < stokBunga[i].length; j++) {
                stokBunga[i][j] += bungaMati[j]; 
                if (stokBunga[i][j] < 0) stokBunga[i][j] = 0;
            }
        }

        System.out.println("Stok bunga telah diperbarui setelah ada bunga yang mati.\n");
        
    }
}
