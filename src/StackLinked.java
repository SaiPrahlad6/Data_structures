import java.util.*;
class Node<T>
{
    T data;
    Node<T> link;
    Node(T d)
    {
        data=d;
        link=null;
    }
}

class StackL<T>
{
    Node<T> top;
    StackL()
    {
        top=null;
    }
    void push(T ele)
    {
        Node<T> temp=new Node<>(ele);
        temp.link = top;
        top = temp;
        //System.out.println(top.data);
    }

    T peek()
    {
        if(top==null)
        {
            System.out.println("empty");
            return null;
        }else
            return top.data;
    }
    T pop()
    {
        T ele=null;

        if(top==null)
            System.out.println("empty");
        else{
            ele = top.data;
            Node<T> t = top;
            top = top.link;
            t.link = null;
        }
        return ele;
    }
    void disp()
    {

        if(top==null)
            System.out.println("empty");
        else{

            Node<T> walk = top;
            while(walk!=null)
            {
                System.out.println(walk.data);
                walk = walk.link;
            }
        }
    }
}

class StackLinked
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1)Integer\n2)String");
        int o=sc.nextInt();

        if(o==1){
            StackL<Integer> st1=new StackL<>();
            while(true)
            {

                System.out.println("1)push\n2)pop\n3)display\n4)exit\n5)top");
                int o1=sc.nextInt();
                switch(o1)
                {
                    case 1:
                        System.out.println("enter element");

                        int ele=sc.nextInt();
                        st1.push(ele);
                        break;
                    case 2:
                        st1.pop();
                        break;
                    case 3:
                         st1.disp();
                        break;
                    case 4:
                        System.exit(0);
                    case 5:
                        int top=st1.peek();
                        System.out.println("The top element is"+ top);
                        break;
                }
            }
        }
        else{
            StackL<String> st2=new StackL<>();
            while(true)
            {

                System.out.println("1)push\n2)pop\n3)display\n4)exit\n5)top");
                int o1=sc.nextInt();
                switch(o1)
                {
                    case 1:
                        System.out.println("enter element");

                        st2.push(sc.next());
                        break;
                    case 2:
                        st2.pop();
                        break;
                    case 3:
                        st2.disp();
                        break;
                    case 4:
                        System.exit(0);
                    case 5:
                        String top=st2.peek();
                        System.out.println("The top element is"+ top);
                        break;
                }
            }
        }
    }
}