package Linked_List;

public class Main {
    public static void main(String[] args) {
        LL demo = new LL();
        demo.insertlast(5);
        demo.insertlast(3);
        demo.insertlast(4);
        demo.insertlast(5);
        demo.insertlast(3);
        demo.insertfirst(15);
        demo.insert(1,6);
        demo.deletefirst();
//        demo.deletelast();
        demo.display();
    }


}
