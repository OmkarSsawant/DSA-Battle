import java.math.BigInteger;
import java.util.*;

public class ReverseInt {


    public static int reverse(int n){
        int digits=0;
        boolean negFlag=n<0;
        int mn=n;
        if(negFlag) mn*=-1;
        int nn = mn;
        while (nn > 0) {
            digits++;
            nn/=10;
        }
        int ans=0;
        int nc = mn;
        int ds = digits;
        while (nc > 0) {
            int ld = nc % 10;
            ds-=1;
            int unitSpace =  (int) Math.pow(10, ds);   
            int nPreNum = ld * unitSpace;
            int fd = nPreNum / unitSpace;
           // System.out.println("ld: "+ ld + " fd: "+fd);
            ans+=nPreNum;
            nc/=10;
            if(fd!=ld) return 0;        
        }
         ans =   negFlag ?  ans * -1 : ans;
        return (n < 0 && ans<0) ? ans : (n>0 && ans> 0 ) ? ans : 0; 
    }

    public static void main(String[] args) {
        System.out.println(reverse(234545499));
    }
    
}
