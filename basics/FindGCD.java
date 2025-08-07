import java.util.*;

public class FindGCD {
 

    public static int findGDC(int n1,int n2 ){
        for(int i=Math.min(n1,n2);i>0;i--){
            if(n1%i==0 && n2%i==0)return i;
        }
        return 0;//will never reach
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();sc.nextLine();

        int n2 = sc.nextInt();sc.nextLine();
        System.out.println(findGDC(n1, n2));
        sc.close(); 
    }
}