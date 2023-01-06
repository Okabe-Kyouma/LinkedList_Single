package LinkedList;

public class LinkedList {

    public Node Head;

    public void insertAtBeg(int data){

        Node node = new Node(data);

        if(Head==null){

            Head = node;

        }
        else{

            Node n = Head;

          node.setNext(n);

          Head = node;

        }


    }


    public void insertAtMid(int data,int index){

        Node node = new Node(data);

        Node n = Head;

        for (int i = 0; i < index - 1; i++) {

            n = n.getNext();

        }

       node.setNext(n.getNext());
        n.setNext(node);




    }


    public void insertAtEnd(int data){

        Node node = new Node(data);

        Node n = Head;

        while(n.getNext()!=null){

            n = n.getNext();

        }

         n.setNext(node);


    }


    public void deleteNode(int index){

        Node n = Head;

        if(index==0){
            Head = n.getNext();
        }
        else{

            for (int i = 0; i < index-1; i++) {

                    n = n.getNext();

                }

                 n.setNext(n.getNext().getNext());

            }

        }

    public void displayLinkedList(){

        Node n = Head;

        while(n.getNext()!=null){

            System.out.println(n.getData());
            n = n.getNext();
        }

        System.out.println(n.getData());

    }


    public String firstOccur(int data){

        int count = 0;

        Node n = Head;

        while(n.getNext()!=null){
            count++;
            if(n.getData()==data){

                return "Data Found At " + count + " th node";

            }

           n = n.getNext();

        }

        if(n.getData()==data) {
            count++;
            return "Data Found At " + count + " th node";
        }
        return "Data Doesn't exist in LinkedList";

    }

    public String lastOccur(int data){

        Node n = Head;

        int count= 0;

        String str = "Data Doesn't exist in LinkedList";

        while(n.getNext()!=null){
            count++;
            if(data==n.getData()){
                str = "Data found at " + count + " node";
            }

            n = n.getNext();
        }

        if(data==n.getData()){
           count++;

           return "Data found at " + count + " node";

        }

          return str;


    }


    public void totalOccur(){

        Node n = Head;
        Node n2;
        int count;
        String repeatedValue = "0";

        while(n.getNext()!=null){
            n2 = Head;
            count = 0;
            int value = n.getData();

            if(repeatedValue.contains(String.valueOf(value))){
                n = n.getNext();
                value = n.getData();
            }

            while(n2.getNext()!=null){
                if(value==n2.getData())
                    count++;
                n2 = n2.getNext();
            }

            if(count==0)
                System.out.println("Data Doesn't Exist");
            else
                System.out.println(n.getData() + " Occurs " + count + " times");
            repeatedValue = value + "";

            n = n.getNext();
        }
    }


    public void ifDataFoundThenInsertNewDataBeforeThatIndex(int dataToBeFound,int dataToBeInserted){

        Node node = new Node(dataToBeInserted);

        Node n = Head;

        int count = 0;

        while(n!=null){
            count++;

            if(n.getData()==dataToBeFound){
                break;
            }

            n = n.getNext();
        }

        n = Head;

        for (int i = 1; i < count-1; i++) {

            n = n.getNext();

        }

        node.setNext(n.getNext());
        n.setNext(node);





    }

    public void fDataFoundThenInsertNewDataAfterThatIndex(int dataToBeFound,int dataToBeInserted){


        Node node = new Node(dataToBeInserted);

        Node n = Head;

        int count = 0;

        while(n!=null){
            count++;

            if(n.getData()==dataToBeFound){
                break;
            }

            n = n.getNext();
        }

        n = Head;

        for (int i = 1; i < count; i++) {

            n = n.getNext();

        }

        node.setNext(n.getNext());
        n.setNext(node);


    }







}
