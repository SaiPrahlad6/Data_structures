import java.util.*;
class HashTable1<K extends Integer,V>
{
    K[] keys;
    V[] values;
    int size;
    HashTable1(int size)
    {
        this.size=size;
        keys=(K[]) new Integer[size];
        values=(V[]) new String[size];
    }
    public int hash(K key)
    {
        return (int)key%size;
    }
    public void insert(K key,V value)
    {
        int hashKey=hash(key);
        int i=hashKey;
        while(true){
            if(keys[i]==null)  //no collision, direct insertion
            {
                keys[i]=key;
                values[i]=value;
                break;
            }
            else if(keys[i]==key)   //key already exists,update value
            {
                values[i]=value;
                break;
            }
            //else
            i=(i+1)%size;
            if(i==hashKey)  //all slots after collision have been checked
            {
                System.out.println("insertion not possible");
                break;
            }
        }
    }
    public boolean find(K key)
    {
        int i=hash(key),t=i;
        do
        {
            if(keys[t]==key)
                return true;
            t=(t+1)%size;
        }while(t!=i);
        return false;
    }
    public void remove(K key)
    {
        if(find(key)==false)
            System.out.println("key doesn't exist");
        else{
            int i=hash(key);
            keys[i]=null;
            values[i]=null;
        }
    }
    public V get(K key)
    {
        V x=null;
        for(int i=0;i<size;i++)
        {
            if(keys[i]==key)
            {
                x=values[i];
                break;
            }
        }
        return x;
    }
    public void print()
    {
        for(int i=0;i<size;i++)
            if(keys[i]!=null)
                System.out.println(i+" ("+keys[i]+","+values[i]+")");
    }
}
class LinearProb
{
    public static void main(String []args)
    {
        int size;
        Scanner s=new Scanner(System.in);
        System.out.println("enter size");
        size=s.nextInt();
        HashTable1<Integer,String> table=new HashTable1<>(size);
        while(true)
        {
            System.out.println("1)insert\n2)remove\n3)get value\n4)display\n5)exit");
            int o=s.nextInt();
            switch(o)
            {
                case 1:
                    System.out.println("enter key");
                    int k=s.nextInt();
                    System.out.println("enter value");
                    s.nextLine();
                    String v=s.nextLine();
                    table.insert(k,v);
                    break;
                case 2:
                    System.out.println("enter key");
                    k=s.nextInt();
                    table.remove(k);
                    break;
                case 3:
                    System.out.println("enter key");
                    k=s.nextInt();
                    Object x=table.get(k);
                    if(x==null)
                        System.out.println("key doesn't exist");
                    else
                        System.out.println("value is "+x);
                    break;
                case 4:
                    table.print();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}