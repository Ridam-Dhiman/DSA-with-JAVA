class Max_product{
    public static void main(String args[]){
        int nums[] = {2, 3, -2, 4};
        optimal(nums);
    }
    public static void brute(int arr[]){
        int n = arr.length;
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int p = 1;
                for(int k = i; k <= j; k++){
                    p *= arr[k];
                }
                ans = Math.max(ans, p);
            }
        }
        System.out.println(ans);
    }
    public static void better(int arr[]){
        int n = arr.length;
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            int p = arr[i];
            for(int j = i+1; j < n; j++){
                p *= arr[j];
                ans = Math.max(ans, p);
            }
            ans = Math.max(ans, p);
        }
        System.out.println(ans);
    }
    
    public static void optimal(int arr[]){
        int preFix = 1;
        int sufFix = 1;
        int n = arr.length;
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(preFix == 0) preFix = 1;
            if(sufFix == 0) sufFix = 1;
            preFix *= arr[i];
            sufFix *= arr[n-i-1];
            int val = Math.max(sufFix, preFix);
            ans = Math.max(ans, val);
        }
        System.out.println(ans);
    }
}