import java.util.*;
class Node1<T>
{
    T data;
    Node1<T> next;
    Node1(T d)
    {
        data=d;
        next=null;
    }
}
class Queue1<T>
{
    Node1 <T> front,rear;
    Queue1()
    {
        front=rear=null;
    }
    void enqueue(T ele)
    {
        Node1<T> temp=new Node1<>(ele);
        if(rear==null)
            front=rear=temp;
        else
        {
            rear.next=temp;
            rear=temp;
        }
    }
    T dequeue()
    {
        T x=null;
        if(rear==null)
            System.out.println("empty");
        else
        {

            x=front.data;
            if(front==rear)
                front=rear=null;
            else
                front=front.next;

        }
        return x;
    }
    public void disp()
    {
        if(rear==null)
            System.out.println("empty");
        else
        {
            Node1<T> temp=front;
            while(temp!=null)
            {
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
        }
    }
}
class QueueLinked
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1)Integer\n2)String");
        int o=sc.nextInt();

        if(o==1)
        {
            Queue1<Integer> st1=new Queue1<>();
            while(true)
            {
                System.out.println("1)enqueue\n2)dequeue\n3)display\n4)exit");
                int o1=sc.nextInt();
                int ele;
                switch(o1)
                {
                    case 1:
                        System.out.println("enter element");
                        ele=sc.nextInt();
                        st1.enqueue(ele);

                        break;
                    case 2:
                        st1.dequeue();
                        break;
                    case 3:
                        st1.disp();
                        break;
                    case 4:
                        System.exit(0);
                }
            }
        }
        else{
            Queue1<String> st2=new Queue1<>();
            while(true)
            {
                System.out.println("1)enqueue\n2)dequeue\n3)display\n4)exit");
                int o1=sc.nextInt();
                switch(o1)
                {
                    case 1:
                        System.out.println("enter element");
                        st2.enqueue(sc.next());

                        break;
                    case 2:
                        st2.dequeue();
                        break;
                    case 3:
                        st2.disp();
                        break;
                    case 4:
                        System.exit(0);
                }
            }
        }

    }
}