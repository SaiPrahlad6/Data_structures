import java.util.Scanner;

public class Codechef {
    public static void main(String args[]) {


        /* package codechef; // don't place package name! */


        /* Name of the class has to be "Main" only if the class is public. */

        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String a = sc.next();
            double c = 0;
            for (int i = 0; i < n; i++) {
                if (a.charAt(i) == '1') {
                    c += 1;
                }
            }
            c = c + 70;
            c = c / 120;
            if (c * 100 >= 75.00) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
