package Praktikum12;

public class Queue11Tugas {
     class Node {
        Mahasiswa11Tugas data;
        Node next;

        Node(Mahasiswa11Tugas data) {
            this.data = data;
        }
    }

     Node front, rear;
     int size;

    public Queue11Tugas() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return false; 
    }

    public void enqueue(Mahasiswa11Tugas mhs) {
        Node newNode = new Node(mhs);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println(mhs.nama + " berhasil ditambahkan ke dalam antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang bisa dipanggil.");
        } else {
            System.out.println("Memanggil: " + front.data);
            front = front.next;
            if (front == null) rear = null;
            size--;
        }
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    public void tampilkanAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Isi antrian:");
            Node temp = front;
            while (temp != null) {
                System.out.println("- " + temp.data);
                temp = temp.next;
            }
        }
    }

    public void tampilkanDepanDanBelakang() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian terdepan : " + front.data);
            System.out.println("Antrian terakhir : " + rear.data);
        }
    }

    public void tampilkanJumlah() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }
}
