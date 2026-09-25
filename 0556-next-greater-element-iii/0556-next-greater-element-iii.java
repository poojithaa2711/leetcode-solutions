class Solution {
    public int nextGreaterElement(int n) {
        char [] digits = String.valueOf(n).toCharArray();
        int i = digits.length - 2;
        while(i >= 0 && digits[i] >= digits[i+1]){
            i--;
        }
        if(i < 0){
            return -1;
        }
        int j = digits.length - 1;
        while(digits[j] <= digits[i]){
            j--;
        }
            char temp = digits[i];
            digits[i] = digits[j];
            digits[j] = temp;
            
        int left = i + 1;
        int right = digits.length - 1;
        while(left < right){  
            char temp1 = digits[left];
            digits[left] = digits[right];
            digits[right] = temp1;     
            left++;
            right--;
        }

        long result = Long.parseLong( new String(digits));
        if(result > Integer.MAX_VALUE){
            return -1;
        }
        return (int) result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna