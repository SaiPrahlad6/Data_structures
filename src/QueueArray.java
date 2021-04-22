import java.util.Scanner;

interface Queue<T>{
    void enque(T ele) ;
    void deque();
    void display();
}

class MyQueue<T> implements Queue<T>{
    T arr[];
    int cap;
    int front,rear;
    MyQueue(T arr[]){
        this.arr = arr;
        front=rear = -1;
        cap = arr.length;
    }
    @Override
    public void enque(T ele)  {
        // TODO Auto-generated method stub
        if(rear == cap-1)
            System.out.println("Stack is Full");
        if(rear == -1)
        {
            arr[++front] = arr[++rear] = ele;
        }
        else {
            arr[++rear] = ele;
        }
    }


    @Override
    public void deque(){
        // TODO Auto-generated method stub
        if(front <= cap-1 && front != -1)
        {
            T ele = arr[front];
            for(int i=0;i<arr.length-1;i++)
                arr[i] = arr[i+1];
            rear--;
            if(rear == -1)
            {
                front = rear = -1;
            }
            System.out.println("The popped element is " + ele);
        }
        else {
            System.out.println("Stack is Empty");
        }
    }

    @Override
    public void display(){
        // TODO Auto-generated method stub
        if(front == -1 && rear == -1)
            System.out.println("Stack is Empty");
        for(int i=front;i<=rear;i++)
            System.out.println(arr[i]);
        System.out.println();
    }


}
class QueueArray{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("1)Integer\n2)String");
        int o = s.nextInt();
        if (o == 1) {
            Integer i[] = new Integer[5];
            MyQueue<Integer> m = new MyQueue<Integer>(i);
            while (true) {
                System.out.println("1.Push\n2.Pop\n3.Display\n4.Exit");
                switch (s.nextInt()) {
                    case 1:
                        System.out.println("Enter to push");

                        m.enque(s.nextInt());
                        break;
                    case 2:
                        m.deque();
                        break;
                    case 3:
                        m.display();
                        break;
                    case 4:
                        System.exit(0);
                }
            }
        }
        else {
            String i1[] = new String[5];
            MyQueue<String> m1 = new MyQueue<>(i1);
            while (true) {
                System.out.println("1.Push\n2.Pop\n3.Display\n4.Exit");
                switch (s.nextInt()) {
                    case 1:
                        s.next();
                        System.out.println("Enter to push");
                        m1.enque(s.next());
                        break;
                    case 2:
                        m1.deque();
                        break;
                    case 3:
                        m1.display();
                        break;
                    case 4:
                        System.exit(0);
                }
            }

        }
    }
}

