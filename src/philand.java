import java.util.Scanner;

public class philand {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if(t<=100 && t>=1){
        int a[]= new int[t];
        for(int i=0;i<t;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<t;i++){
            System.out.printf("%.0f\n",Math.ceil(Math.log(a[i])+1));
        }
    }
        else{
            System.out.println("T not in range");
        }
}
}

