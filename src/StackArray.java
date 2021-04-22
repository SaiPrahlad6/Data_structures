import java.util.*;

class Stack<T>{
    private int stackSize;
    private T[] stackArr;
    private int top;

    public Stack(int size) {
        this.stackSize = size;
        this.stackArr = (T[]) new Object[stackSize];
        this.top = -1;
    }

    public void push(T entry){
        //Fill your code here
        if(isStackFull() == false)
        {
            top = top + 1;
            stackArr[top] = entry;
        }
        else
            System.out.println("Stack is full");
    }
    public T peek() {
        //Fill your code here
        return stackArr[top];
    }

    public boolean isStackEmpty() {
        //Fill your code here
        if(top == -1)
            return true;
        return false;
    }

    public boolean isStackFull() {
        //Fill your code here
        if(top == stackSize -1 )
            return true;
        return false;
    }
    public T pop(){
        //Fill your code here
        if(true == isStackEmpty())
            return null;
        else
            return stackArr[top--];
    }

    public void display()
    {
        //Fill your code here
        if(top == -1)
            System.out.println(" {}");
        else{
            for(int i=0;i<=top;i++)
            {
                System.out.print(" "+stackArr[i]);
            }
            System.out.println();
        }
    }

}

public class StackArray {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
        System.out.println("1)Integer\n2)Double\n3)String");
        int o=sc.nextInt();
        if(o==1){
    System.out.println("Enter the size of the stack");
    int size = sc.nextInt();
    Stack<Integer> s=new Stack<>(size);
    do{
        System.out.println("MENU ");
        System.out.println("1 . PUSH 2. POP 3. DISPLAY 4. TOP 5.EXIT");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                int element= sc.nextInt();
                s.push(element);
                break;
            case 2:
                int pop= (int) s.pop();
                System.out.println("The popped element is " + pop);
                break;
            case 3:
                System.out.println("The stack elements are ");
                s.display();
                break;
            case 4:
                int top = (int) s.peek();
                System.out.print("The top element is "+ top);
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("Invalid inputs");
        }
    }while(true);
    }
        if (o == 2) {
            System.out.println("Enter the size of the stack");
            int size = sc.nextInt();
            Stack<Double> s2 = new Stack<Double>(size);
            while (true) {
                System.out.println("1.Push\n2.Pop\n3.Display\n4.top 5.exit");
                switch (sc.nextInt()) {
                    case 1:
                        double element= (double) sc.nextDouble();
                        s2.push(element);
                        break;
                    case 2:
                        double pop= (double) s2.pop();
                        System.out.println("The popped element is " + pop);
                        break;
                    case 3:
                        System.out.println("The stack elements are ");
                        s2.display();
                        break;
                    case 4:
                        double top = (double) s2.peek();
                        System.out.print("The top element is "+ top);
                        break;
                    case 5:
                        System.exit(0);
                    default:
                        System.out.println("Invalid inputs");
                }
            }
        }
        else{
            System.out.println("Enter the size of the stack");
            int size = sc.nextInt();
            Stack<String> s1=new Stack<>(size);
            do{
                System.out.println("MENU ");
                System.out.println("1 . PUSH 2. POP 3. DISPLAY 4. TOP 5.EXIT");
                int choice = sc.nextInt();
                sc.next();
                switch (choice){
                    case 1:
                        String element= sc.next();
                        s1.push(element);
                        break;
                    case 2:
                        String pop=  s1.pop();
                        System.out.println("The popped element is " + pop);
                        break;
                    case 3:
                        System.out.println("The stack elements are ");
                        s1.display();
                        break;
                    case 4:
                        String top =  s1.peek();
                        System.out.print("The top element is "+ top);
                        break;
                    case 5:
                        System.exit(0);
                    default:
                        System.out.println("Invalid inputs");
                }
            }while(true);
        }
}
}

