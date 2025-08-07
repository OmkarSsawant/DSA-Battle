
import java.util.Scanner;



class Solution{
    public static void main(String[] args) {
      try(Scanner sc =  new Scanner(System.in)){
        int n = sc.nextInt();
        boolean prime=true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0){
                prime=false;
                break;
            }
        }
        System.out.println(prime ? "It's a prime": "Not Prime");
      }        
    }
}



