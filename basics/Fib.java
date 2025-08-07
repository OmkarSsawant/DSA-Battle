

class Fib{


   public static void  fib(int n,int p,int nx){
        System.out.print("\t"+p);
        if(p==n) {
            System.out.println("");
            return;
        }
        fib(n, nx, p+nx);
    }
        public static void main(String[] args) {
            fib(5,0,1);
        }
    }