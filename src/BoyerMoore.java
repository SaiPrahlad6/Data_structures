import java.util.HashMap;
import java.util.Map;


class BoyerMoore {

    public static void main(String[] args) {
        String pat = "GCAGAGAG";

        String txt = "GCATCGCAGAGAGTATACAGTACG";
        search(pat, txt);
    }


    public static void search(String pat, String txt) {
        Map<Character, Integer> mt = new HashMap<Character, Integer>();
        // Bad character Skip : Boyer Moore Table Construction
        for (int i = 0; i < pat.length(); i++) {
            mt.put(pat.charAt(i), i);
        }
        int skip = 0;
        int N = txt.length();
        int M = pat.length();
        for (int i = 0; i <= N-M; i= i+ skip) {
            skip = 0;
            for (int j = M - 1; j >= 0; j--) {
                if (pat.charAt(j) != txt.charAt(i+j)) {
                    if(mt.get(txt.charAt(i + j))!=null)
                        skip = Math.max(1, j - mt.get(txt.charAt(i + j)));
                    else
                        skip = j+1;
                    break;
                }
            }
            if (skip == 0) {
                // Match found
                System.out.println("Match found at index " + i);
                skip = 1; // go to next character now
            }
        }
    }


    public int search(String txt) {
        String pat = "";
        int R = 256;
        int[] right = new int[R];
        for (int c = 0; c < R; c++)
            right[c] = -1;
        for (int j = 0; j < pat.length(); j++)
            right[pat.charAt(j)] = j;

        int M = pat.length();
        int N = txt.length();
        int skip;
        for (int i = 0; i <= N - M; i += skip) {
            skip = 0;
            for (int j = M - 1; j >= 0; j--) {
                if (pat.charAt(j) != txt.charAt(i + j)) {
                    skip = Math.max(1, j - right[txt.charAt(i + j)]);
                    break;
                }
            }
            if (skip == 0)
                return i; // found
        }
        return N; // not found
    }
}
