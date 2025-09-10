import java.util.*;




class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        int n = arr.length;
        
        int cand1 = 0, cand2 = 0, c1 = 0, c2 = 0;
        
      
        for (int num : arr) {
            if (num == cand1) {
                c1++;
            } else if (num == cand2) {
                c2++;
            } else if (c1 == 0) {
                cand1 = num;
                c1 = 1;
            } else if (c2 == 0) {
                cand2 = num;
                c2 = 1;
            } else {
                c1--;
                c2--;
            }
        }
        
      
        c1 = 0;
        c2 = 0;
        for (int num : arr) {
            if (num == cand1) c1++;
            else if (num == cand2) c2++;
        }
        
        
        ArrayList<Integer> result = new ArrayList<>();
        if (c1 > n / 3) result.add(cand1);
        if (c2 > n / 3) result.add(cand2);
        
        Collections.sort(result);
        return result;
    }
}
