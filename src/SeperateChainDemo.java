import java.util.*;
interface Map <K extends Comparable<K>,V>
{
    public void insert(Hash<K,V> p);
    public boolean isEmpty();
    public void display();
    public Hash <K,V> find(K key);
    public Hash <K,V> remove(K key);
}
class Hash<K extends Comparable<K>,V>
{
    K key;
    V values;
    Hash(K k,V v)
    {
        key=k;
        values=v;
    }
    public String toString(){
        return "("+key+"("+values+"))";
    }
}

class HashNode<K extends Comparable<K>,V>
{
    Hash<K,V> data;
    HashNode<K,V> link;
    HashNode(){};
    HashNode(Hash<K,V> d,HashNode<K,V> l)
    {
        data=d;
        link=l;
    }
}
class SortedChain<K extends Comparable<K>,V> implements Map<K,V>
{
    int dsize;
    HashNode<K,V> head;
    public SortedChain()
    {
        head=null;
        dsize=0;
    }
    public boolean isEmpty()
    {
        return head==null;
    }
    public void insert(Hash<K,V> p)
    {
        HashNode<K,V> newnode=new HashNode<K,V>(p,null);
        if(head==null)
            head=newnode;
        else
        {
            HashNode<K,V>temp=head;
            HashNode<K,V>prev=null;
            while(temp!=null && p.key.compareTo(temp.data.key)>0)
            {
                prev=temp;
                temp=temp.link;
            }
            if(temp!=null && temp.data.key==p.key){
                System.out.println("Duplicates not allowed");
            }
            else{
                newnode.link=temp;
                if(prev==null)
                    head=newnode;
                else
                    prev.link=newnode;
            }
        }
    }
    public void display()
    {
        if(isEmpty())
            System.out.println("Chain is empty");
        else{
            HashNode<K,V>temp=head;
            while(temp!=null)
            {
                System.out.println(temp.data);
                temp=temp.link;
            }
        }
    }
    public Hash<K,V> find(K key)
    {
        if(isEmpty())
            System.out.println("Chain is empty");
        else{
            HashNode<K,V>temp=head;
            while(temp!=null && key.compareTo(temp.data.key)>0){
                temp=temp.link;
            }
            if(temp==null)
                System.out.println("Key not found");
            else if(key.compareTo(temp.data.key)<0)
                System.out.println("Key not found");
            else
                return temp.data;
        }
        return null;
    }
    public Hash<K,V> remove(K key)
    {
        if(isEmpty())
            return null;
        else{
            HashNode<K,V>prev=null;
            HashNode <K,V>temp=head;
            while(temp!=null && key.compareTo(temp.data.key)>0){
                prev=temp;
                temp=temp.link;
            }
            if(temp==null){
                return null;
            }
            else if(key.compareTo(temp.data.key)<0)
                return null;
            else{
                if(temp==head)
                    head=temp.link;
                else
                    prev.link=temp.link;
                return temp.data;
            }

        }
    }
}

class SeperateChainDemo
{
    public static void main(String args[])
    {
        ArrayList<SortedChain<Integer,String>> ht=new ArrayList<SortedChain<Integer,String>>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<11;i++)
            ht.add(i,new SortedChain<Integer,String>());
        while(true){
            System.out.println("1-Insert 2-delete 3-find 4-display 5-exit");
            switch(sc.nextInt())
            {
                case 1:System.out.println("enter key and value to insert");
                    int k=sc.nextInt();
                    String val=sc.next();
                    Hash<Integer,String> p=new Hash<Integer,String>(k,val);
                    ht.get(k%11).insert(p);
                    break;
                case 2:System.out.println("enter key to delete");
                    int j=sc.nextInt();
                    Hash<Integer,String>p1=ht.get(j%11).remove(j);
                    if(p1==null)
                        System.out.println("pair not found");
                    else
                        System.out.println("deleted key: "+p1);
                    break;
                case 3:System.out.println("enter key to search");
                    int f=sc.nextInt();
                    Hash<Integer,String>p2=ht.get(f%11).find(f);
                    if(p2==null)
                        System.out.println("pair not found");
                    else
                        System.out.println("searched key: "+p2);
                    break;
                case 4:for(int i=0;i<11;i++)
                {
                    System.out.println("Sorted chain at bucket is");
                    ht.get(i).display();
                }
                    break;
                default:System.exit(0);
            }
        }

    }
}
