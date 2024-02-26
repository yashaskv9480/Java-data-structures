package Linked_List;

public class LL {
    private class Node{
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size = 0;
    public void insertlast(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
        }
        else {
            Node last = head;
            while(last.next != null){
                last = last.next;
            }
            last.next = node;
        }
        size++;
    }
    public void insertfirst(int value){
        Node node = new Node(value);
        if(head != null){
            node.next = head;
            head = node;
        }
        else{
            head = node;
        }
        size++;
    }
    public void insert(int value,int index){
        if(index == 0){
            insertfirst(value);
            return;
        }
        if(index == size){
            insertlast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
                temp = temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next = node;
        size++;
    }

    public void deletefirst(){
        if(head == null){
            System.out.println("List is empty");
        }
        if(head == tail){
            head = null;
            return;
        }
        head = head.next;
        size -- ;
    }

    public void deletelast(){
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
    }

    public void find(int value){
        Node temp = head;
        int pos = 1;
        for (int i = 0; i < size; i++) {
            if(temp.value == value){
                System.out.println("The element is at position "+ pos);
                return;
            }
            else{
                temp = temp.next;
                pos++;
            }
        }
        System.out.println("Not found");
    }
    public void delete(int index){
        if(index == 1){
            deletefirst();
        }
        if(index == size-1)
            deletelast();
        Node prev = get(index -1);
        prev.next = prev.next.next;
    }

    public Node get(int index){
            Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("End");
        System.out.println("Size is " + size);
    }
}
