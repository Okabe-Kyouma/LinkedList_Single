package LinkedList;

public class Node {

    private int data;
    private Node next;

    //Constructor

    public Node(int data){
        this.data = data;
        next = null;
    }


    //Getters and Setters

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
