package Praktikum13;

public class DoubleLinkedLists {
    Node11 head, tail;

    public DoubleLinkedLists() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa11 data) {
        Node11 newNode = new Node11(null, data, head);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa11 data) {
        Node11 newNode = new Node11(tail, data, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa11 data) {
        Node11 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current != null) {
            Node11 newNode = new Node11(current, data, current.next);
            if (current.next != null) {
                current.next.prev = newNode;
            } else {
                tail = newNode;
            }
            current.next = newNode;
        }
    }

    public void add(Mahasiswa11 data, int index) {
        if (index == 0) {
            addFirst(data);
        } else {
            Node11 temp = head;
            for (int i = 0; i < index - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp != null && temp.next != null) {
                Node11 newNode = new Node11(temp, data, temp.next);
                temp.next.prev = newNode;
                temp.next = newNode;
            } else {
                addLast(data);
            }
        }
    }

    public void print() {
        if (!isEmpty()) {
            Node11 tmp = head;
            System.out.println("Isi Linked List:");
            while (tmp != null) {
                tmp.data.tampil();
                System.out.println("------------------");
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void removeFirst() {
        if (!isEmpty()) {
            System.out.println("Data yang dihapus:");
            head.data.tampil();
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void removeLast() {
        if (!isEmpty()) {
            System.out.println("Data yang dihapus:");
            tail.data.tampil();
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            } else {
                head = null;
            }
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void removeAfter(String keyNim) {
        Node11 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current != null && current.next != null) {
            Node11 temp = current.next;
            System.out.println("Data yang dihapus:");
            temp.data.tampil();
            current.next = temp.next;
            if (temp.next != null) {
                temp.next.prev = current;
            } else {
                tail = current;
            }
        }
    }

    public void remove(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node11 temp = head;
            for (int i = 0; i < index && temp != null; i++) {
                temp = temp.next;
            }
            if (temp != null) {
                System.out.println("Data yang dihapus:");
                temp.data.tampil();
                if (temp.prev != null) temp.prev.next = temp.next;
                if (temp.next != null) temp.next.prev = temp.prev;
                if (temp == tail) tail = temp.prev;
            }
        }
    }

    public Mahasiswa11 getFirst() {
        return head != null ? head.data : null;
    }

    public Mahasiswa11 getLast() {
        return tail != null ? tail.data : null;
    }

    public Mahasiswa11 getIndex(int index) {
        Node11 temp = head;
        for (int i = 0; i < index && temp != null; i++) {
            temp = temp.next;
        }
        return temp != null ? temp.data : null;
    }

    public int size() {
        int count = 0;
        Node11 temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}

