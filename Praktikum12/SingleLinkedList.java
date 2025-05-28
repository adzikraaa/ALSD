package Praktikum12;

public class SingleLinkedList {
    NodeMahasiswa11 head;
    NodeMahasiswa11 tail;

public boolean isEmpty() {
    return (head == null);
}
public void print() {
    if (!isEmpty()) {
        NodeMahasiswa11 temp = head;
        System.out.print("Isi Linked List:\t");
        while (temp != null) {
            temp.data.tampilInformasi();
            temp = temp.next;
        }
        System.out.println("");
    } else {
        System.out.println("Linked List kosong");
    }
}
public void addFirst(Mahasiswa11 input) {
    NodeMahasiswa11 ndInput = new NodeMahasiswa11(input, null);
    if (isEmpty()) {
        head = ndInput;
        tail = ndInput;
    } else {
        ndInput.next = head;
        head = ndInput;
    }
}
public void addLast(Mahasiswa11 input) {
    NodeMahasiswa11 ndInput = new NodeMahasiswa11(input, null);
    if (isEmpty()) {
        head = ndInput;
        tail = ndInput;
    } else {
        tail.next = ndInput;
        tail = ndInput;
    }
}
public void insertAfter(String key, Mahasiswa11 input) {
    NodeMahasiswa11 ndInput = new NodeMahasiswa11(input, null);
    NodeMahasiswa11 temp = head;

    while (temp != null) { 
        if (temp.data.nama.equalsIgnoreCase(key)) { 
            ndInput.next = temp.next; 
            temp.next = ndInput; 
            
            if (ndInput.next == null) { 
                tail = ndInput;
            }
            break;
        }
        temp = temp.next;
    }
}
public void insertAt(int index, Mahasiswa11 input) {
    if (index < 0) {
        System.out.println("Indeks salah");
    } else if (index == 0) {
        addFirst(input);
    } else {
        NodeMahasiswa11 temp = head;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        temp.next = new NodeMahasiswa11(input, temp.next);
        if (temp.next.next == null) { 
            tail = temp.next;
        }
    }
}
public void getData(int index) {
    NodeMahasiswa11 temp = head;
    for (int i = 0; i < index; i++) {
        temp = temp.next;
    }
    temp.data.tampilInformasi();
}
public int indexOf(String key) {
    NodeMahasiswa11 tmp = head;
    int index = 0;
    while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
        tmp = tmp.next;
        index++;
    }
    return (tmp == null) ? -1 : index;
}
public void removeFirst() {
    if (isEmpty()) {
        System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
    } else if (head == tail) {
        head = tail = null;
    } else {
        head = head.next;
    }
}
public void removeLast() {
    if (isEmpty()) {
        System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
    } else if (head == tail) {
        head = tail = null;
    } else {
        NodeMahasiswa11 temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }
}
public void remove(String key) {
    if (isEmpty()) {
        System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
    } else {
        NodeMahasiswa11 temp = head;
        while (temp != null) {
            if (temp.data.nama.equalsIgnoreCase(key) && (temp == head)) {
                this.removeFirst();
                break;
            } else if (temp.data.nama.equalsIgnoreCase(key)) {
                temp.next = temp.next.next;
                if (temp.next == null) {
                    tail = temp;
                }
                break;
            }
            temp = temp.next;
        }
    }
}
public void removeAt(int index) {
    if (index == 0) {
        removeFirst();
    } else {
        NodeMahasiswa11 temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if (temp.next == null) {
            tail = temp;
        }
    }
}




}