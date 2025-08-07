package idfc_first;


public class SortByDiff {

    static void sortedByDiff(int[] a,int m){
        int[] diff = new int[a.length];

        for(int i=0;i<a.length;i++){
            diff[i] = Math.abs(a[i]-m);
        }

        

        for (int i = 0; i < diff.length; i++) {
            int minI = i;
            for (int j = i+1; j < diff.length; j++) {
                if(diff[j]< diff[minI]){
                    minI = j;
                }
            }
            //swap with smallest element

            //for diff
            int tmp = diff[i];
            diff[i] = diff[minI];
            diff[minI] = tmp;

            //for a
            tmp = a[i];
            a[i] = a[minI];
            a[minI] = tmp; 
            

        }

        System.out.println("-----------------DIFF: -------------" );
        for(int i=0;i<a.length;i++){
            System.out.println(diff[i]);
        }
        System.out.println("-".repeat(50));

        System.out.println("--------------------- A ---------------");
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        System.out.println("-".repeat(50));
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};

        int x = 6;
        sortedByDiff(arr,x);



    }
}