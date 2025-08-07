import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


class HighLowFreq{


     static void printHL(int[] a){
        HashMap<Integer,Integer> hs = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
                hs.put(a[i], hs.getOrDefault(a[i], 0)+1);
        }

        int low=0,high = 0;
        int minCount = Integer.MAX_VALUE;
        int maxCount= Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> e: hs.entrySet()){
            if( e.getValue() < minCount){
                minCount = e.getValue();
                low = e.getKey();
            }
            if(e.getValue() > maxCount) {
                maxCount = e.getValue();
                high = e.getKey();
            }
        }

        System.out.println(low+" "+high);
    }

static HashSet<Integer> toHashSet(int[] a){
    HashSet r = new HashSet<Integer>();
    for (int i = 0; i < a.length; i++) {
        r.add(a[i]);
    }
    return r;
}

      static void printCountHL(int[] a){
         int low=0,high = 0;
        int minCount = Integer.MAX_VALUE;
        int maxCount= Integer.MIN_VALUE;
        List<Integer> s = List.copyOf(toHashSet(a));
        for (int i = 0; i < s.size(); i++) {
            int count=1;
        for (int j = 0; j < a.length; j++) {
            if(i==j) continue;
            if(s.get(i).equals(a[j])){
                count++;
            }
        }
        if( count < minCount){
                minCount = count;
                low = s.get(i);
            }
             if( count > maxCount){
                maxCount = count;
                high = s.get(i);
            }
        }
        System.out.println(low+" "+high);

    }


    public static void main(String[] args){
        try(Scanner sc= new Scanner(System.in)){
              int[] a =   Arrays.asList(sc.nextLine().split("\\s+")).stream() 
            .mapToInt((String x) ->  Integer.valueOf(x) ).toArray();
            printCountHL( a);
    }
}
}