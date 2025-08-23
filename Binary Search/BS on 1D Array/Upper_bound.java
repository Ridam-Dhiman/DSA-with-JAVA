class Upper_bound{
    public static void main(String args[]){
        int arr[] = {1, 2, 2, 3, 5};
        int target = 2;
        optimal(arr, 0, arr.length-1, target);
        // System.out.println(lowerBound(arr, target));
    }

    public static void brute(int arr[], int t){
        int n = arr.length;
        int idx = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] > t){
                idx = i;
                break;
            }
        }
        System.out.println("Index :" + idx);
    }

    public static void optimal(int arr[], int l, int h, int t){
        // int m = (l + h)/2;
        int ans = -1;
        while(l <= h){
            int m = (l + h)/2;
            if(arr[m] > t){
                ans = m;
                h = m - 1; // search in the left half
            }else{
                l = m + 1; // search in the right half
            }
        }
        System.out.println("Index :" + ans);
    }
}