class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> set1 = new HashSet<>();
        HashSet <Integer> set2 = new HashSet<>();
        for(int number:nums1){
                set1.add(number);
        }
        for(int number1:nums2){
            if(set1.contains(number1)){
                set2.add(number1);
        }
                }
            int[] result = new int[set2.size()];
            int i = 0;
            for(int number2:set2){
                result[i] = number2;
                i++;
            }
            return result;
            }
            }


        
    


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna