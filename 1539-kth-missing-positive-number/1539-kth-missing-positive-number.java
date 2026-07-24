class Solution {
public static int findKthPositive(int[] arr,int k) {
        int expected = 1;
        int i = 0;
        while(k>0)
        {
            if(i<arr.length && arr[i] == expected){
                i++;
            }
            else{
                k--;
                if(k==0)
                return expected;
            }
            expected++;
        }
        return -1;
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna