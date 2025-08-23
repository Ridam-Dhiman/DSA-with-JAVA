class Peak_element{
    public static void main(String args[]){
        // System.out.println("hello");
        int arr[] = {1, 10, 13, 7, 6, 5, 4, 3};
        optimal(arr);
    }
    public static void brute(int arr[]){
        int ans = -1;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if((i == 0 || arr[i] > arr[i-1]) && (i == n-1 || arr[i] > arr[i+1])){
                ans = arr[i];
                break;
            }
        }
        System.out.println(ans);
    }

    // Single peak is present
    public static void optimal(int arr[]){
        int n = arr.length;
        int ans = -1;
        if(n == 1) ans = arr[0];
        else if(arr[n-1] > arr[n-2]) ans = arr[n-1];
        else{
            int l = 1, h = n-2;
            while(l <= h){
                int m = (l+h)/2;
                if(arr[m] > arr[m-1] && arr[m] > arr[m+1]){ 
                    ans = arr[m];
                    break;
                }else if(arr[m] > arr[m-1]) l = m+1;
                else h = m-1;
            }
        System.out.println(ans);
        }
    }
}