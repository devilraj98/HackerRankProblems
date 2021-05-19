package geeksterClass.LinkedListImplementation;


class LinkedList {

    class Node {
        int data;
        Node next;


         Node(int data) {
            this.data = data;
        }

    }

    Node head;


    public void insert(int d) {
        Node newNode = new Node(d);
        if (head == null)
            head = newNode;

        else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;

        }


    }
    public void print() {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ==>");
            temp = temp.next;
        }
    }


}



