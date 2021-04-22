import java.util.ArrayList;
import java.util.Scanner;
class Heap
{
    ArrayList<Integer> a;
    int n;

    Heap()
    {
        //    a=new ArrayList<Integer>(s);
        n=0;
    }

    void HeapInit(ArrayList<Integer> arr,int no)
    {       a=arr;
        n=no;

        int i;

        for(i = n/2; i >= 1; i--)

        {

            Heapify(a,i,n);

        }
    }


    void Heapify(ArrayList<Integer> a, int i, int n)

    {

        int chi, node;
        node = a.get(i);
        chi = 2 * i;
        while (chi <= n)
        {
            if (chi < n && a.get(chi+1) > a.get(chi))
                chi = chi + 1;
            if (node > a.get(chi))
                break;
            else
            {
                a.set(chi/2, a.get(chi));
                chi = 2 * chi;
            }
        }
        a.set(chi/2,node);
    }

    void display()
    {

        System.out.println(" Max Heap");

        for (int i = 1; i <= n; i++)
        {
            System.out.println(a.get(i));
        }
    }

    void  HeapSort()
    {
        int tmp,i;
        for(i=n;i>1;i--)
        {
            tmp=a.get(1);
            a.set(1,a.get(i));
            a.set(i,tmp);

            Heapify(a,1,i-1);
        }
    }

    int top()
    {
        return a.get(1);
    }

    void pop()
    {
        a.set(1,a.get(n));
        n--;
        Heapify(a,1,n);
    }

};
class HeapSort
{
    public static void main(String[] args)

    {

        int ne, i, x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        ne=sc.nextInt();

        ArrayList<Integer> al = new ArrayList<Integer>(ne);
        al.add(0);
        for (i = 1; i <= ne; i++)

        {

            System.out.println("enter element");
            x=sc.nextInt();
            al.add(i,x);
            System.out.println(al.get(i));
        }


        Heap h = new Heap();
        h.HeapInit(al,ne);
        h.display();

        System.out.println("Heap sort ");
        h.HeapSort();
        h.display();
/*
        System.out.println(" top element " + h.top());

        System.out.println(" Heap after Deleting the max ");
        h.pop();
        h.display();

*/

    }
}

