package h2;
import java.util.Arrays;
public class H2_main {
    public static void main(String[] args) {
        int[] krass = change(new int[]{2, 7, 1, 9}, new int[]{2, 7, 1, 9}, 3, 2);


    }
    public static int[] change(int[] a, int[] b, int start, int end) {

       if(Arrays.compare(a,b)!=0 && end>start){
           int[] neu = Arrays.copyOfRange(a, 0 , a.length);
           return neu;

       }
       if(Arrays.compare(a,b)==0 && end>start){
           Arrays.sort(a);
           int[] neu = Arrays.copyOfRange(a, start , end);
           return neu;
       }
       if(end<=start){
           int[] neu2 = new int[0];
           return neu2;
       }


        return a;
    }
}
