
class Solution {
    int getSecondLargest(int arr[]) {
        int f = -1; 
        int s = -1; 

        for (int num : arr) {
            if (num > f) {
                s = f;
                f = num;
            } else if (num < f && num > s) {
                s = num;
            }
        }

        return s;
    }
}
