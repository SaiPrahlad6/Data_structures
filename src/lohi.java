public class lohi {
    public static  void main(String args[]){
        int n= 5;
        char[] a = new char[]{'A','B','C','D','E'};
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(a[j]);
            }
            System.out.println();
        }
    }
}
