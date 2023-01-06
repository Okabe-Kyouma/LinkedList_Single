package LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insertAtBeg(5);
        list.insertAtBeg(4);
        list.insertAtBeg(2);
        list.insertAtBeg(1);
        list.insertAtMid(1,2);
        list.insertAtEnd(5);
        list.insertAtEnd(7);
        list.insertAtEnd(8);

       list.fDataFoundThenInsertNewDataAfterThatIndex(4,10);

       // System.out.println(list.lastOccur(8));

     //   list.totalOccur();

       // list.deleteNode(7);

        list.displayLinkedList();



    }

}
