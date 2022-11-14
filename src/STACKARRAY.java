import java.util.*;


public class STACKARRAY {
     static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
     Node top=null;

     void push(Scanner t)
    {
        System.out.println("enter data");
        int data= t.nextInt();

        Node newnode = new Node(data);
        if(top==null){
            top=newnode;
        }else{
            newnode.next=top;
            top=newnode;

        }

    }
    void pop(){

        if(top==null){
            System.out.println("stack is empty");
        }
        else{
            top=top.next;


        }
    }
    void display(){

        Node temp=top;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String arg[]){
        STACKARRAY sar=new STACKARRAY();
        int l;
        do {
            System.out.println("enter 1 for push");
            System.out.println("enter 2 for pop");
            System.out.println("enter 3 for display");
            System.out.println("enter your choice");
            Scanner t=new Scanner(System.in);
            int d=t.nextInt();
            switch (d) {
                case 1 -> sar.push(t);

                case 2 -> sar.pop();

                case 3 -> sar.display();
            }
            System.out.println("enter 0 for menu ");
            System.out.println("enter any key for exit");
            l=t.nextInt();

        }while(l==0);
        System.out.println("exit successfully");

    }


}