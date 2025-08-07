
import java.util.Scanner;



class  FactOfN{

    public static int factOfN(int n){
        if(n==1)
            return 1;
        return n*factOfN(--n);
    }
    public static void main(String[] args) {
           try(Scanner sc= new Scanner(System.in)){
                System.out.println("son: " + factOfN(sc.nextInt()));
           }
    }
    
}