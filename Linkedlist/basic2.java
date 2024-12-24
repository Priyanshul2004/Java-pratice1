class Node{
    int value;
    Node next;

    public Node(){}

    public Node(int value){
        this.value = value;
        this.next = null;
    }
}
class Sll1{
    Node head;
    Node tail;

    int size(){
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    void insertathead(int val){
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        }else{
            temp.next = head;
            head = temp;
        }
    }

    void inseratend(int val){
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        }else{
            tail.next = temp;
            tail = temp;
        }
    }

    void inseratmid(int idx,int val){
        if (head == null) {
            insertathead(val);
            return;
        }
        Node temp = new Node(val);
        Node temp2 = head;
        for (int i = 1; i <= idx-1; i++) {
            temp2 = temp2.next;
        }
        temp.next = temp2.next;  
        temp2.next = temp;
    }

    int geteleofidx(int idx){
        Node temp = head;
        for (int i = 1; i <= idx-1; i++) {
            temp = temp.next;
        }
        return temp.value;
    }

    void deletebyhead(){
        if (head == null) {
            System.out.println("LL is null");
            return;
        }else{
            head = head.next;
        }
    }

    void deletebyidx(int idx){
        if (idx == 0) {
            deletebyhead();
        }else if (head == null) {
            System.out.println("Invalid syntex");
            return;
        }
        Node temp = head;
        for (int i = 1; i <= idx-2; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    void display(){
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
public class basic2 {
    public static void main(String[] args) {
        Sll1 list = new Sll1();
        list.inseratend(1);
        list.inseratend(2);
        list.inseratend(3);
        list.inseratend(4);
        list.insertathead(10);
        list.inseratmid(2, 22);
        list.deletebyhead();
        list.deletebyidx(3);
        
        list.display();
        System.out.println("Size of ll = "+list.size());
        System.out.println("ele by idx = "+list.geteleofidx(1));
    }
}