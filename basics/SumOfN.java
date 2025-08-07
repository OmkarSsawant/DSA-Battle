
import java.util.Scanner;



class  SumOfN{

    public static int sumOfN(int n){
        if(n==0)
            return 0;
        return n+sumOfN(--n);
    }
    public static void main(String[] args) {
           try(Scanner sc= new Scanner(System.in)){
                System.out.println("son: " + sumOfN(sc.nextInt()));
           }
    }
    
}