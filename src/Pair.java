
// replacements in a string to
// make adjacent characters unequal
import java.util.*;

    class Pair{

        // Function which counts the minimum
// number of required operations
        static int[] count_minimum(String[] a)
        {
            int[] an = new int[0];
            for(int k=0;k<a.length;k++) {
                // n stores the length of the string s
                int n = a[k].length();

                // ans will store the required ans
                int ans = 0;

                // i is the current index in the string
                int i = 0;

                while (i < n) {
                    int j = i;

                    // Move j until characters s[i] & s[j]
                    // are equal or the end of the
                    // string is reached
                    while (j < n && a[k].charAt(j) ==
                            a[k].charAt(i)) {
                        j++;
                    }

                    // diff stores the length of the
                    // substring such that all the
                    // characters are equal in it
                    int diff = j - i;

                    // We need atleast diff/2 operations
                    // for this substring
                    ans += diff / 2;
                    i = j;
                }
                an[i] = (ans);
            }
            return an;
        }

        // Driver code
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int n = 3;
            String[] a= new String[]{"add", "boook", "bread"};
        }

    }

// This code is contributed by offbeat


