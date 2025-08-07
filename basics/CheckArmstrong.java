import java.util.Scanner;

public class CheckArmstrong {


   public static  boolean isArmstring(int n){
       int powSum=0;
       int c=0;
       int nc=n;
       int nc2=n;
       while (nc>0) {
        c++;     
            nc/=10;
        }
        while (nc2>0) {
        powSum+=Math.pow(nc2%10,c);
            nc2/=10;
        }
        //System.out.println(n+ " == "+ powSum);
        return n == powSum;
    }
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println(isArmstring(sc.nextInt()));
        sc.close();
    }
    
}
