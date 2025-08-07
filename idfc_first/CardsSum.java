package idfc_first;

import java.util.Scanner;//lock


//input ='5 6 J K Q A' //cards
/*values:
 * 2-6 -> 1
 * 7-8->0
 * 9->1
 * 10,J,Q,K,A->-1
 */

//task is to calculate the value si.equals("9" || 


class Solution{
    
    public static int getValue(String s){
       int count=-1;
    
       
        String[] sv =  s.split("\\s+");
        int cp2 = "2".codePointAt(0);
        int cp6 = "6".codePointAt(0);
        for(String si : sv){
        
            if(si.isEmpty() || si.trim().isEmpty()) continue;
           int cpsi = si.codePointAt(0);
            if(si.equals("10")){
                count-=1;                
            }
            else if(si.equals("9") || (cp2 <= cpsi && cpsi <= cp6)){
                count+=1;
            }
            else if(si .equals( "J") || si.equals("Q")|| si.equals("K") || si.equals("A")){
                count-=1;
            }
        }

        return count;
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(getValue(sc.nextLine()));
        }
    }
}



