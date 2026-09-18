class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int min = arr[0];
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                 min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
    }
    ArrayList <Integer> List = new ArrayList <> ();
    List.add(min);
    List.add(max);
    return List;
}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna