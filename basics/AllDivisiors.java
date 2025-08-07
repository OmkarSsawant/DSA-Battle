
import java.util.Arrays;
import java.util.Scanner;

public class AllDivisiors {

  public static  void __printDivisors(int n){
    double sqrt = Math.sqrt(n);
    boolean flag=false;
    StringBuilder sb  = new StringBuilder();
    for (int i = 1; i <= n/2; i++) {
       if(n%i==0){
        flag=true;
        sb.append(i).append(" ");
       }     
       if(i>sqrt && !flag)break;
    }
    System.out.print(sb.toString());
    System.out.print(n);
    }

public static  void printDivisors(int n){
   if(n==1){
            System.out.print(n);
            return;
        }
         double sqrt = Math.sqrt(n);
    boolean flag=false;
  int size = (int ) Math.ceil(sqrt);
    int[] mm = new int[size*2];
    for (int i = 1; i <= sqrt; i++) {
       if(n%i==0){
        flag=true;
        int y =n /i;
        mm[i] = y;
       }     
       if(i>sqrt && !flag)break;
    }

System.out.println("mm"+Arrays.toString(mm));

if(!flag){
  System.out.print("1 "+n);
  return;
}
    int[] sortedMM = new int[size*2];

int k=0;
for (int i = 1; i <= sqrt; i++) 
   {
    if(mm[i]!=0){
     
      sortedMM[k] = i;
      k++; 
    }
   }

   for (int i = 1; i < sqrt; i++) 
   {
    if(mm[i]!=0){
      //System.out.print(mm[i] + " ");
      sortedMM[k] = mm[i];
      k++;
    }
   }

Arrays.sort(sortedMM);
System.out.println("smm:"+Arrays.toString(sortedMM));

for (int i = sortedMM.length-k; i <sortedMM.length; i++) {
    System.out.print(sortedMM[i]+ " ");
}



    }


        public static void main(String[] args) {
          try(Scanner sc= new Scanner(System.in)){
    printDivisors(sc.nextInt());       
          }
        }
}
