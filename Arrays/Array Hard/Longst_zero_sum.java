class Longst_zero_sum{
    public static void main(String args[]){
        int arr[] = {1, 2, -2, 4, -4};
        brute(arr);
    }
    public static void brute(int arr[]){
        int n = arr.length;
        int maxi = 0;
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum += arr[j];
                if(sum == 0){
                    maxi = Math.max(maxi, j-i+1);
                }
            }
        }
        System.out.println(maxi);
    }
    public static void optimal(int arr[]){
        HashMap<Integer, Integer> preSum = new HashMap<>();
        int sum = 0;
        int maxi = 0;
        int n = a.length;
        for(int i = 0; i < n; i++){
            sum += a[i];
            if(sum == k){
                maxi = Math.max(maxi, i+1);
            }

            int rem = sum - k;
            if(preSum.containsKey(rem)){
                int len = i-preSum.get(rem);
                maxi = Math.max(maxi, len);
            }

            // Adding to the map if it doesnot present
            if(!preSum.containsKey(sum)){
                preSum.put(sum, i);
            }
        }
        System.out.print(maxi);
    }
}