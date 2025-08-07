
import java.util.*;


class Count{


    static void printCount(Integer[] a){
        List<Integer> s = List.copyOf(new HashSet(Arrays.asList(a)));
        for (int i = 0; i < s.size(); i++) {
            int count=1;
        for (int j = 0; j < a.length; j++) {
            if(i==j) continue;
            if(s.get(i).equals(a[j])){
                count++;
            }
        }
        System.out.println(a[i]+":"+count);
        }
    }


    static void printCount(int[] a){
        HashMap<Integer,Integer> hs = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
                hs.put(a[i], hs.getOrDefault(a[i], 0)+1);
        }

        for(Map.Entry<Integer,Integer> e: hs.entrySet()){
            System.out.println(e.getKey()+":"+e.getValue());
        }
    }


    public static void main(String[] args){
        try(Scanner sc= new Scanner(System.in)){
             int[] a =   Arrays.asList(sc.nextLine().split("\\s+")).stream() 
            .mapToInt((String x) ->  Integer.valueOf(x) ).toArray();
            printCount( a);
    }
}
}