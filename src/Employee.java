import java.util.*;
class Employee1 implements Comparable<Employee1>
{
    String name;
    int age;
    double income;
    public Employee1(String n,int a,double d)
    {
        name = n;
        age =a;
        income=d;
    }
    public int compareTo(Employee1 o)
    {
        return name.compareTo(o.name);
    }
    public String toString()
    {
        return "Emp name : "+name +"age : "+age+"income : "+income;
    }
}
class Employee
{
    public static void main(String []args)
    {
        TreeSet<Employee1> A = new TreeSet<>();
        TreeSet<Employee1> B =new TreeSet<>();
        TreeSet<Employee1> C=new TreeSet<>();
        A.add(new Employee1("xyz",65,2000));
        A.add(new Employee1("abc",36,7000));
        A.add(new Employee1("mnl",70,11000));
        A.add(new Employee1("def",45,4000));
        for(Employee1 x:A)
        {
            if(x.age>60)
                B.add(x);
            if(x.income<5000)
                C.add(x);
        }

        System.out.println("A : "+A);
        System.out.println("B : "+B);
        System.out.println("C : "+C);
        B.retainAll(C);
        System.out.println("B int C: "+B);
    }

}