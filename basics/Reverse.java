
import java.util.Arrays;



class Reverse{
   
   static void reverse(int[] a,int s,int e){
        
        if(s>=e){
            return;
        }
        int tmp  = a[s];
        a[s] = a[e];
        a[e] = tmp;
        reverse(a, ++s, --e);
   }
   
    public static void main(String[] args) {
        
        int[] a = new int[]{1,2,3,5};    
        reverse(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));

    }
}