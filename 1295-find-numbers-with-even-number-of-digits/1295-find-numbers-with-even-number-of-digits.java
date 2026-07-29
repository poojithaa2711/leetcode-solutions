class Solution {
    public int findNumbers(int[] nums) {
        int answer = 0;
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int count = 0;
            while(num > 0){
               int digit =  num / 10 ;
                count++;
                num = digit;
                
                }
                if(count%2 == 0){
                    answer++;
            }
        }
        return answer;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna