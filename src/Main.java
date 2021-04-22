import java.lang.Math.*;
import java.util.Scanner;
public class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String[] r= s.split("",n);
        String s1 = sc.nextLine();
        String[] m= s1.split("",n);
        int count = 0;
        for(int i=0;i<n;i++) {
            if (r[i].equals(m[i])) {
                count = count + 1;
                // System.out.println(count);
            } else {
                count = count - 1;
                //System.out.println(count);
            }

        }
        System.out.print(Math.abs(count));
    }
}
