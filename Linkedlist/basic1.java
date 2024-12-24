class Node {
    int value;
    Node next;

    public Node() {
    }

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class basic1 {
    public static void main(String[] args) {
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(5);
        Node n5 = new Node(6);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        System.out.println(n1.value);

        Node temp = n1;
        for (int i = 0; i < 5; i++) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}