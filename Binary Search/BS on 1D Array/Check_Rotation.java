class Check_Rotation{
    public static void main(String args[]){
        int arr[] = {4, 5, 6, 7, 0, 1, 2, 3};
        optimal(arr);
    }
    public static void optimal(int arr[]){
        int n = arr.length;
        int l = 0, h = n-1;
        int ans = Integer.MAX_VALUE;
        int idx = -1;
        while(l <= h){
            int m = (l+h)/2;
            // search space is already sorted
            // then always allow arr[l] as the smallest element in the entire array
            if(arr[l] < arr[h]){
                idx = l;
                ans = Math.min(ans, arr[l]);
                break;
            }
            // This block of code is optional but it also make it's time complexity optimize

            if(arr[l] <= arr[m]){
                idx = l;
                ans = Math.min(ans, arr[l]);
                l = m+1;
            }else{
                idx = m;
                ans = Math.min(ans, arr[m]);
                h = m-1;
            }
        }
        System.out.println(idx);
    }
}